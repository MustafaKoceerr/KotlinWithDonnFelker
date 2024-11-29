package org.example

class SecondaryConstructors(var firstName: String, var lastName: String, var isPlatinium: Boolean) {
    constructor(firstName: String, lastName: String) : this(firstName, lastName, false) {
        println("isPlatinum is False by default")
    }

    internal constructor(firstName: String) : this(firstName, "Unknow") {
        println("I'm in the 3rd constructor")
    }

    init {
        print("Init block ")
    }

    init {
        println("is active")
    }
}

fun main() {
    val obj = SecondaryConstructors("musti", "kocer", true)
    val obj2 = SecondaryConstructors("hakan", "kocer")

    println("\n\nThird constructor is coming!!\n\n")
    val obj3 = SecondaryConstructors("ali")
    // ilk önce init bloğu çalıştırılır, çünkü third const'tan second'a referans verdik this() ile,
    // oradan da primary const'a this() ile referans veriyoruz ve primary const'tan sonra init bloğu çalışıyor.
    // sonra
    // secondary constructor çalıştırılır, çünkü this ile ona referans veriyoruz.
    // sonra bu constructor çalıştırılır. ve I'm in the 3rd constructor bastırılır.

    /*
    Init block active
    isPlatinum is False by default
    I'm in the 3rd constructor
     */
}