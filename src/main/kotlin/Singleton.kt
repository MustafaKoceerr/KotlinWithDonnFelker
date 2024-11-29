package org.example


/**
 * How to create Singleton in Kotlin?
 */
// 1 Instance oluşturmak istiyoruz.
class FavoriteFood {
    var name: String = "unknown"
    var ingredients = mutableListOf<String>()

}

/*
fun main() {
    val x = FavoriteFood()
    val y = FavoriteFood()
    println(x.hashCode() == y.hashCode())
    // gördüğümüz gibi 2 farklı instance yarattık. Ama biz sadece 1 tane instance ile kısıtlamak istiyoruz.
}
 */

// Bunu nasıl sağlarız??
/**
 * 1. Yöntem (Companion Object)
 * - Constructor'ını private yap böylece constructor ile insance oluşturulamasın.
 * - Companion Object kullan. Companion Object sana sınıfa bağlı bir singleton yapısı sunar.
 */

class FavoriteFood2 private constructor() {
    var name: String = "unknown"
    var ingredients = mutableListOf<String>()

    companion object {
        private var favFood: FavoriteFood2? = null
        fun instance(): FavoriteFood2 {
            if (favFood == null) favFood = FavoriteFood2()

            return favFood!!
        }
//        operator fun invoke() = FavoriteFood2()
        // NOT: Invoke başına operator konulduğunda özel bir fonksiyondur. Bu demektir ki class'tan bir obje oluşturulduğunda
        // Class çağrıldığında çağırılıcak fonksiyondur.
    }
}

/*
fun main() {
    val x = FavoriteFood2.instance()
    val y = FavoriteFood2.instance()

//    val a = FavoriteFood2()
//    val b = FavoriteFood2()
    // ÖNEMLİ_NOT: a ve b'yi companion object içinde "operator fun invoke" sayesinde çağırabildik.
    // FavoriteFood2'nin constructor'ına baktığında private olduğunu görebiliyorsun. Yani:
    // FavoriteFood2() diye çağırınca aslında "operator fun invoke() = FavoriteFood2()" fonksiyonunu çağırıyor.

    println("a ve b aynı instance'mı ${x.hashCode() == y.hashCode()}")

    x.name = "muz"
    println("x ve y aynı instance'mı x:name ${x.name} y:name ${y.name}")
}
 */


/**
 * 2. Yöntem (Object)
 * Object kullanarak direkt singleton bir yapı sunabilirsin.
 */

object FavoriteFood3 {
    // NOT: Objects cannot have constructors.
    var name = "unknown"
    var ingredients = mutableListOf<String>()

    fun numberOfIngredients() = ingredients.size
}

fun main() {
    var obj1 = FavoriteFood3
    var obj2 = FavoriteFood3

    println("obj1 ve obj2 aynı instance'mı ${obj1.hashCode() == obj2.hashCode()}")

    obj2.name = "cilek"
    println("obj1 ve obj2 aynı instance'mı ${obj1.name == obj2.name}")

    fun doStuff() {
        FavoriteFood3.name = "Chicken soup"
    }

    doStuff()
    println("obj1 ve obj2 ve nesne bile oluşturmadan FavoriteFood3 aynı instance'mı\nobj1.name: ${obj1.name} \tobj2.name: ${obj2.name} \tFavoriteFood3.name: ${FavoriteFood3.name}")

}