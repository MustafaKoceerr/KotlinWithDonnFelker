package org.example.collections

fun main() {
    val obj: Any = getStuff2("2")
    val casted: String = obj as String
    println(casted)

    /** Safe casted  as? */
    val safeCasted: Int? = obj as? Int
    println("Safe Casted : $safeCasted")

}


fun getStuff2(value: String): Any {
    return when (value) {
        "1" -> 1
        "2" -> "Hello"
        "3" -> true
        "4" -> 1.1
        else -> false
    } as Any
}