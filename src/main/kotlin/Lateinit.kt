package org.example

/**
 * Lateinit ile sonra o değişkeni atayacağım diyoruz.
 * NOT: Eğer değişken atanmadan değerine ulaşılmaya çalışılırsa hata alacağız.
 * NOT: Lateinit modifier sadece var property'ye izin verir, çünkü biz buna değer atamak zorundayız.
 *
 */
class Lateinit(val firstName: String, val lastName: String) {

    lateinit var favoriteCity: String

    val fullName = "$firstName - $lastName"

    override fun toString(): String {
        return fullName + "'s favorite city is: $favoriteCity"
    }
}

fun main() {
    var obj = Lateinit("Musti", "Kocer")
    obj.favoriteCity = "Canakkale"
    println(obj)
}