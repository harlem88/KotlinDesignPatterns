package org.dronix.kotlin.designpatterns.behavioral.chainOfResponsibility

class Button(handler: Widget?, private val topic: Topic) : Widget(handler, topic){

    override fun handleHelp() {
        if(hasHelp() && topic == Topic.PAPER_ORIENTATION){
            println("button ${topic.name}")
        }
        else super.handleHelp()
    }
}