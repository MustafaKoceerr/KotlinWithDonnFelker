package org.example.collections

fun main() {
    val states = mapOf(
        "NY" to "New York",
        "AL" to "Alabama",
        "AK" to "Alaska",
        "AZ" to "Arizona",
        "AR" to "Arkansas",
        "CA" to "California",
        "CO" to "Colorado",
        "CT" to "Connecticut",
        "DE" to "Delaware",
        "FL" to "Florida",
        "GA" to "Georgia",
        "HI" to "Hawaii",
        "ID" to "Idaho",
        "IL" to "Illinois",
        "IN" to "Indiana",
    )

    val result = states.get("NY")
    println(result)

    if (states.any()){ // Returns true if map has at least one entry.
        // en az 1 entry varsa true döndürür
    }else{
        // prompt
    }

    if (states.none()){
        // there are no entries
    }else{
        // there are entries.
    }


    println(states.containsKey("NE"))
    println(states.containsValue("New York"))
    
    
    val result2 = states.filter { it.key.lowercase().contains("a")   }
    println(result2)

    val result3 = states.filterKeys { it.lowercase().contains("a")   }
    println(result3)

    val result4 = states.filterValues{ it.lowercase().contains("a")}
    println(result4)

    val result5 = states.filterValues{ it.lowercase().contains("a")}
        .map{it.value.substring(0,3)}
    println(result5)
    // Normal "map fonksiyonu" kullandığımız için bize bir liste döndürdü

    val result6 = states.filterValues{ it.lowercase().contains("a")}
        .mapKeys{it.value.substring(0,3).uppercase()}
    // mapKeys dediğimiz için, map'in keys'lerine, it.value.substring(0,3).uppercase()'nun sonucunu atadık ve map'i return ettik.
    println(result6)
    /**
     * ÖNEMLİ_NOT: Yukarıdaki örneklerden de gördüğümüz gibi, map fonksiyonu liste döndürüyor.
     * mapKeys veya mapValues fonksiyonu, içerideki değeri key'e veya value'ya atayıp, bizim işleme soktuğumuz map'i(bu örnekte state) döndürüyor.
     */

    val result7 = states.filterValues{ it.lowercase().contains("a")}
        .filterNot{it.value.lowercase().contains("b")}
    // filterValues dediğimiz için, value'lar "a" harfini içeriyorsa ve, filterNot dediğimiz için it.value()... "b" harfini içermiyorsa, sonucu getir.
    println(result7)
}