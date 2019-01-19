package org.dronix.kotlin.designpatterns.structural

import org.dronix.kotlin.designpatterns.behavioral.chainOfResponsibility.Application
import org.dronix.kotlin.designpatterns.behavioral.chainOfResponsibility.Button
import org.dronix.kotlin.designpatterns.behavioral.chainOfResponsibility.Dialog
import org.dronix.kotlin.designpatterns.behavioral.chainOfResponsibility.Topic
import org.dronix.kotlin.designpatterns.behavioral.command.*

fun behavioralPattern(){
    chainOfResponsibility()
    command()
    commandQueue()
}

fun chainOfResponsibility(){
    val application = Application(Topic.APPLICATION)
    val dialog = Dialog(application, Topic.PRINT)
    val button = Button(dialog, Topic.PAPER_ORIENTATION)

    button.handleHelp()

    val button1 = Button(dialog, Topic.PRINT)
    button1.handleHelp()
}

fun command(){
    val invoker = Invoker()

    val document = Document("doc")
    val command = PasteCommand(document)

    invoker.executeOperation(command)
}

fun commandQueue(){
    CommandProcessor()
        .addToQueue(OpenCommand(Application()))
        .addToQueue(PasteCommand(Document("default")))
        .processCommands()
}