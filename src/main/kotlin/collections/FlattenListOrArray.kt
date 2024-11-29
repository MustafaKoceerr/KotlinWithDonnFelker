package org.example.collections

/**
 * İç içe geçmiş listeleri, tek bir listeye indirgemek için,
 * flatten fonksiyonu kullanılır.
 *
public fun <T> Iterable<Iterable<T>>.flatten(): List<T> {
 *
 */
fun main() {

    val mine = listOf("Apples", "Grapes")
    val theirs = listOf("Oranges", "Pears", "Strawberries")
    val others = listOf("Kiwi", "Watermelon")
    val allOfUs = listOf(mine, theirs, others)

    println(allOfUs) // [[Apples, Grapes], [Oranges, Pears, Strawberries], [Kiwi, Watermelon]]
    println(allOfUs.flatten()) // [Apples, Grapes, Oranges, Pears, Strawberries, Kiwi, Watermelon]


    val mineArray = arrayOf("Apples", "Grapes")
    val theirsArray = arrayOf("Oranges", "Pears", "Strawberries")
    val othersArray = arrayOf("Kiwi", "Watermelon")
    val allArrays = arrayOf(mineArray, theirsArray, othersArray)

    println(allArrays) // [[Ljava.lang.String;@4dd8dc3
    println(allArrays.flatten()) // [Apples, Grapes, Oranges, Pears, Strawberries, Kiwi, Watermelon]
}