package org.example


open class Pers(var name: String, var age: Int) {

    protected var favoriteFood: String = "unknown"

    open fun info() {
        println("This person's name is $name and they are $age year(s) old.")
    }

    protected fun printMyFavoriteFood() {
        println(favoriteFood)
    }
}

class Chef(name: String, age: Int, favFood: String) : Pers(name, age) {

    init {
        super.favoriteFood = favFood
        favoriteFood = favFood
    }

    override fun info() {
        println("This person's name is $name, they are $age year(s) old and favorite food is: $favoriteFood.")
        println("This person's name is $name, they are $age year(s) old and favorite food is: ${super.favoriteFood}.")
    }
}

fun main() {
    val p = Pers("musti", 23)
//    p.favoriteFood = "watermelon"  // cannot access because it has protected modifier
    val chef = Chef("musti", 23, "keskek")
    chef.info()
}