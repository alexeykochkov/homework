package impls

import Bonus

class SavingsBonus: Bonus {
    override fun addMoney(replenishment: Double):Double {
        return  (replenishment * 0.005)/100
    }

    override fun pay(payment: Double): Double {
        return 0.0
    }
}