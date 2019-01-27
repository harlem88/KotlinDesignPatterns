package org.dronix.kotlin.designpatterns.behavioral.state

class TCPEstablished: TCPState() {

    override fun close(tcpConnection: TCPConnection) {
        super.close(tcpConnection)
        println("send PIN, receive ACK of FIN")

        changeState(tcpConnection, TCPListen())
    }

    override fun transmit(tcpConnection: TCPConnection, outputStream: ByteArray) {
        super.transmit(tcpConnection, outputStream)
        println("written ${outputStream.size}")
    }
}