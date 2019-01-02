package org.dronix.kotlin.designpatterns

import org.dronix.kotlin.designpatterns.base.Maze
import org.dronix.kotlin.designpatterns.creational.abstractFactory.BombedMazeFactory
import org.dronix.kotlin.designpatterns.creational.builder.CountingMazeBuilder
import org.dronix.kotlin.designpatterns.creational.builder.StandardMazeBuilder

fun hello(): String = "Hello, Kotlin/Native Design Patterns!"

fun main(args: Array<String>) {

    val mazeBombed   = createBombedMaze()
    val mazeStandard = createStandardMaze()
    val countingMaze = createCountingMaze()

    println(hello())
}

fun createBombedMaze(): Maze{

    val bombedMazeFactory = BombedMazeFactory()
    val mazeGame = MazeGame()

    return mazeGame.createMaze(bombedMazeFactory)
}

fun createStandardMaze(): Maze{
    val standardMazeBuilder = StandardMazeBuilder()
    val mazeGame = MazeGame()

    return mazeGame.createMaze(standardMazeBuilder)
}

fun createCountingMaze(): Maze{
    val countingMazeBuilder = CountingMazeBuilder()
    val mazeGame = MazeGame()

    val maze = mazeGame.createMaze(countingMazeBuilder)
    val (rooms, doors)= countingMazeBuilder.getCounts()
    println("Maze rooms: $rooms doors: $doors")
    return maze
}

