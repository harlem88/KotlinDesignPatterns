package org.dronix.kotlin.designpatterns.structural.flyweight

class VehicleFactory{
    private val vehicleCaches = HashMap<String, Vehicle>()

    fun getVehicle(vehicle: String):Vehicle{
        if(!vehicleCaches.containsKey(vehicle)) vehicleCaches[vehicle] = ConcreteVehicle()

        return vehicleCaches[vehicle]!!
    }
}