package org.dronix.kotlin.designpatterns.behavioral.strategy

class TeXCompositor : Compositor{
    override fun compose(componentCount: Int, lineWidth: Int): Int {
        return 2
    }

}