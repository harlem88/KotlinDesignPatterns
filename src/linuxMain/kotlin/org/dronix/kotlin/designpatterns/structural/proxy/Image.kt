package org.dronix.kotlin.designpatterns.structural.proxy

class Image(private val fileName: String): Graphic{

    init {
        loadFromDisk(fileName)
    }

    override fun draw() {
        println("drawing $fileName");
    }


    private fun loadFromDisk(fileName: String) {
        println("Loading $fileName")
    }
}