package org.dronix.kotlin.designpatterns.behavioral.observer

class DigitalClock(subject: Subject<ClockTimer>): Observer<ClockTimer> {

    init {
        subject.add(this)
    }

    override fun update(subject: ClockTimer) {
        println("DIGITAL CLOCK-> new time: ${subject.time}")
    }
}