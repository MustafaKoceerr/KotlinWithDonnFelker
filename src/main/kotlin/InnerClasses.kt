package org.example

/**
 * Class içinde class'lardır,
 * içteki class'tan dıştaki class'ın değişkenlerine ve fonksiyonlarına ulaşabiliriz.
 */

class Vehicle2 {
    val brand = "Fiat"
    fun shift() = println("brand $brand")

    inner class Transmission {
        var type = "Automatic"
        fun shift() = println("The vehicle has shifted type: $type and brand: $brand")
    }

    class SteeringWheel {
        val name = "hydraulic"
        fun info() = println("type of Steering wheel $name and nested classes cannot access brand ")
    }
}

fun main() {
    val vehicle = Vehicle2()
    val transmission = Vehicle2().Transmission()
//    val transmission2 = Vehicle2.Transmission()  // cannot access because inner classes arent static classes
    val steeringWheel = Vehicle2.SteeringWheel() // can access because nested classes are static classes
    /**
     * ÖNEMLİ_NOT: Yukarıda inner class'ın object aracılığıyla erişilebildiğine dikkat et.
     * nested class'ta ise sadece class adıyla erişiliyor, yani static bir class olarak tanımlanmış.
     */

    vehicle.shift()
    println("###")
    transmission.shift()
    println("###")
    steeringWheel.info()

    // istersek nested class'ı object ile de tanımlayabiliriz.
    val tr2 = vehicle.Transmission()
    val tr3 = vehicle.Transmission()
    println("tr2 == tr3? ${tr2.hashCode() == tr3.hashCode()}")

    tr2.shift()
}
