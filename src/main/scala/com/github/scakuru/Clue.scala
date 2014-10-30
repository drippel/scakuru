package com.github.scakuru

class Clue( val direction : String, val sum : Int ){

  override def toString() = { direction + sum }

  override def clone() = {
    new Clue( direction, sum )
  }
}
