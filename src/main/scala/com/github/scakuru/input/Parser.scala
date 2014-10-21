package com.github.scakuru.input

import com.github.scakuru._
import com.github.scakuru.output.Writer
import org.apache.commons.lang3.StringUtils

class Parser {

}

object Parser {

  val example =
    """
      8,10;
      b,b,D22,D16,D3,D10,D25,b;
      b,D5:L17,.,.,.,.,.,D12;
      L41,.,.,.,.,.,.,.;
      L4,.,.,D34,D14,D16:L8,.,.;
      b,D3:L15,.,.,.,.,.,D15;
      L41,.,.,.,.,.,.,.;
      L29,.,.,.,.,.,.,.;
      b,D11,D5:L12,.,.,.D9,D11;
      L9,.,.,.L19,.,.,.;
      L13,.,.,b,b,L3,.,.;
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
      case 'L' => { parseHints(s) }
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
    val g = parse(example)

    Writer.print(g)
  }
}
