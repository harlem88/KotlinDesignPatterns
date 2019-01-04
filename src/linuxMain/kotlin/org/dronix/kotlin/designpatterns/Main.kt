package org.dronix.kotlin.designpatterns

import org.dronix.kotlin.designpatterns.base.Maze
import org.dronix.kotlin.designpatterns.base.door.Door
import org.dronix.kotlin.designpatterns.base.room.Room
import org.dronix.kotlin.designpatterns.base.wall.BombedWall
import org.dronix.kotlin.designpatterns.base.wall.Wall
import org.dronix.kotlin.designpatterns.creational.abstractFactory.BombedMazeFactory
import org.dronix.kotlin.designpatterns.creational.abstractFactory.EnchantedMazeFactory
import org.dronix.kotlin.designpatterns.creational.builder.CountingMazeBuilder
import org.dronix.kotlin.designpatterns.creational.builder.StandardMazeBuilder
import org.dronix.kotlin.designpatterns.creational.factoryMethod.BombedMazeGame
import org.dronix.kotlin.designpatterns.creational.factoryMethod.EnchantedMazeGame
import org.dronix.kotlin.designpatterns.creational.prototype.MazePrototypeFactory

fun hello(): String = "Hello, Kotlin/Native Design Patterns!"

fun main(args: Array<String>) {

    val mazeBombed   = createBombedMaze()
    val mazeStandard = createStandardMaze()
    val enchantedMaze= createEnchantedMaze()
    val countingMaze = createCountingMaze()

    val createPrototypeSimple = createPrototypeSimple()
    val createPrototypeBomb   = createPrototypeBomb()

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

fun createPrototypeSimple(){
    val mazePrototypeFactory = MazePrototypeFactory(Maze(), Wall(), Room(), Door())
    val mazeGame = MazeGameCreator()
    val maze = mazeGame.createMazeWithAbstractFactory(mazePrototypeFactory)
}

fun createPrototypeBomb(){
    val mazePrototypeFactory = MazePrototypeFactory(Maze(), BombedWall(), Room(), Door())
    val mazeGame = MazeGameCreator()
    val maze = mazeGame.createMazeWithAbstractFactory(mazePrototypeFactory)
}

