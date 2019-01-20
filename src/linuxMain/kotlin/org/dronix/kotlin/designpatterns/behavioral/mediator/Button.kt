package org.dronix.kotlin.designpatterns.behavioral.mediator

class Button(dialogDirector: DialogDirector) : Widget(dialogDirector) {
    override fun handleMouse(event: Int) {
        changed()
    }
}