package org.dronix.kotlin.designpatterns.behavioral.observer

class AnalogClock(subject: Subject<ClockTimer>): Observer<ClockTimer> {

    init {
        subject.add(this)
    }

    override fun update(subject: ClockTimer) {
        println("ANALOG CLOCK-> new time: ${subject.time}")
    }
}