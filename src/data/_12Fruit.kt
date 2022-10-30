package data

class _12Fruit(val name: String, val quantity: Int) : Comparable<_12Fruit> {

    override fun compareTo(other: _12Fruit): Int {
        return quantity.compareTo(other.quantity)
    }
}