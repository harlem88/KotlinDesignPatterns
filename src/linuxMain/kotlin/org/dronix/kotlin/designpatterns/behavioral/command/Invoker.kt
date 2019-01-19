package org.dronix.kotlin.designpatterns.behavioral.command

class Invoker{
    fun executeOperation(command: Command){
        command.execute()
    }
}