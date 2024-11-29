package org.example


fun main() {
    val pair = Pair("foo", "bar")
    val pair2 = "foo" to "bar"
    println(pair.first)
    println(pair.second)


    val triple = Triple("foo", false, 10)
    println(triple.first)
    println(triple.second)
    println(triple.third)

}