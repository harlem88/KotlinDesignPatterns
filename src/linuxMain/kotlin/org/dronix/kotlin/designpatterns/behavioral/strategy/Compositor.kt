package org.dronix.kotlin.designpatterns.behavioral.strategy

interface Compositor {
    fun compose(componentCount: Int, lineWidth: Int): Int
}