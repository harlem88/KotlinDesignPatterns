package org.dronix.kotlin.designpatterns.behavioral.command

class PasteCommand(private val document: Document) : Command{

    override fun execute() {
        document.paste()
    }
}