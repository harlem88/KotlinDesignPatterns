package org.dronix.kotlin.designpatterns.base.wall

import org.dronix.kotlin.designpatterns.base.MapSite

open class Wall : MapSite {
    override fun enter() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    open fun clone(): Wall{
        return Wall()
    }
}