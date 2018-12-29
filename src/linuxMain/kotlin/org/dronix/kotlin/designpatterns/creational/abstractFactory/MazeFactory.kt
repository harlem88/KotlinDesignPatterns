package org.dronix.kotlin.designpatterns.creational.abstractFactory

import org.dronix.kotlin.designpatterns.base.door.Door
import org.dronix.kotlin.designpatterns.base.Maze
import org.dronix.kotlin.designpatterns.base.wall.Wall
import org.dronix.kotlin.designpatterns.base.room.Room

open class MazeFactory {

    open fun makeMaze(): Maze {
        return Maze()
    }

    open fun makeWall(): Wall {
        return Wall()
    }

    open fun makeRoom(roomNumber: Int): Room {
        return Room(roomNumber)
    }

    open fun makeDoor(room1: Room, room2: Room): Door {
        return Door(room1, room2)
    }
}