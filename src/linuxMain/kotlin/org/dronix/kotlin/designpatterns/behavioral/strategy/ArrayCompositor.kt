package org.dronix.kotlin.designpatterns.behavioral.strategy

class ArrayCompositor : Compositor{
    override fun compose(componentCount: Int, lineWidth: Int): Int {
        return 3
    }
}