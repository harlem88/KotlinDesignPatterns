package org.dronix.kotlin.designpatterns.creational.builder

import org.dronix.kotlin.designpatterns.base.Maze

class CountingMazeBuilder: MazeBuilder {
    private var doors: Int = 0
    private var rooms: Int = 0
    private var currentMaze: Maze? = null

    override fun buildMaze(): MazeBuilder {
        currentMaze = Maze()
        doors = 0
        rooms = 0
        return this
    }

    override fun buildRoom(roomNumber: Int): MazeBuilder {
        rooms++
        return this
    }

    override fun buildDoor(roomFrom: Int, roomTo: Int): MazeBuilder {
        doors++
        return this
    }

    public fun getCounts(): Count {
        return Count(this.rooms, this.doors)
    }

    override fun build(): Maze {
        val maze = currentMaze
        return maze ?: Maze()
    }

}

data class Count(val rooms: Int, val doors: Int)