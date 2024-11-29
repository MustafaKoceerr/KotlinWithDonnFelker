package org.example

// Fonksiyon içinde fonksiyon tanımlamak, nested functions
fun main() {
    sayHiAndBye()
    println()
    sayHiAndBye2()
}

fun sayHiAndBye() {
    println("Hii")

    fun sayBye() {
        println("Bayy")
    }
    sayBye()
    // Sadece tanımlandığı fonksiyonun içinde, tanımlandıktan sonra kullanılabilir
}

fun sayHiAndBye2() {
    println("Hii")

    fun sayBye() {
        println("Bayy")

        fun moo(){
            println("Cows moo")
        }
        moo()
    }
    sayBye()
    // Sadece tanımlandığı fonksiyonun içinde, tanımlandıktan sonra kullanılabilir
}