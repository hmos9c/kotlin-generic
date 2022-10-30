package app

class _7Contravariant<in T>{
    fun sayHello(param: T){
        println("Hello $param")
    }

    // tidak boleh
//    fun getData():T {
//        return data
//    }
}

fun main() {
    val contravariantAny = _7Contravariant<Any>()
    val contravariantString: _7Contravariant<String> = contravariantAny

    // contravariantString.getData() // error
    contravariantString.sayHello("Sanas")
}