package org.example.collections

fun main() {
    val states = mapOf(
        "NY" to "New York",
        "NJ" to "New Jersey",
        "CA" to "California",
        "CA" to "California",
        "CA" to "California",
    )

    val result = states.get("NY")
    val result2 = states["NY"]
    val result3 = states.getOrDefault("FL", "UNKNOWN_VALUE")
    val result4 = states.getOrElse("FL", {"FOO"}) // 2. parametre bir fonksiyon
    println(result)
    println(result2)
    println(result3)
    println(result4)

    val entries :  Set<Map.Entry<String, String>> = states.entries
    println(entries) // [NY=New York, NJ=New Jersey, CA=California]

    val keys = states.keys
    println(keys)

    val values = states.values
    println(values)
    /**
     *  ÖNEMLİ_NOT: .entries fonksiyonu bize set halinde entries'leri döndürür.
     *  Aynı şekilde "keys" property'si, set kümesi halinde key'leri,
     *  Aynı şekilde "value" property'si, set kümesi halinde value'leri döndürür.
     *
     *  Tekrar eden değerleri almaz.
     */



}