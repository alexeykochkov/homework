fun printInfo (bankCard: BankCard) {
    bankCard.infoAboutAvalibaleFunds()
    println("[!]")
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
        println("[!]")
    }

    run {
        val card = BlackAssCreditCard (balance = 200.0, credit = 15000.0)
        card.addMoney(15000.0)
        printInfo(card)
        println("[!]")
    }
}