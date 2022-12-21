package impls

import Bonus

class CashbackBonus: Bonus {
    override fun addMoney(replenishment: Double):Double {
        return 0.0
    }

    override fun pay(payment: Double): Double {
        if (payment > 5000) {
            val cashBack = payment * 0.05
            println("your cashback is ${cashBack}")
            return cashBack
        }
        return 0.0
    }
}