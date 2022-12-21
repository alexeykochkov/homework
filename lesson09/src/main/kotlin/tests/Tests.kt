package tests

import impls.BlackAssDebitCard
import impls.CreditCard
import impls.DebitCard
import interfaces.BankCard

fun printInfo (bankCard: BankCard) {
<<<<<<< HEAD:lesson09/src/main/kotlin/tests/Tests.kt
    bankCard.infoBalance()
=======
    bankCard.infoAboutAvalibaleFunds()
    println("[!]")
>>>>>>> 727821e93044f1e4d233bf128014813d15a266d8:lesson09/src/main/kotlin/Main.kt
}
fun main(args: Array<String>) {
    run {
        val card = DebitCard (100.0)
        printInfo(card)
        println("[!]")
    }
    run {
        val card = CreditCard (balance = 0.0, 10000.0)
        card.addMoney(value = 5000.0)
        printInfo(card)
        card.pay(value = 8000.0)
        printInfo(card)
        println("[!]")
    }

    run {
        val card = BlackAssDebitCard (balance = 100.0)
        card.addMoney(10000.0)
        printInfo(card)
<<<<<<< HEAD:lesson09/src/main/kotlin/tests/Tests.kt
        val payment = 17000.0
        if (card.getBalance() < payment) {
            println("no money")
            card.addMoney(18000.0)
        }
        card.pay(payment)
=======
        println("[!]")
    }

    run {
        val card = BlackAssCreditCard (balance = 200.0, credit = 15000.0)
        card.addMoney(15000.0)
        printInfo(card)
        println("[!]")
>>>>>>> 727821e93044f1e4d233bf128014813d15a266d8:lesson09/src/main/kotlin/Main.kt
    }
}
