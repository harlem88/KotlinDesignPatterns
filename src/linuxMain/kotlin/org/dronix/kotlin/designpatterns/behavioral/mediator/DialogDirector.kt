package org.dronix.kotlin.designpatterns.behavioral.mediator

interface DialogDirector{
    fun widgetChanged(widget : Widget)
    fun createWidgets()
}