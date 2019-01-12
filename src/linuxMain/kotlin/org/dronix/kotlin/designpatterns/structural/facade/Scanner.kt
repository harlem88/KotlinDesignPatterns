package org.dronix.kotlin.designpatterns.structural.facade

open class Scanner(private val inputStream: ByteArray){
    fun scan(): String{
        return "token"
    }
}