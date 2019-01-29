package org.dronix.kotlin.designpatterns.behavioral.strategy

class Composition(private val compositor :Compositor){

    fun repair(){
        val breakCount = compositor.compose(11, 100)
        println("breakCount: $breakCount with $compositor")
    }
}