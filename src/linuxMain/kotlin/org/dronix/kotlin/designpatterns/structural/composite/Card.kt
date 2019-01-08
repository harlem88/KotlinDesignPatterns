package org.dronix.kotlin.designpatterns.structural.composite

class Card(name: String) : Equipment(name) {

    override fun netPrice() : Float{
        return 5F
    }
}