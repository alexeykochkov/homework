fun printInfo (bankCard: BankCard) {
    bankCard.infoAboutAvalibaleFunds()
}
fun main(args: Array<String>) {
    run {
        val card = DebitCard (100)
        printInfo(card)
        println("[!]")
   }
    run {
        val card = CreditCard (balance = 0, 10000)
        card.addMoney(value = 5000)
        printInfo(card)
        card.pay(value = 8000)
        printInfo(card)
    }
}