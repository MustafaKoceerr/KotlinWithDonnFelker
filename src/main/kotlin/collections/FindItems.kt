package org.example.collections

/**     HOW TO FIND ITEMS IN KOTLIN
 *
 * Find fonksiyonu:
 * Returns the first element matching the given predicate,
 * or null if no such element was found.
 *
 * First fonksiyonu:
 * Returns the first element matching the given predicate.
 * Throws:
 * NoSuchElementException - if no such element is found.
 */
fun main() {
    val names = listOf("Donn", "Bob", "Jane", "Jenny", "Tushar", "Kavita")

    var result : String? = names.find{ it == "Donnnn"}
    println(result)

    var result2 = names.first{it == "Jenny"}
    // Returns the first element matching the given predicate. or throw an error
    println(result2)

    var result3 = names.firstOrNull{it == "JennyPenny"}
    println(result3)

    var result4 = names.firstOrNull{it.lowercase().contains("j")}
    println(result4) // jane' sonucunu verdi, çünkü ilk jane'i buldu.

    var result5 = names.lastOrNull{it.lowercase().contains("j")}
    println(result5) // Jenny' sonucunu verdi, çünkü sondan aradığı için ilk Jenny'i buldu.

    // ## INDEX OF
    var result6 = names.indexOfLast{it.lowercase().contains("j")}
    println(result6) // 3' sonucunu verdi, çünkü sondan aradığı için ilk Jenny'i buldu ve indexi 3.
    var result7 = names.indexOfFirst{it.lowercase().contains("j")}
    println(result7) // 3' sonucunu verdi, çünkü sondan aradığı için ilk Jenny'i buldu ve indexi 3.
}