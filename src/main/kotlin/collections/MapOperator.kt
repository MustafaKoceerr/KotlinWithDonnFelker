package org.example.collections

fun main() {
    val items = listOf("Donn Felker", "Jane Doe", "Karthik Muhaj", "Peter Parker", "Clark Kent")
    val abbreviations = items.map { it.substring(0, 3).uppercase() } // [DON, JAN, KAR, PET, CLA]
    println(abbreviations)

    val abbreviations2 = items.map { "Foo" } // [Foo, Foo, Foo, Foo, Foo]
    println(abbreviations2)

    val abbreviations3 = items.map {
        val words = it.split(' ')
        words[0].substring(0, 1) + words[1].substring(0, 1)
    } // [DF, JD, KM, PP, CK]
    println(abbreviations3)

    val abbreviations4 = items.map { it.substring(0, 3).uppercase() }
        .map { "$it and lenght: ${it.length}" }
    println(abbreviations4)

    val abbreviations5 = items.map { it.substring(0, 3).uppercase() }
        .sumOf { it.length }
    println(abbreviations5)

    val abbreviations6 = items.map { it.substring(0, 3).uppercase() }
        .filterNot { it.contains("O") }
        .reversed()
    println(abbreviations6)

    val people = listOf(
        Person("Donn", 11),
        Person("Jane", 11),
        Person("Bob", 11),
        Person("Kavita", 11),
    )

    val peopleResult = people.map { it.name }
    println("Names: $peopleResult")

    val peopleResult2 = people.map { it.name }.map { it.length }
    println("Names length: $peopleResult2")

    val peopleResult3 = people.map { it.name.uppercase() }
        .forEach { println(it.reversed()) }
}


class Person(val name: String, val age: Int) {

}