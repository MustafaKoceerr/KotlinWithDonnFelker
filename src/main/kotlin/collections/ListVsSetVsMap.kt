package org.example.collections

fun main() {
    // List
    val list = listOf("Donn", "Tushar", "Kavita", "Evelyn", "Felicia")

    // Set
    val set = setOf("Donn", "Tushar", "Kavita", "Donn", "Tushar")
    // "Donn","Tushar","Kavita" bir kere dahil edilecek

    val map = mapOf(Person4("Donn") to "Felker", Person4("Tushar") to "Muhaj", Person4("Evelyn") to "Smith")

    val sequence = sequenceOf(1, 2, 3, 4, 5)
    // SEQUENCE'LERİ NEREDE KULLANIRIZ
//    1- İşlenmesi gereken çok fazla değerimiz varsa,
//    2- Değerlerimiz çok fazla ara işleme girecekse map, filter vs
}

data class Person4(val name: String)