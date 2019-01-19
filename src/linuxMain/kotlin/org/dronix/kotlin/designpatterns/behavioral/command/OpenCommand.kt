package org.dronix.kotlin.designpatterns.behavioral.command

class OpenCommand(private val application: Application) : Command{

    fun askUser(): String{
        return "default"
    }

    override fun execute() {
        val name = askUser()

        if(name.isNotEmpty()){
            val document = Document(name)
            application.add(document)
            document.open()
        }
    }
}