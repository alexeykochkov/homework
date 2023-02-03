//abstract class Warrior (healpoints:Int) {
//
//    var healpoints_ = healpoints
//
//    abstract fun attack (another_warrior: Warrior)
//    abstract fun getDamage(damage:Int)
//}
//
//class Pion (healpoints: Int):Warrior (healpoints) {
//
//    override fun attack(another_warrior: Warrior) {
//       another_warrior.getDamage(10)
//    }
//
//    override fun getDamage(damage: Int) {
//        healpoints_ = healpoints_ - damage
//    }
//}
//
//class Zerg (healpoints: Int):Warrior (healpoints) {
//
//    override fun attack(another_warrior: Warrior) {
//        another_warrior.getDamage(2)
//    }
//
//    override fun getDamage(damage: Int) {
//        healpoints_ = healpoints_ - damage
//    }
//}
//fun createFakeArmy (): MutableList<Warrior> {
//    var army = mutableListOf<Warrior>()
//    var countPions = readln().toInt()
//    var countZerg = readln().toInt()
//    for (i in 0..countPions) {
//        var pion = Pion (healpoints = 10)
//        army.add(pion)
//    }
//    for (i in 0..countZerg) {
//        var zerg = Zerg (healpoints = 20)
//        army.add(zerg)
//    }
//    return army
//}
//fun fight (worrior1:Warrior, worrior2:Warrior) {
//    worrior1.attack(worrior2)
//    worrior2.attack(worrior1)
//}
//
//fun main () {
////    var healpoints: Int = 10
////    val worrior1 = Pion (healpoints)
////    val worrior2 = Pion (20)
////    worrior1.attack(worrior2)
////    println(worrior2.healpoints_)
//    var army = createFakeArmy()
//    var army1 = createFakeArmy()
//
////        var healpoints: Int = 10
////    val worrior1 = Pion (healpoints)
////    val worrior2 = Zerg (20)
////    val worrior1 = army[1]
////    val worrior2 = army1 [0]
//    while (true) {
//        val worrior1 = army[1]
//        val worrior2 = army1 [0]
//     fight(worrior1=worrior1,worrior2 = worrior2)
//        println("Zerg${worrior2.healpoints_}\nPion${worrior1.healpoints_}")
//
//        if (worrior2.healpoints_ <= 0 || worrior1.healpoints_<= 0) {
//            println("Dead")
//            break
//        }
//
//    }
//}