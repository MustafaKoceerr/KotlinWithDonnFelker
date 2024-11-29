package org.example

/**
 * Fonksiyon çağırırken eğer daha okunaklı olmasını istiyorsam,
    userInfo(  parantezin sol tarafına geçip, seperate lines demem gerekli.
 */

fun main() {
    userInfo(
        "mustafa",
        "kocer",
        22,
        "afyon",
        "no",
        "android developer"
    )
}
fun userInfo(name: String, surname: String, age: Int, city: String, married: String, position: String){
    println("name:$name, surname:$surname, age:$age, city:$city, married:$married, position:$position")
}