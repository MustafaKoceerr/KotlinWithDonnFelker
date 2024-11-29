package org.example.collections

fun main() {
    /** requireNotNull()
     *  içine koyduğumuz değer Null ise hata fırlatır, hata mesajını fonksiyon içinde verebiliriz.
     * */
    var name: String? = "null"
    val lenght = requireNotNull(name, { "The name should not be null, but it was!" }).length
    println(lenght)

    val person: Person5? = Person5("Donn")
//    val person: Person5? = null

    println(requireNotNull(person).name)


    /**  checkNotNull()
     * requireNotNull ile aynıdır, nll ise hata fırlatır, hata mesajını fonksiyon içinde verebiliriz.
     *
     * Aralarındaki fark kullanım yerleridir. Chatgbt'ye sorabilirsin, farklı durumlar için yazılmıştır. Aynı fonksiyonlardır.
     * */
    var person2 = checkNotNull(person, {"Data should not be null!" })


    /** filterNotNull()
     * Null olmayan değerleri al der.
     * */
    val names = listOf("Donn","John","Mike",null, "Davita","Jenn",null,"Mihta")

    val nameThatAreNotNull = names.filterNotNull()
    println(nameThatAreNotNull)

}

class Person5(val name: String)