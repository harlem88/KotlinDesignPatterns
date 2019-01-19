package org.dronix.kotlin.designpatterns.behavioral.chainOfResponsibility

open class HelpHandler(private val handler: HelpHandler?,private val topic: Topic){

    open fun hasHelp(): Boolean{
        return topic != Topic.NO_HELP
    }

    open fun handleHelp(){
        handler?.handleHelp()
    }
}