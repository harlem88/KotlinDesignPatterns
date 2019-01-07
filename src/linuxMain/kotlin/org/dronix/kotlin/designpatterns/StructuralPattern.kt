package org.dronix.kotlin.designpatterns

import org.dronix.kotlin.designpatterns.structural.bridge.IconWindow
import org.dronix.kotlin.designpatterns.structural.bridge.XWindowImp

fun structuralPattern(){
    bridge()
}

fun bridge(){

    val window = IconWindow(XWindowImp())
    window.drawContents()
}