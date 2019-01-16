package org.dronix.kotlin.designpatterns

import org.dronix.kotlin.designpatterns.structural.bridge.IconWindow
import org.dronix.kotlin.designpatterns.structural.bridge.XWindowImp
import org.dronix.kotlin.designpatterns.structural.composite.*
import org.dronix.kotlin.designpatterns.structural.decorator.BorderDecorator
import org.dronix.kotlin.designpatterns.structural.decorator.ScrollDecorator
import org.dronix.kotlin.designpatterns.structural.decorator.TextView
import org.dronix.kotlin.designpatterns.structural.decorator.Window
import org.dronix.kotlin.designpatterns.structural.facade.Compiler
import org.dronix.kotlin.designpatterns.structural.flyweight.VehicleFactory

fun structuralPattern(){
    bridge()
    composite()
    decorator()
    facade()
    flyweight()
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

fun decorator(){
    val window = Window()
    val textView = TextView()

    window.setContents(textView)

    window.setContents(
        BorderDecorator(
            ScrollDecorator(
                textView, 10
            ), 2
        )
    )
}

fun facade(){
    val compiler = Compiler()

    compiler.compile(ByteArray(5))
}

fun flyweight(){
    val vehicleFactory = VehicleFactory()

    val ferrari488spiderRed = vehicleFactory.getVehicle("ferrari488spider")
    val ferrari488spiderBlue = vehicleFactory.getVehicle("ferrari488spider")
    val ferrari488pista = vehicleFactory.getVehicle("ferrari488pista")

    ferrari488spiderRed.setColor("red")
    ferrari488spiderBlue.setColor("blu")
    ferrari488pista.setColor("red&white")
}