package org.example

/**
 * Companion object, tanımlandığı class'a bağlı, static bir yapıdır.
 *
 */
class CompanionObject(var firstName: String, var lastName: String) {
    override fun toString(): String {
        return "${this.firstName} ${this.lastName}"
    }

    companion object {
        val users = mutableListOf<CompanionObject>()

        fun createUser(firstName: String, lastName: String): CompanionObject {
            return CompanionObject(firstName, lastName)
        }

        fun createUsers(count: Int): List<CompanionObject> {
            for (i in 0..count) {
                users.add(CompanionObject("FirstName$i", "LastName$i"))
            }
            return users
        }
    }

}

fun main() {
    val obj = CompanionObject("foo", "bar")
    val obj2 = CompanionObject.createUser("foo", "bar")
    println(obj)
    println(obj2)

    val users = CompanionObject.createUsers(5)
    println(users)
    println("############")
    val users2 = CompanionObject.users
    println(users2)
}