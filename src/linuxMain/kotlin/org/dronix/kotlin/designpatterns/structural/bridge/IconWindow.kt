package org.dronix.kotlin.designpatterns.structural.bridge

class IconWindow(windowImp: WindowImp) : Window(windowImp) {

    override fun drawContents() {
        windowImp.deviceBitmap()
    }
}