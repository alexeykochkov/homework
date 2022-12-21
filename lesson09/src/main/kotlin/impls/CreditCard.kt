import impls.BankCardImpl
import interfaces.BankCard
import kotlin.math.abs
import impls.Balance
open class CreditCard (balance: Double, credit: Double): BankCardImpl(balance) {
    var credit_ = credit
    private val MAX_CREDIT_LIMIT_ = 10000.0

    init {
        if (credit_ < MAX_CREDIT_LIMIT_ && balance_.getBalance() > 0) {
            throw IllegalArgumentException ("Bad Argument")
        }
    }
    override fun addMoney(value: Double) {
        val addMoney = value
        var newCredit = credit_ + addMoney
        var overMoney = newCredit - MAX_CREDIT_LIMIT_
        if (overMoney > 0) {
            balance_.add(overMoney)
            credit_ = MAX_CREDIT_LIMIT_
        } else {
// проверка дабл на 0
            check(abs (balance_.getBalance()) < 1e-5)
            credit_ = newCredit
        }
    }

    override fun pay(value: Double): Boolean {
        val payMoney = 8000
        var newBalance = balance_.getBalance() - payMoney
        if (newBalance >= 0) {
            balance_ = Balance(newBalance)
        } else {
            balance_ = Balance(0.0)
            credit_ = credit_ + newBalance
        }
        return true
    }

    override fun infoAboutAvalibaleFunds() {
        super.infoAboutAvalibaleFunds()
        println("your credit limit is ${credit_}")
    }
}

