package org.dronix.kotlin.designpatterns

import org.dronix.kotlin.designpatterns.behavioral.chainOfResponsibility.Application
import org.dronix.kotlin.designpatterns.behavioral.chainOfResponsibility.Button
import org.dronix.kotlin.designpatterns.behavioral.chainOfResponsibility.Dialog
import org.dronix.kotlin.designpatterns.behavioral.chainOfResponsibility.Topic
import org.dronix.kotlin.designpatterns.behavioral.command.*
import org.dronix.kotlin.designpatterns.behavioral.mediator.FontDialogDirector
import org.dronix.kotlin.designpatterns.behavioral.memento.Caretaker
import org.dronix.kotlin.designpatterns.behavioral.memento.Memento
import org.dronix.kotlin.designpatterns.behavioral.memento.Originator
import org.dronix.kotlin.designpatterns.behavioral.observer.AnalogClock
import org.dronix.kotlin.designpatterns.behavioral.observer.ClockTimer
import org.dronix.kotlin.designpatterns.behavioral.observer.DigitalClock
import org.dronix.kotlin.designpatterns.behavioral.observer.Subject

fun behavioralPattern(){
    chainOfResponsibility()
    command()
    commandQueue()
    mediator()
    memento()
    observer()
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

fun mediator(){
    val dialogFont = FontDialogDirector()
    dialogFont.createWidgets()
}

fun memento(){
    val originator = Originator("STATE #1")
    originator.setState("STATE #2")

    val caretaker = Caretaker()
    caretaker.addMemento(originator.createMemento())

    originator.setState("STATE #3")
    caretaker.addMemento(originator.createMemento())

    originator.setMemento(caretaker.getMemento())
}

fun observer(){
    val subject = Subject((ClockTimer(100)))

    val observerD = DigitalClock(subject)
    val observerA = AnalogClock(subject)

    subject.state = ClockTimer(120)
    subject.state = ClockTimer(130)

}