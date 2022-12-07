class BlackAssCreditCard (balance: Double, credit: Double): CreditCard (balance,credit) {
    val zeroBonus_ = CashbackBonus ()
    val secondBonus_ = SavingsBonus()

    override fun pay(payment: Double): Boolean {
        var succsess = super.pay(payment)
        if (!succsess) {
            println("payment deny")
            return false
        }
        addMoney(zeroBonus_.pay(payment))
        return true
    }

    override fun addMoney(replenishment: Double) {
        val savings = secondBonus_.addMoney(replenishment)
        println("youe savings is ${savings}")
        super.addMoney(replenishment + savings)
    }
}