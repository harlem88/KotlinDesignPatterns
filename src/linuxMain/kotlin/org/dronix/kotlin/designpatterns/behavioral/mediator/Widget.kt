package org.dronix.kotlin.designpatterns.behavioral.mediator

abstract class Widget(private val dialogDirector: DialogDirector){
    fun changed(){
        dialogDirector.widgetChanged(this)
    }

    abstract fun handleMouse(event: Int)
}