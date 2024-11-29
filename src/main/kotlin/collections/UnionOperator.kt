package org.example.collections

/**
 * union fonksiyonu
 *
 * Returns a set containing all distinct elements from both collections.
 * ile iki listeyi birleştirebiliyoruz ve sadece aynı değerden 1 tane alabilen "Set" veri yapısını döndürüyor.
 *
 */

fun main() {
    val people = listOf(
        Personnn("Donn"),
        Personnn("Jake"),
        Personnn("Janet"),
        Personnn("Kavita"),
    )

    val morePeople = listOf(
        Personnn("Donn"),
        Personnn("Janet"),
        Personnn("Jumo"),
        Personnn("Kavita"),
        Personnn("Kevin"),
        Personnn("Cathy"),
    )


    val uniqueValues = people.union(morePeople).union(listOf(Personnn("Donn"), Personnn("Mike")))
    println(uniqueValues)
}

data class Personnn(val name: String)