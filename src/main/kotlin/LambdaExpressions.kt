package org.example

fun main() {
//    val lambdaName: (InputType) -> ReturnType = { arguments:InputType -> body }

    val greeter: (String) -> String = { name: String ->
        val foo = 0
        "Hello $name"
    }

    println(greeter("Donn"))

    val greeter2: (String, String) -> String = { name: String, surname: String ->
        val modifiedName = name.lowercase()
        val modifiedSurname = surname.uppercase()
        "Hello $modifiedName $modifiedSurname"
    }
    println(greeter2("Donn", "Felker"))


    lineLogger({
        repeat(5) {
            println("Hello There")
            println("Hello Again")
            println("Hello Broo")
        }

    })

//    lineLogger{
//        println("Hello There")
//        println("Hello Again")
//    }

    repeater(5) { index ->
        println("index : $index ")
        if (index < 3) {
            // Hello 3 times
            println("Hello")
        } else {
            // Goodbye 2 times
            println("Goodbye")
        }
    }


    derbyAnnouncer({ player: String ->
        "$player is a great asset to the team"
    })

    underscoreForUnusedParams()
}

fun lineLogger(block: () -> Unit) {
    repeat(5) { println("--------") }
    block()
    repeat(5) { println("--------") }
}

fun repeater(times: Int, block: (Int) -> Unit) {
    repeat(times) { index -> block(index) }
}

fun derbyAnnouncer(block: (String) -> String) {
    val players = listOf(
        "ali",
        "hasan",
        "ferdi",
        "alex",
        "kuyt",
        "stoch",
    )

    val randomWord = players.random()
    println("The next player is ... $randomWord")
    val log = block(randomWord)
    println(log)
}

/**
 * ÖNEMLİ_NOT: Eğer lambda fonksiyonda kullanmadığın bir değer varsa onun yerine bir değişken ismi vermek yerine "_" underscore kullanabilirsin.
 */
fun thisFuncIsAGarbage(callback: (Int, String) -> Unit) {
    callback(1, "Hello")
}

fun underscoreForUnusedParams() {
    thisFuncIsAGarbage { index, _ -> // kullanmadığım string parametresine bir isim vermek yerine _ kullandım.
        println("index: $index")
    }
}