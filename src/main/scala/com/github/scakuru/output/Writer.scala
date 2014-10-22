package com.github.scakuru.output

import com.github.scakuru.{Hint, Entry, Block, Grid}

class Writer {

}


object Writer {
  def printPossibles(grid : Grid) = {

    for( y <- 0 until grid.Y ) {
      for( x <- 0 until grid.X ) {

        grid.cells(x)(y) match {
          case e : Entry => {
            Console.println( "("+ x +","+ y+") => " + e.possibles.mkString(",")  )
          }
          case _ => { }
        }

      }
    }

  }


  def print( grid : Grid ) = {

    var out = grid.X +","+ grid.Y +";"


    for( y <- 0 until grid.Y ){
      val cells = for( x <- 0 until grid.X ) yield {
        grid.cells(x)(y) match {
          case b : Block => { "B" }
          case e : Entry => { "." }
          case h : Hint => { printHint( h ) }
          case _ => { "" }
        }
      }
      out += cells.mkString(",")
      out += ";"
    }

    Console.println(out)

  }

  def printHint( hint : Hint ) : String = {
    hint.clues.mkString(":")
  }
}
