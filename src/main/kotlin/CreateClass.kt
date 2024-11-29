package org.example

class CreateClass {
}

 class User {
    var fieldFirstName: String = ""
    var fieldLastName: String = ""

    fun printFullName() {
        println("$fieldFirstName ${fieldLastName}")
    }

    fun printWithPrefix(prefix: String){
        println("$prefix $fieldFirstName ${fieldLastName}")
    }
    fun updateName(newName: String){
        fieldFirstName = newName
    }
    fun firstNameLenght(){
        println(fieldFirstName.length)
    }
}

fun main() {
    val user = User()
    user.fieldLastName = "kocer"
    user.fieldFirstName = "musti"
    val friend = User()
    user.printFullName()
    user.printWithPrefix("Android Dev.")

    user.updateName("mustafa")
    user.printWithPrefix("Android Dev.")
    user.firstNameLenght()
}