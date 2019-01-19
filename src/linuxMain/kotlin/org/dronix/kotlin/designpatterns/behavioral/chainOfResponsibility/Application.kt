package org.dronix.kotlin.designpatterns.behavioral.chainOfResponsibility


class Application(private val topic: Topic) : HelpHandler(null, topic){

    override fun handleHelp() {
        print("application list topic")
    }
}