package org.dronix.kotlin.designpatterns.structural.composite

open class CompositeEquipment(name: String) : Equipment(name) {
    private val list = ArrayList<Equipment>()

    override fun add(equipment: Equipment) {
        list.add(equipment)
    }

    override fun remove(equipment: Equipment) {
        list.remove(equipment)
    }

    override fun createIterator(): Iterator<Equipment> {
        return list.iterator()
    }

    override fun netPrice(): Float {
        var result = 0F
        val iter: Iterator<Equipment> = createIterator()

        while (iter.hasNext()) {
            result += iter.next().netPrice()
        }

        return result
    }

}