package org.example.Exceptions

/**
 * Finally bloğunu, fileStream vs gibi memory sızıntısı yapabilecek şeyleri kapatmak için kullanabilirsin.
 */

fun main() {
    val p = Person8("Donnie", 13)
/*
        try {
            checkAge(p)
            println("Done")
            println("Done")
        } catch (ex: IllegalArgumentException) {
            println("IllegalArgumentException: ${ex.message}")

        } catch (ex: InvalidAgeException) {
            println("InvalidAgeException: ${ex.message}")
        } catch (ex: Exception) {
            println("Exception: ${ex.message}")
        }
 */

    // veya

    try {
        checkAge(p)
        println("Done")
        println("Done")
    } catch (ex: Exception) {
        when (ex) {
            is InvalidAgeException -> println("InvalidAgeException ${ex.message}")
            is IllegalArgumentException -> println("IllegalArgumentException ${ex.message}")
            else -> println("Exception ${ex.message}")
        }
    }finally {
        println("Finally block")
    }
}


fun checkAge(p: Person8) {
    if (p.age < 18) {
        throw InvalidAgeException(p.age, "Boom")
    }
}