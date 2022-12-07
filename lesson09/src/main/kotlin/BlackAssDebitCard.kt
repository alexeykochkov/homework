class BlackAssDebitCard (balance: Double): DebitCard (balance) {
    private var bonysPay_ = 0.0
    val zeroBonus_ = CashbackBonus()
    val secondBonus_ = SavingsBonus()

    override fun pay(payment: Double): Boolean {
        var succsess = super.pay(payment)
        if (!succsess) {
            println("payment deny")
            return false
        }
        val currentBonus = payment * 0.01
        bonysPay_ = currentBonus + bonysPay_
        println("your bonus ${bonysPay_}")
//   another featore
//        if (payment > 5000) {
//            val cashBack = payment * 0.05
//            println("your cashback is ${cashBack}")
//            addMoney(cashBack)
//        }
        addMoney(zeroBonus_.pay(payment))
        return true
    }

    override fun addMoney(replenishment: Double) {
        val savings = secondBonus_.addMoney(replenishment)
        println("youe savings is ${savings}")
        super.addMoney(replenishment + savings)
//        addMoney(savings)
    }
}