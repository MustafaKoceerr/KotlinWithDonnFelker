package org.example.collections

import org.example.Userr
import kotlin.collections.plus

/**
 * How to create array
 */

fun main() {
    val items = arrayOf(1, 2, 3, 4, 5)
    items.forEach { value -> println(value) }

    val itemsInt = intArrayOf(1, 2, 3, 4, 5)
    val itemsDouble = doubleArrayOf(1.0, 2.0, 3.0, 4.0, 5.0)
    val itemsLong = longArrayOf(1, 2, 3, 4, 5)
    val itemsFloat = floatArrayOf(1.0f, 2.0f, 3.0f, 4.0f, 5.0f)

    val users = arrayOf(Userr("musti", "kocer"), Userr("ali", "kocer"))
    users.forEach { println(it) }

    val updatedUsers = users.plus(Userr("hakan", "kocer"))
    // ONEMLİ_NOT: Plus fonksiyonuna baktığında, array'in kopyasını oluşturuyor, bu elemanı ekliyor ve yeni array'i bize döndürüyor.
    // yani her bir ekleme işlemi için array'i yeniden oluşturuyor. Bu bize büyük bir maaliyet demektir.
    // bunun için ekleme çıkartma gibi işlemler yaparken arrays yerine collections kullan.

    updatedUsers.forEach { println(it) }
    val usersList = updatedUsers.reversed()
    val item = users[0]

    println("item : $item")
    println("usersList : $usersList")

    // set ile atama
    updatedUsers.set(0, Userr("mike", "tyson"))
    updatedUsers[0] = Userr("mike", "tyson")
    println("---SPLIT---")
    updatedUsers.forEach { println(it) }
    // Set ile veya [index] ile array'in elemanını yeniden atayabiliyorsun.
    // Bunun array'in val veya var olmasıyla bir alakası yok.
    // O indexteki ullanıcıyı değiştirir ve performans olarak sakıncalı değildir, çünkü unit döndürür. Sadece o indexteki değeri değiştirir.


}