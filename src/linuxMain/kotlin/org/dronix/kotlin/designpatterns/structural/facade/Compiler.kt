package org.dronix.kotlin.designpatterns.structural.facade

class Compiler{

    fun compile(inputStream: ByteArray) : ByteArray{
        val scanner = Scanner(inputStream)
        val parser = Parser()
        val builder = ProgramNodeBuilder()

        parser.parse(scanner, builder)
        val outputStream = ByteArray(10)
        val codeGenerator = CodeGenerator(outputStream)
        val parseTree = builder.getRootNode()

        parseTree.traverse(codeGenerator)

        return outputStream
    }
}