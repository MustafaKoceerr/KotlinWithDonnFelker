package org.example

import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    val name: String by lazy{
        println("computed")
//        Thread.sleep(3000) // long running operation
        "Donn"
    }

    println(name)
    println(name)

/*
        computed
        Donn
        Donn
 */
    /**     Yukarıdaki çıktıyı aldık, çünkü lazy bloğu 1 kere çalıştırılır. Bundan sonra değişkene değer atanır ve o değerden okunur.
     *
     */

    val result = lazy{ someExpensiveOperation() }
    println(result.value)
    println(result.value)
    println(result.value)
    println(result.value)
    /**
     * Computed
     * -732600784
     * -732600784
     * -732600784
     * -732600784
     *
     * Random fonksiyonunu tekrar çağırmadığı için, aynı sayıyı dönüyor.
     */

}


fun someExpensiveOperation(): Int{
    println("Computed")
    Thread.sleep(1000)
    return Random(System.currentTimeMillis()).nextInt()
}

/*
CHAT GBT

Kotlin'de lazy evaluation (tembel değerlendirme), bir değer ya da hesaplamanın yalnızca ona gerçekten ihtiyaç duyulduğunda gerçekleştirilmesi anlamına gelir.
 Kotlin'de tembel değerlendirme, özellikle lazy delegasyonu ile uygulanır. Bu özellik, gereksiz hesaplamalardan kaçınarak performans optimizasyonu sağlar.

lazy Delegasyonu
val propertyName: Type by lazy { initializer }

İlk erişimde initializer bloğu çalıştırılır ve hesaplanan sonuç saklanır.
Daha sonraki erişimlerde aynı değer döndürülür (hesaplama tekrarlanmaz).


Örnek Kullanım

val lazyValue: String by lazy {
    println("Hesaplama yapılıyor...")
    "Sonuç hazır"
}

fun main() {
    println("Başladı")
    println(lazyValue) // İlk erişim, hesaplama yapılır
    println(lazyValue) // Sonraki erişim, önceden hesaplanan değer kullanılır
}

İlk kez lazyValue erişildiğinde hesaplama yapılır (Hesaplama yapılıyor... yazılır).
İkinci erişimde hesaplama tekrar edilmez; daha önce hesaplanan sonuç kullanılır.
 */

/*
Lazy Evaluation Nerede Kullanılır?
1- Hesaplama Maliyeti Yüksek İşlemler: Eğer bir hesaplama çok zaman alıyorsa, bu hesaplamayı yalnızca gerektiğinde yapmak için kullanılır.

        val expensiveCalculation: Int by lazy {
            println("Maliyetli hesaplama yapılıyor...")
            (1..1_000_000).sum()
        }


2- Veritabanı veya Ağ İşlemleri: Büyük veya yavaş veri işlemleri, yalnızca ihtiyaç duyulduğunda yüklenir.

        val userProfile: UserProfile by lazy {
            println("Veritabanından veri yükleniyor...")
            loadUserProfile()
        }


3- Statik Değerlerin Hazırlanması: Büyük yapılandırma dosyalarını veya değişmeyen değerleri yalnızca ilk erişimde başlatmak için kullanılır.


Lazy Evaluation ve Multithreading
Kotlin'deki lazy delegasyonu, varsayılan olarak thread-safe'dir. Bu, birden fazla thread aynı anda lazy değere erişmeye çalışsa bile, hesaplama yalnızca bir kez yapılır.

Lazy Thread-Safety Modları:

1- SYNCHRONIZED (Varsayılan):
Tüm thread'ler arasında güvenliği garanti eder.

        val threadSafeValue: String by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
            "Thread-safe hesaplama"
        }


2- PUBLICATION:
Birden fazla thread aynı anda çalıştırabilir, ancak yalnızca bir sonuç saklanır.

        val publicationValue: String by lazy(LazyThreadSafetyMode.PUBLICATION) {
            "Thread-safe değil ama saklanan değer tek"
        }


3- NONE
Thread-safe değildir. Tek bir thread'in erişeceği durumlar için performans avantajı sağlar.

        val nonThreadSafeValue: String by lazy(LazyThreadSafetyMode.NONE) {
            "Thread-safe değil"
        }



Lazy Evaluation vs Non-Lazy
Özellik	                Lazy Evaluation	                                                            Non-Lazy (Eager)

Hesaplama Zamanı	    İlk erişimde hesaplanır.	                                            Program başlatıldığında hesaplanır.

Performans	            Gereksiz hesaplamaları önler.	                                        Tüm işlemleri hemen yapar.

Bellek Kullanımı	    Bellek kullanımı ertelenir.	                                            Başlangıçta daha fazla bellek kullanabilir.

Kullanım Durumu	        Geciktirilebilir, nadiren erişilen değerler için uygundur.	            Hemen erişilecek veya sık kullanılan değerler için uygundur.

 */

/*
Lazy Evaluation Alternatifleri
Kotlin'deki diğer tembel değerlendirme örnekleri:

1- Sequence (Tembel Koleksiyonlar): Büyük koleksiyonları işlemede, yalnızca gerekli elemanları hesaplar.

        val lazySequence = sequence {
            yield(1)
            yield(2)
            yield(3)
        }
        lazySequence.forEach { println(it) }

2- flow (Kotlin Coroutines): Tembel veri akışı sağlar.


Sonuç:
Lazy evaluation, kaynakları etkin bir şekilde kullanmak ve gereksiz hesaplamalardan kaçınmak için idealdir.

by lazy delegasyonu, yalnızca bir değere ihtiyaç duyulduğunda hesaplanmasını sağlayarak performansı artırır.

Thread-safe yapılandırma seçenekleriyle farklı kullanım durumlarına uygun hale gelir.

 */