package org.example

data class Userr(var firstName: String, var lastName: String) {

}

fun main() {
    val user = Userr("Musti", "kocer")

    when (user.firstName) {
        "musti" -> println("kucuk harfle")
        "MUSTI" -> println("buyuk harfle")
        "Musti" -> println("bas harfi buyuk, kalani kucuk harfle")
        else -> println("else branch")
    }


    val myEnum = AccountType.GOLD
    when (myEnum) {
        AccountType.BRONZE -> println("Bronze level")
        else -> println("Unknown level")
    }
}