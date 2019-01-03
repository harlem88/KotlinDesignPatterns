package org.dronix.kotlin.designpatterns

import org.dronix.kotlin.designpatterns.base.Maze
import org.dronix.kotlin.designpatterns.creational.abstractFactory.BombedMazeFactory
import org.dronix.kotlin.designpatterns.creational.abstractFactory.EnchantedMazeFactory
import org.dronix.kotlin.designpatterns.creational.builder.CountingMazeBuilder
import org.dronix.kotlin.designpatterns.creational.builder.StandardMazeBuilder
import org.dronix.kotlin.designpatterns.creational.factoryMethod.BombedMazeGame
import org.dronix.kotlin.designpatterns.creational.factoryMethod.EnchantedMazeGame

fun hello(): String = "Hello, Kotlin/Native Design Patterns!"

fun main(args: Array<String>) {

    val mazeBombed   = createBombedMaze()
    val mazeStandard = createStandardMaze()
    val enchantedMaze= createEnchantedMaze()
    val countingMaze = createCountingMaze()

    println(hello())
}

fun createBombedMaze(): Maze{

    val bombedMazeFactory = BombedMazeFactory()
    val mazeGame = MazeGameCreator()

    return mazeGame.createMazeWithAbstractFactory(bombedMazeFactory)
}

fun createStandardMaze(): Maze{
    val standardMazeBuilder = StandardMazeBuilder()
    val mazeGame = MazeGameCreator()

    return mazeGame.createMazeWithBuilder(standardMazeBuilder)
}

fun createEnchantedMaze(): Maze{
    val enchantedMaze = EnchantedMazeGame()
    return enchantedMaze.createMaze()
}

fun createCountingMaze(): Maze{
    val countingMazeBuilder = CountingMazeBuilder()
    val mazeGame = MazeGameCreator()

    val maze = mazeGame.createMazeWithBuilder(countingMazeBuilder)
    val (rooms, doors)= countingMazeBuilder.getCounts()
    println("Maze rooms: $rooms doors: $doors")
    return maze
}

