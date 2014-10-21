package com.github.scakuru

class Grid( val X : Int, val Y : Int ) {

  val cells = Array.fill( X, Y ){ new Cell() }


}
