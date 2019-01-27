package org.dronix.kotlin.designpatterns.behavioral.state

open class TCPState {

    open fun transmit(tcpConnection: TCPConnection, outputStream: ByteArray){}
    open fun activeOpen(tcpConnection: TCPConnection){}
    open fun passiveOpen(tcpConnection: TCPConnection){}
    open fun close(tcpConnection: TCPConnection){}
    open fun acknowledge(tcpConnection: TCPConnection){}
    open fun send(tcpConnection: TCPConnection){}


    protected fun changeState(tcpConnection: TCPConnection, state: TCPState){
        tcpConnection.changeState(state)
    }
}