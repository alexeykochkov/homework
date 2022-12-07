open abstract class BankCard (balance: Double) {
    protected var balance_ = balance

    abstract fun addMoney(replenishment: Double)

    abstract fun pay(payment: Double): Boolean

    open fun infoBalance () {
        println("on your account ${balance_} rubles")
    }
    public fun getBalance (): Double {
        return balance_
    }

    open fun infoAboutAvalibaleFunds() {
        infoBalance()
    }
}