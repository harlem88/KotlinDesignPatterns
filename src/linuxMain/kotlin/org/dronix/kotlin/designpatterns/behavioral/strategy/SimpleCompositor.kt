package org.dronix.kotlin.designpatterns.behavioral.strategy

class SimpleCompositor : Compositor{
    override fun compose(componentCount: Int, lineWidth: Int): Int {
        return 1
    }
}