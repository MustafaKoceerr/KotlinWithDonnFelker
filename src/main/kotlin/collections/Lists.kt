package org.example.collections

import org.example.Userr

fun main() {
    val items = listOf(1, 2, 3, 4, 5)
    items.forEach { println(it) }

    val users = listOf(Userr("musti", "kocer"), Userr("ali", "kocer"))
    users.forEach { println(it) }


    val first = users.firstOrNull()
    val first2 = users.first()
    // listedeki ilk item'ı getirir.
    println("first : $first")
    val last = users.last()
    println("last : $last")

    val name: String? = null
    val stuff = if (name == null) emptyList() else listOf(name)


}