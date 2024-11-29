package org.example

/**
 * Nested class'larda class içinde class tanımlıyoruz.
 * İçteki class'lardan, dıştaki class'taki variable'a ulaşımımız olmuyor.
 */

private class Vehiclee {
    var brand: String = "Unknown"
    fun info() = println("brand $brand")

    class SteeringWheel {
        var name = "The SteeringWheel"
        fun info() = println(name)
    }

    class Transmission() {
        var type = "Automatic"
        fun shift() = println("Vehicle has shifted and we cannot access super class variables forex: brand")
    }
}

fun main() {
    val vehiclee = Vehiclee()
    vehiclee.brand = "Ford"
    vehiclee.info()

    val steeringWheel = Vehiclee.SteeringWheel()
    steeringWheel.info()

    val transmission = Vehiclee.Transmission()
    transmission.shift()
}