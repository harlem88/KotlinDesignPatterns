package org.dronix.kotlin.designpatterns.behavioral.command

class Document(private val name: String){
    fun open(){
        println("open $name")
    }
    fun paste(){
        println("paste in $name")
    }
}