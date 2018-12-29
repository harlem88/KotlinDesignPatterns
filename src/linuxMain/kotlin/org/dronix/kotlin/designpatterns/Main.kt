package org.dronix.kotlin.designpatterns

import org.dronix.kotlin.designpatterns.creational.abstractFactory.BombedMazeFactory

fun hello(): String = "Hello, Kotlin/Native Design Patterns!"

fun main(args: Array<String>) {

    val bombedMazeFactory = BombedMazeFactory()
    val mazeGame = MazeGame()

    mazeGame.createMaze(bombedMazeFactory)

    println(hello())
}