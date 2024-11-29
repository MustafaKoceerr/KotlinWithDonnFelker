package org.example.collections

/**
 *
 * İlk olarak, transform lambda fonksiyonu ((T) -> Iterable<R>) her bir öğeye uygulanır.
 * Her bir öğe için transform fonksiyonunun sonucu bir koleksiyon (örneğin bir List<R>) olur.
 * Bu koleksiyonlar düzleştirilerek tek bir düz listeye (List<R>) dönüştürülür.
 * Bu işlem sırası önemlidir, çünkü önce dönüştürme yapılır, ardından düzleştirme işlemi gerçekleşir.
 */
/*
        fun main() {
            val list = listOf(1, 2, 3)
            val result = list.flatMap { number ->
                listOf(number, number * 10) // Her sayıyı ve onun 10 katını döndürüyoruz
            }
            println(result) // Çıktı: [1, 10, 2, 20, 3, 30]
        }

        flatMap şu adımları takip eder:
            transform Uygulaması:
            1 -> [1, 10]
            2 -> [2, 20]
            3 -> [3, 30]
            Flatten:
            Tüm alt listeleri birleştirir: [1, 10] + [2, 20] + [3, 30] -> [1, 10, 2, 20, 3, 30]

 */
fun main() {
    val groceryBags: List<ShoppingBag> = listOf(
        ShoppingBag(listOf("Grapes", "Apples", "Oranges")),
        ShoppingBag(listOf("Milk", "Eggs", "Pasta")),
        ShoppingBag(listOf("Bread", "Naan", "Cake")),
    )

    val retailBags: List<ShoppingBag> = listOf(
        ShoppingBag(listOf("Shirt", "Pants", "Trousers")),
        ShoppingBag(listOf("Socks", "Shoes")),
        ShoppingBag(listOf("Jacket", "Sweater", "Scarf")),
    )

    println("groceryBags $groceryBags")
    val groceries = groceryBags.flatMap { it.shoppingList }
    println(groceries)
    println("---SPLIT---")
    println("retailBags $retailBags")
    val clothes = retailBags.flatMap { it.shoppingList }
    println(clothes)
}

class ShoppingBag(val shoppingList: List<String>) {
    override fun toString(): String {
        return shoppingList.toString()
    }
}