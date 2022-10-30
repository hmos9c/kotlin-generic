package app

import data._3Function

fun main() {
    val function = _3Function("Sanas")

    function.sayHello("Adri")
    function.sayHello<String>("Ardi")

    function.sayHello(10)
    function.sayHello<Int>(10)
}