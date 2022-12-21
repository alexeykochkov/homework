package impls


import interfaces.BankCard
import kotlin.math.abs

open class CreditCard (balance: Double, credit: Double): BankCard {
    var credit_ = credit
    private val MAX_CREDIT_LIMIT_ = 10000.0
    private var debitPartOfBalance_ = Balance(balance)

    init {
        if (credit_ < MAX_CREDIT_LIMIT_ && debitPartOfBalance_.getBalance() > 0) {
            throw IllegalArgumentException ("Bad Argument")
        }
    }

    override fun getBalance(): Double {
        return debitPartOfBalance_.getBalance() + credit_
    }

    override fun infoBalance() {
       debitPartOfBalance_.infoBalance()
        println("credit ${credit_}")
    }
    override fun addMoney(value: Double) {
        val addMoney = value
        var newCredit = credit_ + addMoney
        var overMoney = newCredit - MAX_CREDIT_LIMIT_
        if (overMoney > 0) {
            debitPartOfBalance_.add(overMoney)
            credit_ = MAX_CREDIT_LIMIT_
        } else {
// проверка дабл на 0
            check(abs (debitPartOfBalance_.getBalance()) < 1e-5)
            credit_ = newCredit
        }
    }

    override fun pay(value: Double): Boolean {
        val payMoney = 8000
        var newBalance = debitPartOfBalance_.getBalance() - payMoney
        if (newBalance >= 0) {
            debitPartOfBalance_ = Balance(newBalance)
        } else {
            debitPartOfBalance_ = Balance(0.0)
            credit_ = credit_ + newBalance
        }
        return true
    }
}

