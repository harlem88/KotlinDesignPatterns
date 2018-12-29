package org.dronix.kotlin.designpatterns.creational.abstractFactory

import org.dronix.kotlin.designpatterns.base.CastSpell
import org.dronix.kotlin.designpatterns.base.door.Door
import org.dronix.kotlin.designpatterns.base.door.DoorNeedingSpell
import org.dronix.kotlin.designpatterns.base.room.EnchantedRoom
import org.dronix.kotlin.designpatterns.base.room.Room

class EnchantedMazeFactory : MazeFactory() {
    private val castSpell = CastSpell()

    override fun makeRoom(roomNumber: Int): Room {
        return EnchantedRoom(roomNumber, castSpell)
    }

    override fun makeDoor(room1: Room, room2: Room): Door {
        return DoorNeedingSpell(room1, room2)
    }
}