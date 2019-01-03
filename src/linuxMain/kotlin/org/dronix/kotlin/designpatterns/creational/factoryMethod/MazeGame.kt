package org.dronix.kotlin.designpatterns.creational.factoryMethod

import org.dronix.kotlin.designpatterns.base.Direction
import org.dronix.kotlin.designpatterns.base.Maze
import org.dronix.kotlin.designpatterns.base.door.Door
import org.dronix.kotlin.designpatterns.base.room.Room
import org.dronix.kotlin.designpatterns.base.wall.Wall

open class MazeGame {

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

    fun createMaze(): Maze {

        val aMaze = makeMaze()
        val room1 = makeRoom(1)
        val room2 = makeRoom(2)
        val theDoor = makeDoor(room1, room2)

        aMaze.addRoom(room1)
        aMaze.addRoom(room2)

        room1.setSide(Direction.North, makeWall())
        room1.setSide(Direction.East, theDoor)
        room1.setSide(Direction.South, makeWall())
        room1.setSide(Direction.West, makeWall())

        room2.setSide(Direction.North, makeWall())
        room2.setSide(Direction.East, makeWall())
        room2.setSide(Direction.South, makeWall())
        room2.setSide(Direction.West, theDoor)

        return aMaze
    }
}