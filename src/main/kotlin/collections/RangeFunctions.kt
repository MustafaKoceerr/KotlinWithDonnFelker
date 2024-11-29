package org.example.collections

fun main() {
    val i = 1

    if (i in 1..5) println("yes") else println("no")


    for (j in 0..10 step 2){
        print("j: $j\t")
    }
}