package org.example.collections

/**
 * List ve map operasyonlarını sırasıyla çalıştırır.
 * Sequence ise böyle değildir, daha performanslıdır. Çünkü her sayı için işlem bitene kadar çalıştırır.
 *
 * Eğer kodunda bir performans düşüklüğü varsa ve bu "map ve list"'lerden kaynaklanıyorsa, SEQUENCE kullanmayı düşünmelisin.
 *
 *     // SEQUENCE'LERİ NEREDE KULLANIRIZ
 *     1- İşlenmesi gereken çok fazla değerimiz varsa,
 *     2- Değerlerimiz çok fazla ara işleme girecekse map, filter vs
 */

fun main() {

    listOf("A", "B", "C")
        .filter {
            println("filter: $it")
            true
        }.filter {
            println("hello: $it")
            true
        }
        .forEach { println("foreach: $it") }

    /*
        filter: A
        filter: B
        filter: C
        hello: A
        hello: B
        hello: C
        foreach: A
        foreach: B
        foreach: C
     */
    // Filtrelerimiz burada tek tek çalıştı, yani bir işlemin sonucu bitmeden diğer işlem çalışmadı. Bu çok büyük data setlerinde beklemeye yol açabilir.
    println("---SPLIT---")
    sequenceOf("X", "Y", "Z")
        .filter {
            println("filter: $it")
            true
        }.filter {
            println("hello: $it")
            true
        }
        .forEach { println("foreach: $it") }

    // Her bir öğe başlar ve zincirin sonuna kadar işlenir.


    // performans testi
    /** Liste ile yaptığımda millis: 1985 ms*/
    measure({
        val list = generateSequence(1) { it + 1 }
            .take(50_000_000)
            .toList()

        val result = list.filter { it % 3 == 0 }
            .average()
        println(result)
    })

    /**
     * Bunu liste olmaktan çıkartalım ve sonuçlara bakalım.
     * millis: 619 ms
     */
    measure({
        val list = generateSequence(1) { it + 1 }
            .take(50_000_000)

        val result = list.filter { it % 3 == 0 }
            .average()
        println(result)
    })

    /**
     * Diyelim ki veri listesi bizim elimizde değil, DB'den geliyor. Liste mi sequence mi kullanacağını o noktada ayarlayamıyorsun.
     * Veri listesi geldikten sonra ayarlayabilirsin.
     * Bunun için asSequence() ile listeyi sequence'e çevirip millis: 421 ms'de işlemi yaptırabilirsin.
     */
    val list = getListOfCustomers()
    measure {
        val result = list.asSequence().filter { it % 3 == 0 }.average()
        println(result)
    }

}


fun getListOfCustomers(): List<Int> {
    return generateSequence(1) { it + 1 }
        .take(50_000_000)
        .toList()
}


// CHAT GBT
/*
Kotlin'deki Sequence, bir koleksiyonun elemanlarını tembel (lazy) bir şekilde işlemeye izin veren bir veri yapısıdır.
 Bu, yalnızca ihtiyaç duyulan elemanlar işlendiği için büyük veri setlerinde daha verimli bellek ve CPU kullanımı sağlar.

Sequence ile Koleksiyonlar Arasındaki Fark
    1-Koleksiyonlar (List, Set, vb.):
    - Eager (hevesli) olarak çalışır.
    - Bütün işlemleri hemen uygular ve yeni bir koleksiyon döndürür.
    - Tüm öğeler bellekte işlenir, bu da büyük veri setlerinde verimsiz olabilir.


    2-Sequence:
    - Lazy (tembel) olarak çalışır.
    - İşlemleri zincirler, ancak sonucun gerektiği ana kadar işlemleri uygulamaz.
    - Elemanlar ihtiyaç duyuldukça işlenir, bu da büyük veri setlerinde performans avantajı sağlar.


Sequence Nasıl Çalışır?
Bir Sequence işleme zinciri, şu adımları izler:

1- Tembel işlem zincirini tanımlar (örn. map, filter gibi ara işlemler).
2- Zincir ancak bir son işlem (örneğin toList, toSet, count) çağrıldığında tetiklenir.


fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)

    // Sequence kullanımı
    val sequence = numbers.asSequence()
        .filter { it % 2 == 0 } // Sadece çift sayılar
        .map { it * it }       // Karesini al

    // Son işlem olmadan bu satır bir şey üretmez
    println(sequence.toList()) // Çıktı: [4, 16]
}

Çalışma Mantığı:
filter ve map yalnızca zincir oluşturur.
toList() çağrıldığında zincir çalışır ve elemanlar işlenir.


Sequence Kullanımının Avantajı:
Eğer çok büyük bir koleksiyonu işlerken ara işlemler kullanıyorsanız, Sequence bellek tüketimini azaltabilir.


Eager(Hevesli) vs Lazy Karşılaştırması:

fun main() {
    val numbers = (1..1_000_000).toList()

    // Eager işlem (Bellek yoğunluğu artar)
    val eagerResult = numbers
        .filter { it % 2 == 0 }
        .map { it * 2 }
        .take(5)
    println(eagerResult) // Çıktı: [4, 8, 12, 16, 20]

    // Lazy işlem (Daha verimli)
    val lazyResult = numbers.asSequence()
        .filter { it % 2 == 0 }
        .map { it * 2 }
        .take(5)
        .toList()
    println(lazyResult) // Çıktı: [4, 8, 12, 16, 20]
}

Neden Farklı?
Eager (List): Tüm filter ve map işlemleri koleksiyonun tamamı üzerinde yapılır, ardından take(5) uygulanır.
Lazy (Sequence): take(5) işlemi zincirin en başında çalışır ve sadece 5 eleman işlenir.

Sequence ile İlgili Fonksiyonlar:
Ara İşlemler (Intermediate Operations):
    Bu işlemler tembeldir ve başka bir Sequence döndürür.
            map, filter, flatMap, take, drop, distinct, vb.

Son İşlemler (Terminal Operations):
    Bu işlemler zinciri tetikler ve sonuç üretir.
        toList, toSet, first, last, count, sum, vb.
 */