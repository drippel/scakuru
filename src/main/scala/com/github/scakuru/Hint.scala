package com.github.scakuru

import scala.collection.mutable.ListBuffer

class Hint extends Cell {
  var clues = ListBuffer[Clue]()

  override def clone() = {
    val copy = new Hint
    copy.clues = clues.clone()
    copy
  }
}
