package org.dronix.kotlin.designpatterns.creational.prototype

import org.dronix.kotlin.designpatterns.base.Maze
import org.dronix.kotlin.designpatterns.base.door.Door
import org.dronix.kotlin.designpatterns.base.room.Room
import org.dronix.kotlin.designpatterns.base.wall.Wall
import org.dronix.kotlin.designpatterns.creational.abstractFactory.MazeFactory

class MazePrototypeFactory(
    private val mazePrototype: Maze,
    private val wallPrototype: Wall,
    private val roomPrototype: Room,
    private val doorPrototype: Door
) : MazeFactory() {

    override fun makeMaze(): Maze {
        return mazePrototype.clone()
    }

    override fun makeRoom(roomNumber: Int): Room {
        val room = roomPrototype.clone()
        room.initialize(roomNumber)
        return room
    }

    override fun makeWall(): Wall {
        return wallPrototype.clone()
    }

    override fun makeDoor(room1: Room, room2: Room): Door {
        val door = doorPrototype.clone()
        door.initialize(room1, room2)
        return door
    }
}