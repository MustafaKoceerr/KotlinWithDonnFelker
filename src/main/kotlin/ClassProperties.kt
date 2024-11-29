package org.example

class ClassProperties(val firstName: String, val lastName: String) {
    val fullName = "$firstName $lastName"

    init {
        println("In init block fullname:$fullName")
    }

}

fun main() {
    val obj = ClassProperties("m","kocer")
    println(obj.fullName)

}