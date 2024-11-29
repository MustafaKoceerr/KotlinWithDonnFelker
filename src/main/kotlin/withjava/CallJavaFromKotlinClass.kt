package org.example.withjava

import org.example.withjava.Customer
import withjava.CallKotlinFromJava

class CustomerFacade(customerService: CallKotlinFromJava){
    init {
        val customer: Customer? = customerService.customerFromSocial("@exampleUsername")
        println(customer?.name)
        /** ÖNEMLİ_NOT: Java kısmındaki koda
         * @NotNUll
         * anotasyonu getirirsen, burada object nullable gelmeyecektir.
         * */

        val customers: List<Customer?>? = customerService.processedCustomers()
        /** ÖNEMLİ_NOT: Java'daki array list, burada Kotlin List'e dönüştü.
         *
         * Bu durumda kotlin standart library'deki hazır fonksiyonlar çok değerli oluyorlar.
         * Nedeni ise map{ }, filter{ } gibi fonksiyonlar, arrayList üstünde işlem yapabiliyorlar.
         * */
    }

}