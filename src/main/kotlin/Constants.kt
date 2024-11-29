package org.example

/**
 * How to declare Constants(Sabitler) in Kotlin
 * Companion object olarak, top level olarak veya object içinde Constants tanımlayabiliriz.
 * Birçok kişi Constant'larını ayrı bir file olarak tutmayı tercih ediyor.
 * Yani bir object { } oluşturup Constant'larını içine yazıyorlar.
 *
 * NOT: Eğer o constant'a o sınıf dışında ihtiyacım yoksa Companion Object olarak tanımlıyorum.
 * Eğer o constant'a bir sınıftan bağımsız olarak birçok sınıfta kullanılıyorsa ve kesişen endişeler varsa object olarak tanımlıyorum.
 *
 * NOT: TOP LEVEL tanımlamak genelde iyi bir fikir değil, çünkü dağınık dururlar ve kodu dağıtırlar.
 */

class Constants(var firstName: String, var lastName: String) {

    val fullName = "$firstName - $lastName"

    override fun toString() = fullName

    companion object {
        const val MAX_AGE = 18
    }
}

object Constantss {
    const val MAX_AGE = 18
    const val MIN_AGE = 5
    const val ABC = "abc"
}

fun main() {
    val obj = Constants("Foo", "bar")

    Constants.MAX_AGE

    println("Constantss.MAX_AGE ${Constantss.MAX_AGE}")
    println("Constantss.MIN_AGE ${Constantss.MIN_AGE}")
    println("Constantss.ABC ${Constantss.ABC}")
}