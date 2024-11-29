package org.example.collections

fun main() {

    val listOfStrings: List<String> = listOf("Donn", "John", "Mary")
    val listOfInts: List<Int> = listOf(1, 2, 3,4,5)


    val map: Map<String, Int> = mapOf("Donn" to 32, "Tushar" to 42)


    val result = EvenList<String>(listOfStrings)
    val result2 = EvenList<Int>(listOfInts)
    val result3 = EvenList<String>(map.keys.toList())
    val result4 = EvenList<Int>(map.values.toList())

    println(result.items())
    println(result2.items())
    println(result3.items())
    println(result4.items())

}

class EvenList<T>(val list: List<T>) {
    fun items(): List<T> {
        return list.filterIndexed { index, value -> index % 2 == 0 }
    }
}