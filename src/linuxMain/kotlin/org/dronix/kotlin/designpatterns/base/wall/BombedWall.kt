package org.dronix.kotlin.designpatterns.base.wall

class BombedWall: Wall(){
    override fun clone(): Wall {
        return BombedWall()
    }
}