package org.dronix.kotlin.designpatterns.base

import org.dronix.kotlin.designpatterns.base.room.Room

open class Maze {
    fun addRoom(room: Room) {}
    fun getRoomFromNumber(number: Int): Room? {
        return null
    }

    open fun clone(): Maze{
        return Maze()
    }
}