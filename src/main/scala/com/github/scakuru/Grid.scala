package com.github.scakuru

import com.github.scakuru.table.HintsTable

import scala.collection.mutable.ListBuffer

class Grid( val X : Int, val Y : Int ) {

  val cells = Array.fill( X, Y ){ new Cell() }

  var lines = ListBuffer[Line]()

  def entries() : List[Entry] = {

    val flat = cells.flatten.toList

    val opts = flat.map( (c) => {
      c match {
        case e : Entry => { Some(e) }
        case _ => { None }
      }
    })

    opts.flatten

  }

  def solved() : Boolean = {
    entries().forall( (e) => { e.solved() })
  }

  def buildLines() = {

    for( y <- 0 until Y ){
      for( x <- 0 until X ){
        cells(x)(y) match {
          case h : Hint => { followHints(h,x,y)}
          case _ => {}
        }
      }
    }

  }

  def followHints( hint : Hint,  x : Int, y : Int ) = {
    hint.clues.foreach( (c) => followClue(x,y,c) )
  }

  def followClue( x : Int, y : Int, clue : Clue ) = {
    val mask = clue.direction.head match {
      case 'R' => (1,0)
      case 'D' => (0,1)
    }

    val newLine = new Line()
    newLine.entries ++= followLine( (x+mask._1), (y+mask._2), mask, List() )
    newLine.sum = clue.sum
    newLine.dir = clue.direction
    newLine.solutions ++= HintsTable.hintsBySum()(newLine.sum)(newLine.entries.length)

    lines += newLine
  }

  def followLine( x : Int, y : Int, direction : (Int,Int), accum : List[Entry] ) : List[Entry] = {

    if( x >= X || y >= Y ){ accum }
    else {
      cells(x)(y) match {
        case e : Entry => {
          followLine( (x + direction._1), (y + direction._2), direction, ( accum :+ e ))
        }
        case _ => {accum}
      }
    }
  }


  override def clone() = {

    val copy = new Grid(X,Y)

      for( y <- 0 until Y ) {
        for( x <- 0 until X ) {
          copy.cells(x)(y) = cells(x)(y).clone
        }
      }

    copy.lines = lines.clone()

    copy
  }

}
