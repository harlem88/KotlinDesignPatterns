package org.dronix.kotlin.designpatterns.structural.flyweight

class ConcreteVehicle : Vehicle{
    val engine = Engine()

    override fun setColor(color: String) {
        println("apply color $color")
    }
}