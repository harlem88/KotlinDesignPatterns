package org.dronix.kotlin.designpatterns.behavioral.state

class TCPListen : TCPState() {

    override fun send(tcpConnection: TCPConnection) {
        super.send(tcpConnection)
        println("send PIN, receive ACK of FIN")

        changeState(tcpConnection, TCPEstablished())
    }
}