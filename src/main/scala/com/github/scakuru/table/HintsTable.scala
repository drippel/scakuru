package com.github.scakuru.table

import scala.collection.mutable.HashMap

class HintsTable {}

object HintsTable {


  // 2 Digit Combinations
  def twos() : HashMap[Int,List[List[Int]]] = {
    val map = HashMap[Int, List[List[Int]]]()
    map.put(3, List(List(1, 2)))
    map.put(4, List(List(1, 3)))
    map.put(5, List(List(1, 4), List(2, 3)))
    map.put(6, List(List(1, 5), List(2, 4)))
    map.put(7, List(List(1, 6), List(2, 5), List(3, 4)))
    map.put(8, List(List(1, 7), List(2, 6), List(3, 5)))
    map.put(9, List(List(1, 8), List(2, 7), List(3, 6), List(4, 5)))
    map.put(10, List(List(1, 9), List(2, 8), List(3, 7), List(4, 6)))
    map.put(11, List(List(2, 9), List(3, 8), List(4, 7), List(5, 6)))
    map.put(12, List(List(3, 9), List(4, 8), List(5, 7)))
    map.put(13, List(List(4, 9), List(5, 8), List(6, 7)))
    map.put(14, List(List(5, 9), List(6, 8)))
    map.put(15, List(List(6, 9), List(7, 8)))
    map.put(16, List(List(7, 9)))
    map.put(17, List(List(8, 9)))
    map
  }


  // 3 Digit Combinations
  def threes() = {
    val map = HashMap[Int, List[List[Int]]]()
    map.put(6, List(List(1, 2, 3)))
    map.put(7, List(List(1, 2, 4)))
    map.put(8, List(List(1, 2, 5), List(1, 3, 4)))
    map.put(9, List(List(1, 2, 6), List(1, 3, 5), List(2, 3, 4)))
    map.put(10, List(List(1, 2, 7), List(1, 3, 6), List(1, 4, 5), List(2, 3, 5)))
    map.put(11, List(List(1, 2, 8), List(1, 3, 7), List(1, 4, 6), List(2, 3, 6), List(2, 4, 5)))
    map.put(12, List(List(1, 2, 9), List(1, 3, 8), List(1, 4, 7), List(1, 5, 6), List(2, 3, 7), List(2, 4, 6), List(3, 4, 5)))
    map.put(13, List(List(1, 3, 9), List(1, 4, 8), List(1, 5, 7), List(2, 3, 8), List(2, 4, 7), List(2, 5, 6), List(3, 4, 6)))
    map.put(14, List(List(1, 5, 8), List(2, 4, 8), List(3, 5, 6), List(1, 6, 7), List(2, 5, 7), List(1, 4, 9), List(2, 3, 9), List(3, 4, 7)))
    map.put(15, List(List(2, 4, 9), List(3, 4, 8), List(1, 6, 8), List(2, 6, 7), List(4, 5, 6), List(1, 5, 9), List(2, 5, 8), List(3, 5, 7)))
    map.put(16, List(List(1, 6, 9), List(2, 6, 8), List(3, 6, 7), List(1, 7, 8), List(3, 4, 9), List(4, 5, 7), List(2, 5, 9), List(3, 5, 8)))
    map.put(17, List(List(1, 7, 9), List(3, 5, 9), List(4, 6, 7), List(2, 6, 9), List(3, 6, 8), List(2, 7, 8), List(4, 5, 8)))
    map.put(18, List(List(1, 8, 9), List(3, 7, 8), List(5, 6, 7), List(2, 7, 9), List(3, 6, 9), List(4, 5, 9), List(4, 6, 8)))
    map.put(19, List(List(2, 8, 9), List(4, 7, 8), List(3, 7, 9), List(4, 6, 9), List(5, 6, 8)))
    map.put(20, List(List(3, 8, 9), List(5, 7, 8), List(4, 7, 9), List(5, 6, 9)))
    map.put(21, List(List(4, 8, 9), List(5, 7, 9), List(6, 7, 8)))
    map.put(22, List(List(5, 8, 9), List(6, 7, 9)))
    map.put(23, List(List(6, 8, 9)))
    map.put(24, List(List(7, 8, 9)))
    map
  }


  // 4 Digit Combinations
  def fours = {
    val map = HashMap[Int, List[List[Int]]]()
    map.put(10, List(List(1, 2, 3, 4)))
    map.put(11, List(List(1, 2, 3, 5)))
    map.put(12, List(List(1, 2, 3, 6), List(1, 2, 4, 5)))
    map.put(13, List(List(1, 2, 3, 7), List(1, 2, 4, 6), List(1, 3, 4, 5)))
    map.put(14, List(List(1, 2, 3, 8), List(1, 2, 4, 7), List(1, 2, 5, 6), List(1, 3, 4, 6), List(2, 3, 4, 5)))
    map.put(15, List(List(1, 2, 3, 9), List(1, 2, 4, 8), List(1, 2, 5, 7), List(1, 3, 4, 7), List(1, 3, 5, 6), List(2, 3, 4, 6)))
    map.put(16, List(List(1, 2, 4, 9), List(1, 2, 5, 8), List(1, 2, 6, 7), List(1, 3, 4, 8), List(1, 3, 5, 7), List(1, 4, 5, 6), List(2, 3, 4, 7), List(2, 3, 5, 6)))
    map.put(17, List(List(1, 2, 5, 9), List(1, 2, 6, 8), List(1, 3, 4, 9), List(1, 3, 5, 8), List(1, 3, 6, 7), List(1, 4, 5, 7), List(2, 3, 4, 8), List(2, 3, 5, 7), List(2, 4, 5, 6)))
    map.put(18, List(List(1, 2, 6, 9), List(1, 2, 7, 8), List(1, 3, 5, 9), List(1, 3, 6, 8), List(1, 4, 5, 8), List(1, 4, 6, 7), List(2, 3, 4, 9), List(2, 3, 5, 8), List(2, 3, 6, 7), List(2, 4, 5, 7), List(3, 4, 5, 6)))
    map.put(19, List(List(1, 2, 7, 9), List(1, 3, 6, 9), List(1, 3, 7, 8), List(1, 4, 5, 9), List(1, 4, 6, 8), List(1, 5, 6, 7), List(2, 3, 5, 9), List(2, 3, 6, 8), List(2, 4, 5, 8), List(2, 4, 6, 7), List(3, 4, 5, 7)))
    map.put(20, List(List(1, 2, 8, 9), List(1, 3, 7, 9), List(1, 4, 6, 9), List(1, 4, 7, 8), List(1, 5, 6, 8), List(2, 3, 6, 9), List(2, 3, 7, 8), List(2, 4, 5, 9), List(2, 4, 6, 8), List(2, 5, 6, 7), List(3, 4, 5, 8), List(3, 4, 6, 7)))
    map.put(21, List(List(1, 3, 8, 9), List(1, 4, 7, 9), List(1, 5, 6, 9), List(1, 5, 7, 8), List(2, 3, 7, 9), List(2, 4, 6, 9), List(2, 4, 7, 8), List(2, 5, 6, 8), List(3, 4, 5, 9), List(3, 4, 6, 8), List(3, 5, 6, 7)))
    map.put(22, List(List(1, 4, 8, 9), List(1, 5, 7, 9), List(1, 6, 7, 8), List(2, 3, 8, 9), List(2, 4, 7, 9), List(2, 5, 6, 9), List(2, 5, 7, 8), List(3, 4, 6, 9), List(3, 4, 7, 8), List(3, 5, 6, 8), List(4, 5, 6, 7)))
    map.put(23, List(List(1, 5, 8, 9), List(1, 6, 7, 9), List(2, 4, 8, 9), List(2, 5, 7, 9), List(2, 6, 7, 8), List(3, 4, 7, 9), List(3, 5, 6, 9), List(3, 5, 7, 8), List(4, 5, 6, 8)))
    map.put(24, List(List(1, 6, 8, 9), List(2, 5, 8, 9), List(2, 6, 7, 9), List(3, 4, 8, 9), List(3, 5, 7, 9), List(3, 6, 7, 8), List(4, 5, 6, 9), List(4, 5, 7, 8)))
    map.put(25, List(List(1, 7, 8, 9), List(2, 6, 8, 9), List(3, 5, 8, 9), List(3, 6, 7, 9), List(4, 5, 7, 9), List(4, 6, 7, 8)))
    map.put(26, List(List(2, 7, 8, 9), List(3, 6, 8, 9), List(4, 5, 8, 9), List(4, 6, 7, 9), List(5, 6, 7, 8)))
    map.put(27, List(List(3, 7, 8, 9), List(4, 6, 8, 9), List(5, 6, 7, 9)))
    map.put(28, List(List(4, 7, 8, 9), List(5, 6, 8, 9)))
    map.put(29, List(List(5, 7, 8, 9)))
    map.put(30, List(List(6, 7, 8, 9)))
    map
  }


  //  5 Digit Combinations
  def fives = {
    val map = HashMap[Int, List[List[Int]]]()
    map.put(15, List(List(1, 2, 3, 4, 5)))
    map.put(16, List(List(1, 2, 3, 4, 6)))
    map.put(17, List(List(1, 2, 3, 4, 7), List(1, 2, 3, 5, 6)))
    map.put(18, List(List(1, 2, 3, 4, 8), List(1, 2, 3, 5, 7), List(1, 2, 4, 5, 6)))
    map.put(19, List(List(1, 2, 3, 4, 9), List(1, 2, 3, 5, 8), List(1, 2, 3, 6, 7), List(1, 2, 4, 5, 7), List(1, 3, 4, 5, 6)))
    map.put(20, List(List(1, 2, 3, 5, 9), List(1, 2, 3, 6, 8), List(1, 2, 4, 5, 8), List(1, 2, 4, 6, 7), List(1, 3, 4, 5, 7), List(2, 3, 4, 5, 6)))
    map.put(21, List(List(1, 2, 3, 6, 9), List(1, 2, 3, 7, 8), List(1, 2, 4, 5, 9), List(1, 2, 4, 6, 8), List(1, 2, 5, 6, 7), List(1, 3, 4, 5, 8), List(1, 3, 4, 6, 7), List(2, 3, 4, 5, 7)))
    map.put(22, List(List(1, 2, 3, 7, 9), List(1, 2, 4, 6, 9), List(1, 2, 4, 7, 8), List(1, 2, 5, 6, 8), List(1, 3, 4, 5, 9), List(1, 3, 4, 6, 8), List(1, 3, 5, 6, 7), List(2, 3, 4, 5, 8), List(2, 3, 4, 6, 7)))
    map.put(23, List(List(1, 2, 3, 8, 9), List(1, 2, 4, 7, 9), List(1, 2, 5, 6, 9), List(1, 2, 5, 7, 8), List(1, 3, 4, 6, 9), List(1, 3, 4, 7, 8), List(1, 3, 5, 6, 8), List(1, 4, 5, 6, 7), List(2, 3, 4, 5, 9), List(2, 3, 4, 6, 8), List(2, 3, 5, 6, 7)))
    map.put(24, List(List(1, 2, 4, 8, 9), List(1, 2, 5, 7, 9), List(1, 2, 6, 7, 8), List(1, 3, 4, 7, 9), List(1, 3, 5, 6, 9), List(1, 3, 5, 7, 8), List(1, 4, 5, 6, 8), List(2, 3, 4, 6, 9), List(2, 3, 4, 7, 8), List(2, 3, 5, 6, 8), List(2, 4, 5, 6, 7)))
    map.put(25, List(List(1, 2, 5, 8, 9), List(1, 2, 6, 7, 9), List(1, 3, 4, 8, 9), List(1, 3, 5, 7, 9), List(1, 3, 6, 7, 8), List(1, 4, 5, 6, 9), List(1, 4, 5, 7, 8), List(2, 3, 4, 7, 9), List(2, 3, 5, 6, 9), List(2, 3, 5, 7, 8), List(2, 4, 5, 6, 8), List(3, 4, 5, 6, 7)))
    map.put(26, List(List(1, 2, 6, 8, 9), List(1, 3, 5, 8, 9), List(1, 3, 6, 7, 9), List(1, 4, 5, 7, 9), List(1, 4, 6, 7, 8), List(2, 3, 4, 8, 9), List(2, 3, 5, 7, 9), List(2, 3, 6, 7, 8), List(2, 4, 5, 6, 9), List(2, 4, 5, 7, 8), List(3, 4, 5, 6, 8)))
    map.put(27, List(List(1, 2, 7, 8, 9), List(1, 3, 6, 8, 9), List(1, 4, 5, 8, 9), List(1, 4, 6, 7, 9), List(1, 5, 6, 7, 8), List(2, 3, 5, 8, 9), List(2, 3, 6, 7, 9), List(2, 4, 5, 7, 9), List(2, 4, 6, 7, 8), List(3, 4, 5, 6, 9), List(3, 4, 5, 7, 8)))
    map.put(28, List(List(1, 3, 7, 8, 9), List(1, 4, 6, 8, 9), List(1, 5, 6, 7, 9), List(2, 3, 6, 8, 9), List(2, 4, 5, 8, 9), List(2, 4, 6, 7, 9), List(2, 5, 6, 7, 8), List(3, 4, 5, 7, 9), List(3, 4, 6, 7, 8)))
    map.put(29, List(List(1, 4, 7, 8, 9), List(1, 5, 6, 8, 9), List(2, 3, 7, 8, 9), List(2, 4, 6, 8, 9), List(2, 5, 6, 7, 9), List(3, 4, 5, 8, 9), List(3, 4, 6, 7, 9), List(3, 5, 6, 7, 8)))
    map.put(30, List(List(1, 5, 7, 8, 9), List(2, 4, 7, 8, 9), List(2, 5, 6, 8, 9), List(3, 4, 6, 8, 9), List(3, 5, 6, 7, 9), List(4, 5, 6, 7, 8)))
    map.put(31, List(List(1, 6, 7, 8, 9), List(2, 5, 7, 8, 9), List(3, 4, 7, 8, 9), List(3, 5, 6, 8, 9), List(4, 5, 6, 7, 9)))
    map.put(32, List(List(2, 6, 7, 8, 9), List(3, 5, 7, 8, 9), List(4, 5, 6, 8, 9)))
    map.put(33, List(List(4, 5, 7, 8, 9), List(3, 6, 7, 8, 9)))
    map.put(34, List(List(4, 6, 7, 8, 9)))
    map.put(35, List(List(5, 6, 7, 8, 9)))
    map
  }

  // 6 Digit Combinations

  def sixes = {
    val map = HashMap[Int, List[List[Int]]]()
    map.put(21, List(List(1, 2, 3, 4, 5, 6)))
    map.put(22, List(List(1, 2, 3, 4, 5, 7)))
    map.put(23, List(List(1, 2, 3, 4, 5, 8), List(1, 2, 3, 4, 6, 7)))
    map.put(24, List(List(1, 2, 3, 4, 5, 9), List(1, 2, 3, 4, 6, 8), List(1, 2, 3, 5, 6, 7)))
    map.put(25, List(List(1, 2, 3, 4, 6, 9), List(1, 2, 3, 4, 7, 8), List(1, 2, 3, 5, 6, 8), List(1, 2, 4, 5, 6, 7)))
    map.put(26, List(List(1, 2, 3, 4, 7, 9), List(1, 2, 3, 5, 6, 9), List(1, 2, 3, 5, 7, 8), List(1, 2, 4, 5, 6, 8), List(1, 3, 4, 5, 6, 7)))
    map.put(27, List(List(1, 2, 3, 4, 8, 9), List(1, 2, 3, 5, 7, 9), List(1, 2, 3, 6, 7, 8), List(1, 2, 4, 5, 6, 9), List(1, 2, 4, 5, 7, 8), List(1, 3, 4, 5, 6, 8), List(2, 3, 4, 5, 6, 7)))
    map.put(28, List(List(1, 2, 3, 5, 8, 9), List(1, 2, 3, 6, 7, 9), List(1, 2, 4, 5, 7, 9), List(1, 2, 4, 6, 7, 8), List(1, 3, 4, 5, 6, 9), List(1, 3, 4, 5, 7, 8), List(2, 3, 4, 5, 6, 8)))
    map.put(29, List(List(1, 2, 3, 6, 8, 9), List(1, 2, 4, 5, 8, 9), List(1, 2, 4, 6, 7, 9), List(1, 2, 5, 6, 7, 8), List(1, 3, 4, 5, 7, 9), List(1, 3, 4, 6, 7, 8), List(2, 3, 4, 5, 6, 9), List(2, 3, 4, 5, 7, 8)))
    map.put(30, List(List(1, 2, 3, 7, 8, 9), List(1, 2, 4, 6, 8, 9), List(1, 2, 5, 6, 7, 9), List(1, 3, 4, 5, 8, 9), List(1, 3, 4, 6, 7, 9), List(1, 3, 5, 6, 7, 8), List(2, 3, 4, 5, 7, 9), List(2, 3, 4, 6, 7, 8)))
    map.put(31, List(List(1, 2, 4, 7, 8, 9), List(1, 2, 5, 6, 8, 9), List(1, 3, 4, 6, 8, 9), List(1, 3, 5, 6, 7, 9), List(1, 4, 5, 6, 7, 8), List(2, 3, 4, 5, 8, 9), List(2, 3, 4, 6, 7, 9), List(2, 3, 5, 6, 7, 8)))
    map.put(32, List(List(1, 2, 5, 7, 8, 9), List(1, 3, 4, 7, 8, 9), List(1, 3, 5, 6, 8, 9), List(1, 4, 5, 6, 7, 9), List(2, 3, 4, 6, 8, 9), List(2, 3, 5, 6, 7, 9), List(2, 4, 5, 6, 7, 8)))
    map.put(33, List(List(1, 2, 6, 7, 8, 9), List(1, 3, 5, 7, 8, 9), List(1, 4, 5, 6, 8, 9), List(2, 3, 4, 7, 8, 9), List(2, 3, 5, 6, 8, 9), List(2, 4, 5, 6, 7, 9), List(3, 4, 5, 6, 7, 8)))
    map.put(34, List(List(1, 3, 6, 7, 8, 9), List(1, 4, 5, 7, 8, 9), List(2, 3, 5, 7, 8, 9), List(2, 4, 5, 6, 8, 9), List(3, 4, 5, 6, 7, 9)))
    map.put(35, List(List(1, 4, 6, 7, 8, 9), List(2, 3, 6, 7, 8, 9), List(2, 4, 5, 7, 8, 9), List(3, 4, 5, 6, 8, 9)))
    map.put(36, List(List(1, 5, 6, 7, 8, 9), List(2, 4, 6, 7, 8, 9), List(3, 4, 5, 7, 8, 9)))
    map.put(37, List(List(2, 5, 6, 7, 8, 9), List(3, 4, 6, 7, 8, 9)))
    map.put(38, List(List(3, 5, 6, 7, 8, 9)))
    map.put(39, List(List(4, 5, 6, 7, 8, 9)))
    map
  }


  // 7 Digit Combinations

  def sevens = {
    val map = HashMap[Int, List[List[Int]]]()
    map.put(28, List(List(1, 2, 3, 4, 5, 6, 7)))
    map.put(29, List(List(1, 2, 3, 4, 5, 6, 8)))
    map.put(30, List(List(1, 2, 3, 4, 5, 6, 9), List(1, 2, 3, 4, 5, 7, 8)))
    map.put(31, List(List(1, 2, 3, 4, 5, 7, 9), List(1, 2, 3, 4, 6, 7, 8)))
    map.put(32, List(List(1, 2, 3, 4, 5, 8, 9), List(1, 2, 3, 4, 6, 7, 9), List(1, 2, 3, 5, 6, 7, 8)))
    map.put(33, List(List(1, 2, 3, 4, 6, 8, 9), List(1, 2, 3, 5, 6, 7, 9), List(1, 2, 4, 5, 6, 7, 8)))
    map.put(34, List(List(1, 2, 3, 4, 7, 8, 9), List(1, 2, 3, 5, 6, 8, 9), List(1, 2, 4, 5, 6, 7, 9), List(1, 3, 4, 5, 6, 7, 8)))
    map.put(35, List(List(1, 2, 3, 5, 7, 8, 9), List(1, 2, 4, 5, 6, 8, 9), List(1, 3, 4, 5, 6, 7, 9), List(2, 3, 4, 5, 6, 7, 8)))
    map.put(36, List(List(1, 2, 3, 6, 7, 8, 9), List(1, 2, 4, 5, 7, 8, 9), List(1, 3, 4, 5, 6, 8, 9), List(2, 3, 4, 5, 6, 7, 9)))
    map.put(37, List(List(1, 2, 4, 6, 7, 8, 9), List(1, 3, 4, 5, 7, 8, 9), List(2, 3, 4, 5, 6, 8, 9)))
    map.put(38, List(List(1, 2, 5, 6, 7, 8, 9), List(1, 3, 4, 6, 7, 8, 9), List(2, 3, 4, 5, 7, 8, 9)))
    map.put(39, List(List(1, 3, 5, 6, 7, 8, 9), List(2, 3, 4, 6, 7, 8, 9)))
    map.put(40, List(List(1, 4, 5, 6, 7, 8, 9), List(2, 3, 5, 6, 7, 8, 9)))
    map.put(41, List(List(2, 4, 5, 6, 7, 8, 9)))
    map.put(42, List(List(3, 4, 5, 6, 7, 8, 9)))
    map
  }


  // 8 Digit Combinations
  def eights = {
    val map = HashMap[Int, List[List[Int]]]()
    map.put(36, List(List(1, 2, 3, 4, 5, 6, 7, 8)))
    map.put(37, List(List(1, 2, 3, 4, 5, 6, 7, 9)))
    map.put(38, List(List(1, 2, 3, 4, 5, 6, 8, 9)))
    map.put(39, List(List(1, 2, 3, 4, 5, 7, 8, 9)))
    map.put(40, List(List(1, 2, 3, 4, 6, 7, 8, 9)))
    map.put(41, List(List(1, 2, 3, 5, 6, 7, 8, 9)))
    map.put(42, List(List(1, 2, 4, 5, 6, 7, 8, 9)))
    map.put(43, List(List(1, 3, 4, 5, 6, 7, 8, 9)))
    map.put(44, List(List(2, 3, 4, 5, 6, 7, 8, 9)))
    map
  }

  // 9 Digit Combinations
  def nines = {
    val map = HashMap[Int, List[List[Int]]]()
    map.put(45, List(List(1, 2, 3, 4, 5, 6, 7, 8, 9)))
    map
  }

  def hintsByLength() = {
    val map = HashMap[Int, HashMap[Int, List[List[Int]]]]()
    map.put(2, twos)
    map.put( 3, threes)
    map.put( 4, fours)
    map.put( 5, fives)
    map.put( 6, sixes)
    map.put( 7, sevens)
    map.put( 8, eights)
    map.put( 9, nines)
    map
  }


  def hintsBySum() = {
    val hints = hintsByLength()

    val targetMap = HashMap[Int, HashMap[Int, List[List[Int]]]]()

    for( hint <- hints ) {

      val cellLength = hint._1

      for( combo <- hint._2 ) {
        val sum = combo._1

        targetMap.get(sum) match {
          case Some(imap) => {
            imap.get(cellLength) match {
              case Some(ilist) => {
                imap.put(cellLength, (combo._2 ++ ilist))
              }
              case None => {
                imap.put(cellLength, combo._2)
              }
            }
          }
          case None => {
            targetMap.put(sum, HashMap((cellLength, combo._2)))
          }
        }
      }
    }

    targetMap
  }

  def main(args : Array[String]) {

    Console.println(hintsByLength)
    Console.println(hintsBySum)

    val bySum = hintsBySum()
    Console.println( bySum(6) )

  }
}
