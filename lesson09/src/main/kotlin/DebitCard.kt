open class DebitCard (balance: Double): BankCard (balance) {

    override fun addMoney(value: Double) {
        balance_ = balance_ + value
    }
    override fun pay(value: Double): Boolean {
        val costGoods = 50
        balance_ = balance_ - costGoods
        if (balance_ >= 0) {
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
