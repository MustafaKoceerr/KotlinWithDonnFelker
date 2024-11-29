package org.example

typealias  AuthToken = String

fun main() {
    val user = User2("Donn", "12312321ASDASKDAS-1231231JZSDAS")

    Order(user.authToken)

}
//data class AuthToken(val token: String)

data class User2(val username: String, val authToken: AuthToken)

data class Account(val authToken: AuthToken)

data class Order(val authToken: AuthToken)

/*
Chat GBT

Neden Kullanılır?

1- Okunabilirliği Artırmak: Daha açıklayıcı isimler kullanarak kodun anlamını netleştirebilirsiniz.

    typealias Username = String
    typealias Password = String

    fun authenticate(user: Username, pass: Password) {
        // Kullanıcı doğrulama işlemi
    }

Username ve Password ikisi de aslında String türündedir, ancak takma adlar kodun amacını açıkça ifade eder.


2- Uzun Türleri Kısaltmak: Özellikle uzun jenerik türlerde faydalıdır.
        typealias UserMap = Map<String, List<User>>

        fun processUsers(users: UserMap) {
            // Kullanıcıları işleme
        }


3- Kodun Daha Anlamlı Olması: Karmaşık veri türlerini anlamlandırmak için kullanılır.


İleri Seviye Kullanım
Lambda Fonksiyonları için Typealias
Karmaşık fonksiyon türlerini daha okunabilir hale getirmek için kullanabilirsiniz:

        typealias Callback = (Int, String) -> Boolean

        fun registerCallback(callback: Callback) {
            val result = callback(42, "Kotlin")
            println("Callback result: $result")
        }

        fun main() {
            registerCallback { number, text ->
                println("Number: $number, Text: $text")
                number > 0
            }
        }


Jenerik Türlerle Kullanım
Uzun jenerik tanımlamaları kısaltmak için typealias çok kullanışlıdır:
        typealias StringList = List<String>

        fun printStrings(strings: StringList) {
            strings.forEach { println(it) }
        }

        fun main() {
            val names: StringList = listOf("Alice", "Bob", "Charlie")
            printStrings(names)
        }


Nullable Türlerle Kullanım
Nullable türleri daha okunabilir hale getirebilir:
        typealias NullableString = String?

        fun printName(name: NullableString) {
            println(name ?: "Name is null")
        }

        fun main() {
            printName("Alice")
            printName(null)
        }


Sınırlamalar
typealias yalnızca takma addır; türe herhangi bir yeni davranış eklemez.
Runtime'da typealias görünmez. Yani typealias ile orijinal tür aynı şekilde davranır.

typealias MyString = String

val s: MyString = "Hello"
println(s is String) // Çıktı: true
 */

/*
Özet
typealias, Kotlin'de türlere açıklayıcı ve kısa takma adlar vermek için kullanılır.

Daha okunabilir kod, uzun türleri kısaltma ve daha iyi anlamlandırma için faydalıdır.

Örnek Kullanım Alanları:
    Lambda fonksiyon türleri
    Uzun jenerik türler
    Daha anlamlı isimlendirmeler (örneğin, Username, Password).
 */