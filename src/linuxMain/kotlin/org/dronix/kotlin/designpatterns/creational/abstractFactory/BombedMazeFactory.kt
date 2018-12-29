package org.dronix.kotlin.designpatterns.creational.abstractFactory

import org.dronix.kotlin.designpatterns.base.room.BombRoom
import org.dronix.kotlin.designpatterns.base.wall.Wall
import org.dronix.kotlin.designpatterns.base.room.Room
import org.dronix.kotlin.designpatterns.base.wall.BombedWall

class BombedMazeFactory: MazeFactory() {

    override fun makeWall(): Wall {
        return BombedWall()
    }

    override fun makeRoom(roomNumber: Int): Room {
        return BombRoom(roomNumber)
    }
}