package com.github.scakuru.input

import com.github.scakuru._
import com.github.scakuru.output.Writer
import com.github.scakuru.table.HintsTable
import org.apache.commons.lang3.StringUtils

import scala.collection.mutable.ListBuffer

class Parser {

}

object Parser {

  val example =
    """
      8,8;
      B,D23,D30,B,B,D27,D12,D16;
      R16,.,.,B,D17:R24,.,.,.;
      R17,.,.,D15:R29,.,.,.,.;
      R35,.,.,.,.,.,D12;
      B,R7,.,.,D7:R8,.,.,D7;
      B,D11,D10:R16,.,.,.,.,.;
      R21,.,.,.,.,R5,.,.;
      R6,.,.,.,B,R3,.,.;
    """

  val example2 =
    """
      9,9;
      B,D9,D36,D26,D7,B,D7,D36,B;
      R18,.,.,.,.,R4,.,.,B;
      R30,.,.,.,.,D19:R7,.,.,D12;
      B,R9,.,.,D20:R10,.,.,.,.;
      B,D4:R14,.,.,.,.,D24:R17,.,.;
      R9,.,.,D18:R20,.,.,.,.,B;
      R16,.,.,.,.,D4:R12,.,.,D6;
      B,R14,.,.,R21,.,.,.,.;
      B,R10,.,.,R17,.,.,.,.;
    """

  def parseHints( s : String) : Cell = {

    val hint = new Hint()

    val clues = StringUtils.split(s,":")
    for( clue <- clues ){

      val dir = clue.charAt(0).toString
      val size = clue.substring(1)

      hint.clues += new Clue(dir,size.toInt)

    }

    hint

  }

  def parseCell( s : String ) : Cell = {

    s.charAt(0) match {
      case 'B' => { new Block() }
      case '.' => { new Entry() }
      case 'R' => { parseHints(s) }
      case 'D' => { parseHints(s) }
    }


  }

  def parseLines(grid : Grid, lines : Array[String]) = {
    for( y <- 0 until lines.length ){

      val fields = StringUtils.split( lines(y).trim(), "," )

      for( x <- 0 until fields.length ){

        grid.cells(x)(y) = parseCell( fields(x).trim() )
      }
    }
  }

  def parse( input : String ) = {

    val stripped = input.trim.toUpperCase
    val lines = StringUtils.split( stripped, ";")
    val dims = StringUtils.split( lines.head, "," )

    val grid = new Grid( dims(0).toInt, dims(1).toInt )

    parseLines( grid, lines.tail )

    grid

  }

  def main (args : Array[String]) {
    val g = parse(example2)

    // Writer.print(g)

    g.buildLines()

    reduce(g)

    // Writer.printPossibles(g)

    // Writer.printLines(g)

  }

  type reducer = (Line) => Int

  val reducers = ListBuffer[reducer]( simpleReduce, solutionReducer, solvedReduce, uniqueReducer, tableReducer )


  def reduce( grid : Grid ) : Int = {

    var count = 0
    var eliminated = 1
    while( eliminated > 0 ){
      eliminated = reducers.foldLeft(0)(
        (i,h) => {
          if( i == 0 ){
            applyReducer( grid, h )
          }
          else {
            i
          }
        })

      count += eliminated
    }

    count
  }

  def applyReducer( grid : Grid, f : reducer ) : Int = {
    grid.lines.foldRight(0)( (l,b) => {
      b + f(l)
    })
  }

  def simpleReduce( line : Line ) : Int = {

    val uniqueHints = line.solutions.flatten.toSet

    line.entries.foldLeft(0)(
      (i,e) => {
        i + e.keep(uniqueHints)
      }
    )
  }

  def solvedReduce( line : Line ) : Int = {

    val (solved,unsolved) = line.entries.partition( _.solved() )

      var count = 0

      for( s <- solved ) {
        for( u <- unsolved if (u.possibles.contains(s.value())) ) {
          count += 1
          u.eliminate(s.value)
        }
      }

      count

  }


  def tableReducer( line : Line ) : Int = {

    // get all the possibles

    val (solved,unsolved) = line.entries.partition( _.solved() )
    if( !solved.isEmpty && !unsolved.isEmpty ) {
      val solvedValues = solved.map(_.value())

      val possibleSolutions = line.solutions.filter((l) => {
        solvedValues.forall((i) => {
          l.contains(i)
        })
      })

      val solvedValueSet = solvedValues.toSet
      val possibleSolutionsSet = possibleSolutions.flatten.toSet

      val diff = possibleSolutionsSet.diff(solvedValueSet)

      var count = 0
      for( u <- unsolved if( u.possibles.exists((i) => { !diff.contains(i)})) ){
        u.keep(diff)
        count += 1
      }

      count
    }
    else { 0 }

  }

  def solutionReducer( line : Line ) : Int = {

    // get all the remaining possibles for the line
    val possibles = line.possibles

    // make sure that each remaining solution is a set or subset of possibles
    val (validSols,invalidSols) = line.solutions.partition( (sol) => { sol.toSet.subsetOf(possibles) })

    line.solutions = validSols

    invalidSols.length

  }


  def uniqueReducer( line : Line ) : Int = {

    var count = 0

    if( !line.solved() ){

      if( line.solutions.length == 1 ){

        val counts = line.buildCountMap()

        val singles = counts.filter( (t) => { t._2 == 1 } )

        for( single <- singles ){

          // find the entry that still has the number
          val entry = line.entries.filter( (e) => { e.possibles.contains(single._1)}).head


          count += entry.keep( Set(single._1) )

        }
      }
    }

    count
  }
}
