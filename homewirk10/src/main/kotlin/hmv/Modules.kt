package hmv

import java.util.ArrayDeque

enum class Ammo(var damage: Int, var criticalDamageChance: Double, var coef: Double) {
    FIRE_BULLET(10, 0.25, 5.0),
    ICE_BULLET(20, 0.20, 10.0),
    ATOMIC_BULLET(40, 0.10, 50.0);


    fun getCurrentDamage(): Int {
        if (isCritical()) {
            return (damage * coef).toInt()
        }
        return damage
    }

    fun isCritical(): Boolean {
        val MAX_VAL = 99
        var random = (0..MAX_VAL).random()
        val trashHold = criticalDamageChance * MAX_VAL
        return random < trashHold
    }
}


class WareStack<T>() {
    private var stack_ = ArrayDeque<T>()

    fun size(): Int {
        return stack_.size
    }

    fun push(item: T) {
        stack_.push(item)
    }

    fun pop(): T? {
        if (isEmpty()) {
            return null
        } else {
            return stack_.pop()
        }
    }

    fun isEmpty(): Boolean {
        return stack_.isEmpty()
    }
}

abstract class FireType() {

    abstract fun getBurstSize(): Int


}

open class BurstsFire(val burstsSize: Int) : FireType() {

    override fun getBurstSize(): Int {
        return burstsSize
    }
}

class SingleShoot() : BurstsFire(1) {

}


class AbstractWeapon(
    val MAX_MAGAZINE_SIZE: Int,
    val fireType: FireType,
    var magazin: WareStack<Ammo>
) {

    val MAX_MAGAZINE_SIZE_ = MAX_MAGAZINE_SIZE
    val fireType_ = fireType
    val magazin_ = magazin

    fun isEmpty(): Boolean {
        return magazin_.isEmpty()
    }

    fun createAndAddAtomicBullet() {
        magazin_.push(Ammo.ATOMIC_BULLET)
    }

    fun createAndAddFireBullet() {
        magazin_.push(Ammo.FIRE_BULLET)
    }

    fun reloadMagazine() {
        while (magazin_.size() < MAX_MAGAZINE_SIZE_) {
            magazin_.push(Ammo.FIRE_BULLET)
        }
    }

    fun getAmmo(): MutableList<Ammo?> {
        var burst = fireType_.getBurstSize()
        var ammos = mutableListOf<Ammo?>()
        while (burst > 0) {
            ammos.add(magazin_.pop())
        }
        return ammos
    }
}