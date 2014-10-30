package com.github.scakuru

import scala.collection.mutable.HashMap
import scala.collection.mutable.ListBuffer

class Line {
  var sum : Int = 0
  var entries = ListBuffer[Entry]()
  var dir : String = ""
  var solutions = ListBuffer[List[Int]]()

  def solved() : Boolean = {
    entries.forall( (e) => { e.solved() })
  }

  def buildCountMap() : Map[Int,Int] = {
    val counts = HashMap[Int,Int]()
    for( c <- entries ){
      val ps = c.possibles
      for( p <- ps ) {
        counts.get(p) match {
          case Some(i) => { counts.put( p, (i+1))}
          case None => { counts.put( p, (1))}
        }
      }
    }
    counts.toMap
  }

  override def clone() = {
    val copy = new Line()

    copy.sum = sum
    copy.dir = dir
    copy.entries = entries.clone

    copy
  }


  def possibles() : Set[Int] = {

    val remaining = ListBuffer[Int]()

    for( e <- entries ){
      remaining ++= e.possibles
    }

    remaining.toSet

  }
}
