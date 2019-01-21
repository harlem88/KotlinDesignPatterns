package org.dronix.kotlin.designpatterns.behavioral.memento

class Originator(private var state: String){

    fun setState(state: String){
        this.state = state
    }

    fun setMemento(memento: Memento){
        this.state = memento.state
    }

    fun createMemento(): Memento{
        return Memento(state)
    }
}