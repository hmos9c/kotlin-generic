package data

class _3Function(val name: String) {

    fun <T> sayHello(param: T){
        println("Hello $param, my name is $name")
    }

}