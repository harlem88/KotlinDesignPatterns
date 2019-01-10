package org.dronix.kotlin.designpatterns.structural.decorator

class ScrollDecorator(component: VisualComponent, private val height: Int) : Decorator(component) {

    private fun setHeight(height: Int){}

    override fun draw() {
        super.draw()
        setHeight(height)
    }
}