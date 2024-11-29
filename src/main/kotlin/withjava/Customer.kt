package org.example.withjava

data class Customer(val name: String) {
    fun customerHasLongName() = name.length > 10
}