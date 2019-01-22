package org.dronix.kotlin.designpatterns.behavioral.observer

import kotlin.properties.Delegates

class Subject<T>(private val initValue: T){
    private val observers = ArrayList<Observer<T>>()

    var state : T by Delegates.observable(initValue){ _, _, new ->
        observers.forEach { it.update(new) }
    }

    fun add(observer: Observer<T>){
        observers.add(observer)
    }
    fun detach(observer: Observer<T>){
        observers.remove(observer)
    }
}