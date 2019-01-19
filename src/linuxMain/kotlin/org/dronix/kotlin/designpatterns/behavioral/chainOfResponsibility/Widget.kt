package org.dronix.kotlin.designpatterns.behavioral.chainOfResponsibility

open class Widget(handler: HelpHandler?, topic: Topic) : HelpHandler(handler, topic)