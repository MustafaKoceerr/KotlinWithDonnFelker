package org.example.collections

/**
 * How to Combine Multiple Immutable Lists in Kotlin
 * Listeleri Ekleme, toplama işlemi
 *  Plus function:
 *
 * Listeleri çıkartma işlemi
 *  Minus function:
 */
fun main() {
    val mine = listOf("Apples", "Grapes")
    val theirs = listOf("Oranges", "Pears", "Strawberries")
    val others = listOf("Kiwi", "Watermelon")

    val result = mine.plus(theirs).plus(others)
    println(result)
    // plus fonksiyonu, yeni bir array list fonksiyonu tanımlıyor, ve listeleri toplayıp onu return ettiriyor.


    val result2 = result.minus(theirs)
    println(result2)
    println(result2.minus("Kiwi").minus("mike"))


}