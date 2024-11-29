package org.example.collections

fun main() {

    val age = 32

    if (age is Any) println("Is Any!") else println("Is not Any!")

    if (age is String) println("Is String!") else println("Not String!")

    println("---SPLIT---")
    val obj: Any = Person7("Bob")
    if (obj is Person7) println("Is Person7!") else println("Not Person7!")
    if (obj is Any) println("Is Any!") else println("Not Any!")
    if (obj is String) println("Is String!") else println("Not String!")

    println(obj.javaClass.name)

    if (getStuff("2") is Any) println("get stuff is Any") else println("getStuff Not any!")
}

data class Order(val amount: Int)
class Person7(val name: String)


fun getStuff(value: String): Any {
    return when (value) {
        "1" -> 1
        "2" -> "Hello"
        "3" -> true
        "4" -> 1.1
        else -> false
    } as Any
}