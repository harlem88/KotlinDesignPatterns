package org.dronix.kotlin.designpatterns.base.door

import org.dronix.kotlin.designpatterns.base.MapSite
import org.dronix.kotlin.designpatterns.base.room.Room

open class Door : MapSite {
    private var open: Boolean = false

    private var room1: Room
    private var room2: Room

    constructor() {
        this.room1 = Room()
        this.room2 = Room()
    }

    constructor(room1: Room, room2: Room) {
        this.room1 = room1
        this.room2 = room2
    }

    fun isOpen(): Boolean {
        return open
    }

    fun otherSideFrom(room: Room): Room {
        return room1
    }

    override fun enter() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun initialize(room1: Room, room2: Room) {
        this.room1 = room1
        this.room2 = room2
    }

    open fun clone(): Door {
        return Door(room1, room2)
    }
}