package org.dronix.kotlin.designpatterns.structural.bridge

abstract class Window(var windowImp : WindowImp) {

    abstract fun drawContents()

    fun drawRect(){
        windowImp.deviceRect()
    }

}