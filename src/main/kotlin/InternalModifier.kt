package org.example

/**
 * Modülümüz dışındaki diğer modüllerin bu class'a erişmesini istemiyorsak, internal modifier'ı kullanabiliriz.
 *
 * Axle sınıfını dışarıya açmayacağımızı söyledik, bu yüzden
 * lateinit var axles: Array<Axle>
 * bize hata verdi, çünkü bu şekilde Vehicle class'ının bir üyesiymiş gibi açmış oluyoruz. Public olarak erişilebilir oluyor.
 * Bunu çözmek için bu değişkene private ya da internal modifier'ı vermeliyiz.
 */

internal class Axle(val numberOfWheels: Int) {
    override fun toString(): String {
        return "axle num : $numberOfWheels"
    }
}

open class Vehicle(var color: String) {
    private var axles: MutableList<Axle> = mutableListOf()

    fun info() {
        println("The vehicle is $color")
    }

    fun addAxel(numberOfWheels: Int) {
        axles.add(Axle(numberOfWheels))
    }

    internal fun getAxels(): List<Axle> = axles
}

class Truck(color: String) : Vehicle(color) {
    init {
//        axles = arrayOf(Axle(2), Axle(4))
        addAxel(2)
        addAxel(4)
    }
}

fun main() {
    val v = Vehicle("Red")
    val t = Truck("Blue")
    t.addAxel(4)
    v.addAxel(2)

    t.getAxels().forEach {println(it) }

    println("---SPLIT---")

    v.getAxels().forEach {println(it) }

}