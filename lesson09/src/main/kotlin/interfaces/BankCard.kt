package interfaces
interface BankCard {

    fun addMoney(replenishment: Double)

    fun pay(payment: Double): Boolean

    fun infoBalance ()

    fun getBalance (): Double
 }
