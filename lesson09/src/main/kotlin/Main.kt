fun main(args: Array<String>) {
    val myBanckCard = BankCard (100)
    val myCreditCard = CreditCard (balance = 0, 200)
    myCreditCard.addBalance()

    println("your balance is ${myCreditCard.balance_}")
    println("your credit limit is ${myCreditCard.creditLimit_}")
//    myBanckCard.addBalance()
//    myBanckCard.pay()
//    myBanckCard.pay()
//    myBanckCard.pay()
//    myBanckCard.infoBalance()

}