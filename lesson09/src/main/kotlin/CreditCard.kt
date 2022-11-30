class CreditCard (balance: Int, credit: Int): BankCard (balance) {
    var credit_ = credit
    private val MAX_CREDIT_LIMIT_ = 10000

    init {
        if (credit_ < MAX_CREDIT_LIMIT_ && balance_ > 0) {
            throw IllegalArgumentException ("Bad Argument")
        }
    }
    override fun addMoney(value: Int) {
        val addMoney = value
        var newCredit = credit_ + addMoney
        var overMoney = newCredit - MAX_CREDIT_LIMIT_
        if (overMoney > 0) {
            balance_ = balance_ + overMoney
            credit_ = MAX_CREDIT_LIMIT_
        } else {
            check(balance_ == 0)
            credit_ = newCredit
        }
    }

    override fun pay(value: Int): Boolean {
        val payMoney = 8000
        var newBalance = balance_ - payMoney
        if (newBalance >= 0) {
            balance_ = newBalance
        } else {
            balance_ = 0
            credit_ = credit_ + newBalance
        }
        return true
    }

    override fun infoAboutAvalibaleFunds() {
        super.infoAboutAvalibaleFunds()
        println("your credit limit is ${credit_}")
    }
}

