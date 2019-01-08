package org.dronix.kotlin.designpatterns.structural.composite

class FloppyDisk(name: String) : Equipment(name) {

    override fun netPrice() : Float{
        return 10F
    }
}