package org.dronix.kotlin.designpatterns.behavioral.chainOfResponsibility

class Dialog(handler: HelpHandler?, private val topic: Topic) : Widget(handler, topic){

    override fun handleHelp() {
        if(hasHelp() && topic == Topic.PRINT){
            println("dialog ${topic.name}")
        }
        else super.handleHelp()
    }
}