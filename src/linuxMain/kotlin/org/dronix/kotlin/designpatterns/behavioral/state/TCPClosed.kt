package org.dronix.kotlin.designpatterns.behavioral.state

class TCPClosed : TCPState() {

    override fun activeOpen(tcpConnection: TCPConnection) {
        super.activeOpen(tcpConnection)
        println("send SYN, receive SYN, ACK, etc.")

        changeState(tcpConnection, TCPEstablished())
    }

    override fun passiveOpen(tcpConnection: TCPConnection) {
        super.passiveOpen(tcpConnection)
        changeState(tcpConnection, TCPListen())
    }
}