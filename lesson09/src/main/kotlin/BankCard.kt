open class BankCard (balance: Int) {
    var balance_: Int

    init {
        balance_ = balance
    }
    open fun addBalance() {
        val addMoney = 10
        balance_ = balance_ + addMoney
    }

    open fun pay(): Boolean {
        val costGoods = 50
        balance_ = balance_ - costGoods
        if (balance_ >= 0) {
            println("purchase completed")
            return true
        }
        else
            println("not enought money")
            return false
    }

    open fun infoBalance () {
        println("on your account ${balance_} rubles")
    }

    fun infoAboutAvalibaleFunds() {}
}