package org.example

/**
 * Bazen sadece isme, bazen hem isme hem de soyisme ihtiyacın olabilir.
 * Farklı signature(imzalar) kullanarak fonksiyonları overload yapabilirsin.
 */
fun userInfo(name: String) {
    println("name:$name,")
}

fun userInfo(name: String, surname: String) {
    println("name:$name, surname:$surname")
}

fun main() {
    userInfo("mustafa")
    userInfo("mustafa", "kocer")
}

