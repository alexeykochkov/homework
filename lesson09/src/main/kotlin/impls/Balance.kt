package impls

class Balance (balance: Double) {
    private var balance_ = balance
    //    так не надо делать
//    fun setBalance (balance: Double) {
//        balance_ = balance
//    }
    fun infoBalance () {
        println("on your account ${balance_} rubles")
    }
    fun getBalance (): Double {
        return balance_
    }
    fun add (replenishment: Double) {
        balance_ += replenishment
    }
}