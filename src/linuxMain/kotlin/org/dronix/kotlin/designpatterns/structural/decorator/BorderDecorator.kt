package org.dronix.kotlin.designpatterns.structural.decorator

class BorderDecorator(component: VisualComponent, private val borderWeight: Int) : Decorator(component) {

    private fun drawBorder(borderWeight: Int){}

    override fun draw() {
        super.draw()
        drawBorder(borderWeight)
    }
}