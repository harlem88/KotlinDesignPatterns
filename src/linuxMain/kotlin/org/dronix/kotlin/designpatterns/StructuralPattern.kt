package org.dronix.kotlin.designpatterns

import org.dronix.kotlin.designpatterns.structural.bridge.IconWindow
import org.dronix.kotlin.designpatterns.structural.bridge.XWindowImp
import org.dronix.kotlin.designpatterns.structural.composite.*

fun structuralPattern(){
    bridge()
    composite()
}

fun bridge(){

    val window = IconWindow(XWindowImp())
    window.drawContents()
}

fun composite(){

    val cabinet = Cabinet("PC Cabinet")
    val chassis = Chassis("PC Chassis")

    cabinet.add(chassis)

    val bus = Bus("MCA BUS")
    bus.add(Card("16Mbs Token Ring"))

    chassis.add(bus)
    chassis.add(FloppyDisk("3.5in Floppy"))
    chassis.add(FloppyDisk("3.5in Floppy"))

    print("The net price is ${chassis.netPrice()}")
}