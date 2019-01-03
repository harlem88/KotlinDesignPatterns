package org.dronix.kotlin.designpatterns

import org.dronix.kotlin.designpatterns.base.*
import org.dronix.kotlin.designpatterns.base.door.Door
import org.dronix.kotlin.designpatterns.base.room.Room
import org.dronix.kotlin.designpatterns.base.wall.Wall
import org.dronix.kotlin.designpatterns.creational.abstractFactory.MazeFactory
import org.dronix.kotlin.designpatterns.creational.builder.MazeBuilder

class MazeGameCreator {
    fun createMaze(): Maze {
        val aMaze = Maze()
        val room1 = Room(1)
        val room2 = Room(2)
        val theDoor = Door(room1, room2)

        aMaze.addRoom(room1)
        aMaze.addRoom(room2)

        room1.setSide(Direction.North, Wall())
        room1.setSide(Direction.East, theDoor)
        room1.setSide(Direction.South, Wall())
        room1.setSide(Direction.West, Wall())

        room2.setSide(Direction.North, Wall())
        room2.setSide(Direction.East, Wall())
        room2.setSide(Direction.South, Wall())
        room2.setSide(Direction.West, theDoor)

        return aMaze
    }

    fun createMazeWithAbstractFactory(mazeFactory: MazeFactory): Maze{

        val aMaze = mazeFactory.makeMaze()
        val room1 = mazeFactory.makeRoom(1)
        val room2 = mazeFactory.makeRoom(2)
        val theDoor = mazeFactory.makeDoor(room1, room2)

        aMaze.addRoom(room1)
        aMaze.addRoom(room2)

        room1.setSide(Direction.North, mazeFactory.makeWall())
        room1.setSide(Direction.East, theDoor)
        room1.setSide(Direction.South, mazeFactory.makeWall())
        room1.setSide(Direction.West, mazeFactory.makeWall())

        room2.setSide(Direction.North, mazeFactory.makeWall())
        room2.setSide(Direction.East, mazeFactory.makeWall())
        room2.setSide(Direction.South, mazeFactory.makeWall())
        room2.setSide(Direction.West, theDoor)

        return aMaze
    }

    fun createMazeWithBuilder(mazeBuilder: MazeBuilder): Maze {
        return mazeBuilder
            .buildMaze()
            .buildRoom(1)
            .buildRoom(2)
            .buildDoor(1, 2)
            .build()
    }

    fun createComplexMaze(mazeBuilder: MazeBuilder): Maze {
        return mazeBuilder
            .buildMaze()
            .buildRoom(1)
            .buildRoom(1001)
            .build()
    }
}