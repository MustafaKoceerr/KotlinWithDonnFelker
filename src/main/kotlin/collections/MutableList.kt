package org.example.collections

fun main() {
    val items = mutableListOf(1, 2, 3, 4, 5)
    items.forEach { println(it) }

    println("---SPLIT---")
    items.add(6)
    items.forEach { println(it) }

    println("---SPLIT---")
    items.remove(6)
    items.forEach { println(it) }
    println("---SPLIT---")
    items.removeAt(2)
    items.forEach { println(it) }
    println("---SPLIT---")
    println("REMOVE ALL")
    items.removeAll { it -> it % 2 == 0 }
//    Removes all elements from this MutableList that match the given predicate.
    items.forEach { println(it) }
    println("---SPLIT---")

    items.set(1,23)
    items[0] = 18
//    items[5] = 23 // öyle bir index tanımlı değilse hata alırsın.
    println("---SPLIT---")
    items.removeIf { t -> t < 20  }
    items.forEach { println(it) }

}