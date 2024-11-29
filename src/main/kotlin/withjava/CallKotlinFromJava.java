package withjava;

import org.example.withjava.Customer;
import org.example.withjava.StringExtensions;
//import org.example.withjava.StringExtensionsKt;

import java.util.ArrayList;
import java.util.List;

public class CallKotlinFromJava {

    public void processCustomer(Customer customer) {
        customer.customerHasLongName();

        // Kotlin extension fonksiyonu, Java üzerinden çağırma:
//        customer.getName().initials() // hata veriyor, olmuyor. Ne yapmalı?
//        String extensionResult = StringExtensionsKt.initials(customer.getName());
        // Kotlin bizim için bir dosya generate ediyor. Bunun sayesinde üstteki gibi çağırabiliyoruz.

/**
 * Not:
 String extensionResult = StringExtensionsKt.initials(customer.getName());
 * Satırını yorum satırına aldım, çünkü StringExtensionsKt dosyasında JVM name ile file name'i değiştirdim.
 */
        String extensionResult = StringExtensions.initials(customer.getName());

    }

    public List<Customer> processedCustomers() {
        return new ArrayList<Customer>();
    }

    public Customer customerFromSocial(String handle) {
        // social api ...
        return new Customer("Bob");
    }


}
