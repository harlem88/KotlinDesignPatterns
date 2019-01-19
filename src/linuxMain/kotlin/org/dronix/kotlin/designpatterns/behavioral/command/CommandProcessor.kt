package org.dronix.kotlin.designpatterns.behavioral.command

class CommandProcessor {

    private val queue = ArrayList<Command>()

    fun addToQueue(orderCommand: Command): CommandProcessor =
        apply {
            queue.add(orderCommand)
        }

    fun processCommands(): CommandProcessor =
        apply {
            queue.forEach { it.execute() }
            queue.clear()
        }
}