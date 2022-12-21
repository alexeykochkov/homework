import impls.BlackAssDebitCard
import interfaces.BankCard

fun printInfo (bankCard: BankCard) {
    bankCard.infoBalance()
}
fun createCard (configFileName:String): BankCard {
    val card = BlackAssDebitCard (balance = 100.0)
    return card
}

fun main(args: Array<String>) {
    val configFileName = args[1]
//    configugation / object graph creation
    val card = createCard (configFileName)

//    usage
    card.addMoney(10000.0)
    printInfo(card)
    val payment = 17000.0
    if (card.getBalance() < payment) {
        println("no money")
        card.addMoney(18000.0)
    }
    card.pay(payment)
}