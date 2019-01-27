package org.dronix.kotlin.designpatterns.behavioral.state

class TCPConnection{
    private var tcpState : TCPState = TCPClosed()

    fun transmit(outStream: ByteArray){
        tcpState.transmit(this, outStream)
    }
    fun activeOpen(){
        tcpState.activeOpen(this)
    }
    fun passiveOpen(){
        tcpState.passiveOpen(this)
    }
    fun close(){
        tcpState.close(this)
    }
    fun acknowledge(){
        tcpState.acknowledge(this)
    }
    fun send(){
        tcpState.send(this)
    }

    fun changeState(state: TCPState){
        tcpState = state
    }
}