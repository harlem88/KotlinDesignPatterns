package org.dronix.kotlin.designpatterns.creational.builder

import org.dronix.kotlin.designpatterns.base.Direction
import org.dronix.kotlin.designpatterns.base.Maze
import org.dronix.kotlin.designpatterns.base.door.Door
import org.dronix.kotlin.designpatterns.base.room.Room
import org.dronix.kotlin.designpatterns.base.wall.CommonWall
import org.dronix.kotlin.designpatterns.base.wall.Wall

class StandardMazeBuilder : MazeBuilder {
    private var currentMaze: Maze? = null

    override fun buildMaze(): MazeBuilder {
        currentMaze = Maze()
        return this
    }

    override fun buildRoom(roomNumber: Int): MazeBuilder {
        currentMaze = currentMaze ?: Maze()

        if (currentMaze?.getRoomFromNumber(roomNumber) == null) {
            val room = Room(roomNumber)

            currentMaze?.addRoom(room)

            room.setSide(Direction.North, Wall())
            room.setSide(Direction.South, Wall())
            room.setSide(Direction.East, Wall())
            room.setSide(Direction.West, Wall())
        }
        return this
    }

    override fun buildDoor(roomFrom: Int, roomTo: Int): MazeBuilder {
        currentMaze = currentMaze ?: Maze()

        val room1 = currentMaze?.getRoomFromNumber(roomFrom)
        val room2 = currentMaze?.getRoomFromNumber(roomTo)

        if (room1 != null && room2 != null) {
            val door = Door(room1, room2)

            room1.setSide(CommonWall.getDirection(room1, room2), door)
            room2.setSide(CommonWall.getDirection(room2, room1), door)
        }

        return this
    }

    override fun build(): Maze {
        return currentMaze ?: Maze()
    }
}