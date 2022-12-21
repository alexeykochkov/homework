import impls.BlackAssDebitCard
import impls.CreditCard
import impls.DebitCard
import interfaces.BankCard

fun printInfo (bankCard: BankCard) {
    bankCard.infoBalance()
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
    }

    run {
        val card = BlackAssDebitCard (balance = 100.0)
        card.addMoney(10000.0)
        printInfo(card)
        val payment = 17000.0
        if (card.getBalance() < payment) {
            println("no money")
            card.addMoney(18000.0)
        }
        card.pay(payment)
    }
}