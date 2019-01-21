package org.dronix.kotlin.designpatterns.behavioral.memento

class Caretaker{
    private val mementoList = ArrayList<Memento>()

    fun addMemento(state: Memento){
        mementoList.add(state)
    }

    fun getMemento(): Memento{
        return mementoList.last()
    }

    fun get(index: Int): Memento?{
        return if(index < mementoList.size){
            mementoList[index]
        }else{
            null
        }
    }
}