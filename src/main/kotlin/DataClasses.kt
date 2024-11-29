package org.example

/**
 * Data class'ta primary constructor'da tüm parametreler val ya da var olmalıdır.
 *
 * // equals, hashcode, toString fonksiyonlarını override eder.
 *
 * copy(), componentN() fonksiyonlarını da bize sağlar.
 * componentN() ile destructring yapabiliriz.
 * copy() ile bir object'in içeriğini, başka bir object'e kopyalayabiliriz.
 */
data class DataClasses(val name: String, val surname: String) {
    fun fullName() = "$name - $surname"
}

class NormalClasses(val name: String, val surname: String)

fun main() {
    val d1 = DataClasses("Musti", "kocer")
    val d2 = DataClasses("Musti", "kocer")

    println("structural ${d1 == d2}")
    println("referential ${d1 === d2}")
    println("d1 $d1")
    println("d2 $d2")

    println("--SPLIT--")

    val n1 = NormalClasses("Musti", "kocer")
    val n2 = NormalClasses("Musti", "kocer")

    println("structural ${n1 == n2}")
    println("referential ${n1 === n2}")
    println("n1 $n1")
    println("n2 $n2")

    println("--SPLIT--")

    println(d1.fullName())

    val defaultObj = ParameterlessConstructor()
    println(defaultObj)

    println("d1.component1() ${d1.component1()}")
    println("d1.component2() ${d1.component2()}")

    val (name, surname) = d1
    println("destructure name $name")
    println("destructure surname $surname")

    /**
     * COPY Method
     */
    println("--SPLIT--")
    val person = DataClasses("Ali", "Kocer")
    val sibling = person.copy("Mehmet Ali")
    println(person)
    println(sibling)
}

data class ParameterlessConstructor(val name: String = "", val surname: String = "", var age: Int = 22)