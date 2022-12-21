import interfaces.BankCard
import impls.BankCardImpl

open class DebitCard (balance: Double): BankCardImpl(balance) {

    override fun addMoney(value: Double) {
        balance_.add(value)
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
    override fun infoBalance () {
        super.infoBalance()
    }
}
