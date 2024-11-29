package org.example

/**
 * Bunun için "field"'ları kullanmalıyız. Biz getter ve setter'lar ile aslında belleğe değil de onu çağıran fonksiyona ulaşıyoruz.
 * Yani obj.fullName() dediğimizde memory'ye değil de onu çağıran bir fonksiyona ulaşıyoruz.
 * Kotlin bunu otomatik olarak encapsulate ediyor.
 *
 * field'lar ile gerçekten de memory'ye ulaşıyoruz. Ve oradan değeri getiriyoruz veya değeri alıyoruz.
 * backing field'lar olarak da geçer.
 */
class GettersAndSetters(var firstName: String, var lastName: String) {

    var fullName: String = "$firstName $lastName"
        get() = "Name: $field"
        set(value) {
            if (value.contains("musti")) {
                field = "musti is a not option, use mustafa"
            } else {
                field = "$value $lastName"
            }
        }
}

fun main() {
    val obj = GettersAndSetters("mustafa", "kocer")
    println(obj.fullName)
    obj.fullName = "musti"
    println(obj.fullName)

    println("******")

    val obj2 = GettersAndSetters("ali", "kocer")
    println(obj2.fullName)
    obj2.fullName = "hakan"
    println(obj2.fullName)
}