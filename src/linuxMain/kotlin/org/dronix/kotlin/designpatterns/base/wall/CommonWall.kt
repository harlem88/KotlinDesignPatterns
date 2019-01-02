package org.dronix.kotlin.designpatterns.base.wall

import org.dronix.kotlin.designpatterns.base.Direction
import org.dronix.kotlin.designpatterns.base.room.Room

object CommonWall{
    fun getDirection(room1: Room, room2: Room) : Direction{
        return Direction.East
    }
}