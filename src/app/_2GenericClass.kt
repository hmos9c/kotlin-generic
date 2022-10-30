package app

import data._1MyData

fun main() {
    val myDataString: _1MyData<String, Int> = _1MyData<String, Int>("Sanas", 100)
    myDataString.printlnData()

    val myDataInt = _1MyData(100, "Sanas")
    myDataInt.printlnData()
}