open class BankCard (balance: Int) {
    var balance_: Int

    init {
        balance_ = balance
    }
    fun addBalance(): Int {
        val addMoney = 10
        var newBalance = balance_ + addMoney
        return balance_
    }

    fun pay(): Boolean {
        val costGoods = 10
        var pay = balance_ - costGoods
        if (pay >= 0) {
            return true
        }
        else
            println("Not enought money")
            return false
    }

    fun infoBalance () {
        println("Money in your card ${balance_}")
    }

    fun infoMoney() {}
}