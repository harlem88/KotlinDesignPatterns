package org.dronix.kotlin.designpatterns.creational.factoryMethod

import org.dronix.kotlin.designpatterns.base.room.BombRoom
import org.dronix.kotlin.designpatterns.base.room.Room
import org.dronix.kotlin.designpatterns.base.wall.BombedWall
import org.dronix.kotlin.designpatterns.base.wall.Wall

class BombedMazeGame : MazeGame() {

    override fun makeWall(): Wall {
        return BombedWall()
    }

    override fun makeRoom(roomNumber: Int): Room {
        return BombRoom(roomNumber)
    }
}