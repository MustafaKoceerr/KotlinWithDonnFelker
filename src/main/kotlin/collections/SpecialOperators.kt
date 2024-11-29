package org.example.collections

fun main() {
    /** Ternary operator */
    var name: String? = "Donn"
    val length = if (name != null) name.length else 0

    println(length)

    /** Safe call operator */
    val length2 = name?.length
    println(length2)

    /** Double Bang !! operator */
    val lenght3 = name!!.length
    println(lenght3)
}