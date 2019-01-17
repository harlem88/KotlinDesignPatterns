package org.dronix.kotlin.designpatterns.structural.proxy

class ImageProxy(private val fileName: String) : Graphic {
    private var image: Image? = null

    override fun draw() {
        if (image == null) image = Image(fileName)
        image?.draw()
    }
}