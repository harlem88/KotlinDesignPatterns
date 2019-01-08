package org.dronix.kotlin.designpatterns.structural.composite

abstract class Equipment(private val name: String) {

    fun getName(): String {
        return name
    }

    abstract fun netPrice(): Float

    open fun add(equipment: Equipment){}
    open fun remove(equipment: Equipment){}

    open fun createIterator(): Iterator<Equipment>{
        return iterator { }
    }

}