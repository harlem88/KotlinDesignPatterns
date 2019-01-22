package org.dronix.kotlin.designpatterns.behavioral.observer

interface Observer<T>{
    fun update(subject: T)
}