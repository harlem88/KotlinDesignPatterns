package org.dronix.kotlin.designpatterns.structural.facade

class ProgramNodeBuilder{
    var node = ProgramNode()

    fun newVariable(): ProgramNodeBuilder{
        node = ProgramNode()
        return this
    }

    fun getRootNode(): ProgramNode{
        return node
    }
}