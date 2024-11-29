package org.example.Exceptions

fun main() {
    val p = Person8("Donnie", 13)
    if (p.age < 18) throw Exception("User is not old enough.")
}

data class Person8(val name: String, val age: Int)