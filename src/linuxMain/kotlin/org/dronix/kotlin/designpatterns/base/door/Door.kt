package org.dronix.kotlin.designpatterns.base.door

import org.dronix.kotlin.designpatterns.base.MapSite
import org.dronix.kotlin.designpatterns.base.room.Room

open class Door(val room1: Room, val room2: Room) : MapSite {
    private var open: Boolean = false

    fun isOpen(): Boolean {
        return open
    }

    fun otherSideFrom(room: Room): Room {
        return room1
    }

    override fun enter() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}