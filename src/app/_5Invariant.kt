package app

class _5Invariant<T>(var data: T)

fun main() {
    val invariantString = _5Invariant("String")

    //  val invariantAny: _5Invariant<Any> = invariantString // bisa
    // invariantAny.data = 100  // bahaya
}