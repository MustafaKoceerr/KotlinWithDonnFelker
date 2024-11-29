package org.example.collections

fun main() {
    val names = setOf("Donn","Jonh","Felicia","Jonh","Donn","Jonh","Felicia")
    println(names) // [Donn, Jonh, Felicia]


    val names2 = mutableSetOf("Donn","Jonh","Felicia","Jonh","Donn","Jonh","Felicia")
    println(names2)

    names2.add("Jenny")
    names2.add("Penny")
    println(names2)

    val people = setOf(
        Personn("Donn"),
        Personn("Donn"),
        Personn("Donn"),
    )
    println(people)
    /**
     * ÖNEMLİ_NOT: Personn sıradan bir class olsaydı, farklı nesneler üreteceği için "set" kullansak da 3 tane elemana sahip olacaktı
     * "data class" yaptığımızda, içlerini karşılaştırıyor ve tek bir tane nesne veriyor, çünkü 3'üde aynı.
     */
}

data class Personn(val name: String)