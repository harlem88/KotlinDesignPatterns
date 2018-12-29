package org.dronix.kotlin.designpatterns.base.room

import org.dronix.kotlin.designpatterns.base.Direction
import org.dronix.kotlin.designpatterns.base.MapSite

open class Room(val roomNumber: Int) : MapSite {
    private val sides = Array<MapSite?>(4) {null}

    fun getSite(direction: Direction){

    }

    fun setSide( direction: Direction, mapSite: MapSite){

    }

    open override fun enter() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}