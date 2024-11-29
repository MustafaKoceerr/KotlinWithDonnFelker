package org.example.Exceptions

fun main() {
    val p = Person8("Donnie", 13)
    if (p.age < 18) throw InvalidAgeException(p.age ,"User is not old enough. User is too young.")

}

class InvalidAgeException(val age: Int, message: String) : IllegalArgumentException("Invalid age: $age. $message")