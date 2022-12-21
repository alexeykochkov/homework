package impls

import interfaces.BankCard

open class DebitCard (balance: Double): BankCard {
    private var balance_ = Balance(balance)

    override fun addMoney(value: Double) {
        balance_.add(value)
    }
    override fun getBalance(): Double {
        return balance_.getBalance()
    }

    override fun infoBalance() {
        return balance_.infoBalance()
    }
    override fun pay(value: Double): Boolean {
        val costGoods = value
        balance_.add(- costGoods)
        if (balance_.getBalance() >= 0) {
            println("purchase completed")
            return true
        }
        else {
            println("not enought money")
            return false
        }
    }
}
