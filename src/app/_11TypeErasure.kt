package app

class _11TypeErasure<T>(param: T){
    private val data: T = param
    fun getData(): T = data
}

fun main() {
    val data1 = _11TypeErasure<String>("Sanas")
    val dataString: String = data1.getData()
    println(dataString)

    val data2: _11TypeErasure<Int> = data1 as _11TypeErasure<Int>
    val dataInt = data2.getData() // error konversi
    println(dataInt)
}