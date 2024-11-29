package org.example.collections

import java.util.concurrent.TimeUnit
import kotlin.system.measureNanoTime

/**
 * Sequences performansı önemli derecede arttıran bir yapıdır.
 *     val list = generateSequence(1){it+1}
 *         .take(50_000_000)
 *         .toList()
 *
 * Bu şekilde 50 milyon elemanlı bir liste yapabiliriz.
 */
fun main() {
    /*
        measure({
            val list = generateSequence(1) { it + 1 }
                .take(50_000_000)
                .toList()

            val result = list.filter { it % 3 == 0 }
                .average()
            println(result)
        })


     */

    val numbers = (1..50_000_000).toList()

    measure({
        // Eager işlem (Bellek yoğunluğu artar)
        val eagerResult = numbers
            .filter { it % 2 == 0 }
            .map { it * 2 }
            .take(5)
        println(eagerResult) // Çıktı: [4, 8, 12, 16, 20]
    })

    measure({
        // Lazy işlem (Daha verimli)
        val lazyResult = numbers.asSequence()
            .filter { it % 2 == 0 }
            .map { it * 2 }
            .take(5)
            .toList()
        println(lazyResult) // Çıktı: [4, 8, 12, 16, 20]
    })

    /**
     * [4, 8, 12, 16, 20]
     * millis: 809 ms
     * [4, 8, 12, 16, 20]
     * millis: 4 ms
     *
     * Gördüğümüz gibi, list olunca hepsini işledi ve cevap 800 ms'de geldi,
     * sequence olunca lazy çalıştı ve ihtiyacı olan kadar işledi, 4 ms'de geldi.
     */

}



fun measure(block: () -> Unit) {
    val nanotime = measureNanoTime(block)
    val millis = TimeUnit.NANOSECONDS.toMillis(nanotime)
    println("millis: $millis ms")
}