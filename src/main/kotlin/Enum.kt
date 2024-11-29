package org.example

/**
 * Enums:
 * Tipleri gruplar
 *
 * Account Types:
 * Bronze
 * Silver
 * Gold
 * Platinum
 */


/*
enum class AccountType {
    BRONZE, SILVER, GOLD, PLATINUM
}

fun main() {
    println(AccountType.GOLD)

    val type = AccountType.valueOf("SILVER") // eğer değeri bulamazsa hata verir.
    println("type: $type")
}
 */

/*
class ImpEnum(val firstName: String, val lastName: String, var accountType: AccountType = AccountType.BRONZE) {

}

fun main() {
    val user = ImpEnum("musti", "kocer", AccountType.GOLD)

}
 */

/**
 * Enum Constructor Parameters
 *
 */

/*
    enum class AccountType2(val odulCarpani: Int, val numberOfSubs: Int) {
        BRONZE(10,1), // 10
        SILVER(15,5), // 15
        GOLD(20,10), //20
        PLATINUM(25,15), //25
    }

    fun main() {
        println(AccountType2.GOLD)
        println(AccountType2.GOLD.odulCarpani)
        println(AccountType2.GOLD.numberOfSubs)

        val value = AccountType2.valueOf("Platinum".uppercase())
        println(value)
        println(value.odulCarpani)
        println(value.numberOfSubs)
    }
 */

/**
 * How to Create Abstract Functions Inside of a Kotlin Enum
 *
 * ÇOK_ÖNEMLİ: ENUM class'lar, diğer class'ları extend edemezler,
 * Enum class'ın type'ı FINAL olarak tanımlanmıştır, yani zaten extend veremez.
 * Bunlar yüzünden enum class, başka bir enum class'ı extend edemez.
 */

enum class AccountType3 : Month {

    BRONZE { // 10
        override fun calculateDiscountPercent(): Int = 10
    },
    SILVER { // 15
        override fun calculateDiscountPercent(): Int = 15
    },
    GOLD { //20
        override fun calculateDiscountPercent(): Int = 20
    },
    PLATINUM { //25
        override fun calculateDiscountPercent(): Int = 25
    };

    abstract fun calculateDiscountPercent(): Int

    override fun howManyMonth(): String = "Enough year"

}

enum class Price {
    HELLO {
        override fun priceOfSubs(): Int = 150
    },
    HI {
        override fun priceOfSubs(): Int = 200
    };

    abstract fun priceOfSubs(): Int
}

interface Month {
    fun howManyMonth(): String
    fun howManyYear() {
        println("0 year")
    }
}

/*
    fun main() {
        val fromApi = "Silver"
        val accountType = AccountType3.valueOf(fromApi.uppercase())
        println(accountType.calculateDiscountPercent())
    }
 */
/**
 * How to iterate enum values?
 */

/*
    fun main() {
        for (accountType in AccountType3.values()) {
            println(accountType)
        }
        for ((index, accountType) in AccountType3.values().withIndex()) {
            println("index ${index}, accountType $accountType")
        }
        println("-_-_-_--_-_-_--_-_-_--_-_-_-")
        AccountType3.values().forEach { accountType -> println(accountType) }
        AccountType3.values().forEachIndexed { index, accountType -> println("index ${index}, accountType $accountType") }

    }
 */

/**
 * How to Add Static Methods to Kotlin Enums
 */


enum class AccountType {
    BRONZE, SILVER, GOLD, PLATINUM;

    companion object{
        fun getAccountTypeByName(name: String) = valueOf(name.uppercase())
    }
}

fun main() {
    val accountType = AccountType.getAccountTypeByName("Platinum")
    println(accountType)
}