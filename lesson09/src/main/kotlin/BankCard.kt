open abstract class BankCard (balance: Int) {
    protected var balance_ = balance

    abstract fun addMoney(value: Int)

    abstract fun pay(value: Int): Boolean

    open fun infoBalance () {
        println("on your account ${balance_} rubles")
    }
    public fun getBalance (): Int {
        return balance_
    }

    open fun infoAboutAvalibaleFunds() {
        infoBalance()
    }
}