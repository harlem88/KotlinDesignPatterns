package org.dronix.kotlin.designpatterns.creational.builder

import org.dronix.kotlin.designpatterns.base.Maze

interface MazeBuilder {

    fun buildMaze(): MazeBuilder
    fun buildRoom(roomNumber: Int): MazeBuilder
    fun buildDoor(roomFrom: Int, roomTo: Int): MazeBuilder

    fun build(): Maze
}