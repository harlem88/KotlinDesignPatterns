package org.dronix.kotlin.designpatterns.behavioral.mediator

class ListBox(dialogDirector: DialogDirector) : Widget(dialogDirector) {
    private var textSelected : String = ""

    fun getSelection(): String{
        return textSelected
    }

    fun setText(textSelected: String){
        this.textSelected = textSelected
        changed()
    }

    override fun handleMouse(event: Int) {
        setText("default event")
    }

}