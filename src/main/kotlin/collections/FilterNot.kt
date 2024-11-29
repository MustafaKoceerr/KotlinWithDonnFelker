package org.example.collections

/**
 * FilterNot
 */
fun main() {
    val names = listOf("Donn", "Bob", "Jane", "Jenny", "Tushar", "Kavita", "Donovan")

    val result = names.filterNot { it.contains("a") }
    val result2 = names.filter { it.contains("a") }
    println(result)
    println(result2)
    /**
     * How to Create a New List from an Existing List in Kotlin
     * list.filterTo(hedef, lambda)
     * Lambda'yı sağlayan değerleri, hedef listeye ekler.
     */

    val approved = mutableListOf("Daniele","Paul")
    val approved2 = mutableListOf("Daniele","Paul")
    println("---SPLIT---")
    names.filterTo(approved,{it.lowercase().contains("a")})
    println(approved)
    println("---SPLIT---")
    names.filterNotTo(approved2,{it.lowercase().contains("a")})
    println(approved2)


}


