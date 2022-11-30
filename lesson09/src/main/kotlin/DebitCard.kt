class DebitCard (balance: Int): BankCard (balance) {

    override fun addMoney(value: Int) {
        val addMoney = 10
        balance_ = balance_ + addMoney
    }
    override fun pay(value: Int): Boolean {
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
