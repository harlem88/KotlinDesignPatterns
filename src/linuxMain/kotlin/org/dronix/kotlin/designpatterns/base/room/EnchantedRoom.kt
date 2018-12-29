package org.dronix.kotlin.designpatterns.base.room

import org.dronix.kotlin.designpatterns.base.CastSpell

class EnchantedRoom(roomNumber: Int, val castSpell: CastSpell) : Room(roomNumber) {

    override fun enter() {
        super.enter()
    }
}