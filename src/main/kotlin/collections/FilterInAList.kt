package org.example.collections

fun main() {
    val names = listOf("Donn", "Bob", "Jane", "Jenny", "Tushar", "Kavita")
    val filtered = names.filter { it != "Donn" }
    val filtered2 = names.filter { it == "Donn" }
    val filtered3 = names.filter { it.lowercase().contains('a') }

    println(filtered)
    println(filtered2)
    println(filtered3)

    val ages = listOf(23, 33, 12, 9, 17, 19, 99)
    val adults = ages.filter { it >= 18 }
    println(adults)

    val adults2 = ages.filter (::isAdult)
    println(adults2)

    val children = ages.filter (::isChildren)
    println(children)

}

fun isAdult(value: Int): Boolean {
    return value >= 18
}
fun isChildren(value: Int): Boolean {
    return value < 18
}