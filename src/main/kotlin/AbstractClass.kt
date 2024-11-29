package org.example

/**
 * Abstract class'lar sayesinde:
 * Aynı özellikleri ve benzer davranışları gruplayabiliriz.
 */
open class NonAbstractClass() {
}

abstract class AbstractClass(var color: String, val numberOfWheels: Int, val numberOfDoors: Int) {
    abstract fun drive()
    abstract fun nitro()

    fun openDoor() {
        // her kapının aynı şekilde açıldığını düşünelim.
    }
}

abstract class TwoDoorCar(color: String, numberOfWheels: Int, numberOfDoors: Int) :
    AbstractClass(color, numberOfWheels, numberOfDoors) {
    override fun drive() {
        driveFast()
    }

    abstract fun driveFast()

}

class SuperCar(color: String, numberOfWheels: Int, numberOfDoors: Int) :
    TwoDoorCar(color, numberOfWheels, numberOfDoors) {
    override fun driveFast() { // from TwoDoorCar
        println("SuperCar vınnnnnnnnn")
    }

    override fun nitro() { // from AbstractClass
        TODO("Not yet implemented")
    }
}

class HatchbackCar(color: String, numberOfWheels: Int, numberOfDoors: Int) :
    AbstractClass(color, numberOfWheels, numberOfDoors) {
    override fun drive() {
        println("HatchbackCar drive safety")
    }
    override fun nitro() { // from AbstractClass
        TODO("Not yet implemented")
    }
}

fun main() {
    val v = NonAbstractClass()
//    val abstractClass = AbstractClass() // cannot create instance from an abstract class

    val sc = SuperCar("Blue", 4, 2)
    val hb = HatchbackCar("Blue", 4, 2)
    driveVehicle(sc)
    driveVehicle(hb)
}


/**
 * Using Abstract Classes as an Abstraction
 *Abstract class'ları kullanarak soyutlama yapmak:
 */

fun driveVehicle(vehicle: AbstractClass) {
    vehicle.drive()
}