package app

import data._12Fruit

fun main() {
    val fruit1 = _12Fruit("Apple", 100)
    val fruit2 = _12Fruit("Apple", 10)

    println(fruit1 > fruit2)
    println(fruit1 >= fruit2)
    println(fruit1 < fruit2)
    println(fruit1 <= fruit2)
}