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

    val result = states.map(::findValueInWebService)
    println(result)

    val result2 = states.mapNotNull(::findValueInWebService)
    println(result2)

}

fun findValueInWebService(entry: Map.Entry<String, String>): Map.Entry<String, String>? =
    if (entry.key.startsWith("C") or entry.key.startsWith("A")) null else entry