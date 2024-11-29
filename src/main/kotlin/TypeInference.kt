package org.example

/** Kotlin strongly typed bir dildir. */
/** Kotlin'de type inference vardır. Yani değişkenin türünü bazı durumlarda anlayabilir. */
fun main() {
    val name= "Donn"
    val age = 33
}

/*
Kotlin’in strongly typed bir dil (güçlü tip denetimine sahip bir dil) olması, değişken türlerinin derleme zamanı sırasında kesin olarak belirlenmesi
ve tür uyumluluğunun sıkı bir şekilde kontrol edilmesi anlamına gelir. Bu, tür güvenliğini artırır ve hataların erken aşamada yakalanmasını sağlar.

Strongly Typed Ne Demektir?
1- Tür Uyumluluğu Kontrolü (Type Safety):
Kotlin'de bir değişken tanımlandığında, türü net bir şekilde belirlenir ve başka bir türle karıştırılamaz.
Örneğin, bir String değişkenine doğrudan bir Int atanamaz:

        val name: String = "John"
        val age: Int = 25
        // name = age // HATA: Type mismatch


2- Implicit Conversion (Örtük Dönüşüm Yok):
Kotlin, türler arasında otomatik dönüşüm yapmaz.
Eğer bir Int değeri Long türüne atanacaksa, dönüşüm açık bir şekilde belirtilmelidir:

        val number: Int = 42
        val longNumber: Long = number.toLong() // Dönüşüm açıkça belirtilmeli

3- Derleme Zamanı Tür Kontrolü:
Kodun tür kontrolü derleme zamanı sırasında yapılır, bu da runtime (çalışma zamanı) hatalarını azaltır.
Derleyici, tür uyumsuzluklarını kod çalıştırılmadan önce bildirir.



Kotlin’in Strongly Typed Özelliğinin Avantajları
    1- Tür Hatalarını Erken Tespit Etme:
Derleme zamanı kontrolleri sayesinde runtime sırasında oluşabilecek tür hataları önlenir.

    2- Tür Güvenliği (Type Safety):
Kodun öngörülebilirliğini ve güvenilirliğini artırır.
Yanlış türlerin yanlış yerlerde kullanılmasını önler.

    3- Kodun Okunabilirliği ve Bakımı:
Türlerin açıkça belirtilmesi veya çıkarımı, kodun ne yaptığını anlamayı kolaylaştırır.

    4- Koleksiyonlarda Tür Güvenliği:
Jenerikler sayesinde bir koleksiyonun içinde yalnızca belirli türde verilerin bulunması garanti edilir.


 */