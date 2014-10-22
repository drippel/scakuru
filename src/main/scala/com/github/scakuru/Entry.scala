package com.github.scakuru

import scala.collection.mutable.ListBuffer

class Entry extends Cell {
  var possibles = ListBuffer(1,2,3,4,5,6,7,8,9)

  def solved() : Boolean = { possibles.length == 1 }

  def keep( toKeep : Set[Int] ) : Int = {
    val parts = possibles.partition( (i) => { toKeep.contains(i)} )
    possibles = parts._1
    parts._2.length
  }

  def eliminate( i : Int ) = { possibles -= i  }

  def value() : Int = {
    if( solved() ){ possibles.head }
    else{ -1 }
  }
}
