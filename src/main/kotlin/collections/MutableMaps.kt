package org.example.collections

fun main() {
    var states = mutableMapOf(
        "NY" to "New York",
        "NJ" to "New Jersey",
        "CA" to "California",
    )

    states.put("TX", "Texas")
    states["TX"]= "Texas"

    println(states)

    states.remove("NY")
    println(states)

    states["NJ"] = "Joisey"  // NJ was in the states, so it replace "New Jersey" to "Joisey"
    println(states)

    states.putIfAbsent("NY","NEW YORK2")
    println(states)
    /**
     * putIfAbsent fonksiyonu,
     * absent : mevcut olmayan demektir.
     * diyor ki eğer mevcut değilse NY to "NEWWYORK"'u ekle, bizde zaten NY mevcut olduğundan bir işlem yapmadı.
     * Ve geriye, o key'in value'sunu döndürdü.
     */
    println("---SPLIT---")
    println(states) // {NJ=Joisey, CA=California, TX=Texas, NY=NEW YORK2}

    states.remove("NY","Texas")
    println(states) // {NJ=Joisey, CA=California, TX=Texas, NY=NEW YORK2}
    /**
     * remove fonksiyonu:
     * Eğer key ile beraber value'da kullanırsan, o value'ya eşitse siler, değilse silmez.
     */

    states.getOrPut("AM", {"Amazon"}) // 2. parametre fonksiyon olacak.
    println(states) //
    /**
     * getOrPut fonksiyonu:
     * Eğer değer varsa döndürüyor, yoksa o değeri ekliyor ve eklediğin değeri döndürüyor.
     */

    states.clear()
    println(states)
    /**
     * clear() fonksiyonu:
     * tüm map'i temizler.
     */
}
