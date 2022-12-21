fun main(args: Array<String>) {
    val name = "Madrigal"
    var healthPoints = 89
    val isBlessed = true
    val isImmortal = false
    val auraColor = auraColore(isBlessed, healthPoints, isImmortal)
    //    println(auraColor)
    val race = "gnome"
    val faction = when (race) {
        "dwarf" -> "Keepers of the Mines"
        "gomne" -> "Keepers of the Mines"
        "orc"-> "Free People of the Rolling Hills"
        "human" -> "Free People of the Rolling Hills"
        else -> "no race"
    }
//    if (auraVisible) {
//        println("GREEN")
//    } else {
//        println("NONE")
//    }
// Аура
//    if (isBlessed && healthPoints > 50 || isImmortal) {
//        println("GREEN")
//    } else {
//        println("NONE")
//    }
    val healthStatus = formatHealthStatus(healthPoints, isBlessed)

    printPlayerStatus(auraColor, isBlessed, name, healthStatus)
    castFireball()
    printPlayerStatus(
        healshStatus = healthStatus,
        auraColor = "NONE",
        name = "Madrigal",
        isBlessed = true)
//    val healshStatus = if (healthPoints == 100) {
//        "is in excellent condition!"
////        println(name + "is in excellent condition!")
//    } else if (healthPoints in 90..99) {
//        "has a few scratches."
////        println(name + " has a few scratches.")
//    } else if (healthPoints in 75..89) {
//        if (isBlessed) {
//            "has some minor wounds but is healing quite quickly!"
////            println(name + " has some minor wounds but is healing quite quickly!")
//        } else {
//            "has some minor wounds."
////            println(name + " has some minor wounds.")
//        }
//    } else if (healthPoints in 15..74) {
//        " looks pretty hurt."
////        println(name + " looks pretty hurt.")
//    } else {
//        " is in awful condition!"
////        println(name + " is in awful condition!")
//    }
//    println(name + " " + healshStatus)
}

private fun printPlayerStatus(
    auraColor: String,
    isBlessed: Boolean,
    name: String,
    healshStatus: String
) {
    println("(Aura: $auraColor) " + " (Blessed: ${if (isBlessed) "YES" else "NO"})")
    println("$name $healshStatus")
}

private fun auraColore(isBlessed: Boolean, healthPoints: Int, isImmortal: Boolean): String {
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    val auraColor = if (auraVisible) "GREEN" else "NONE"
    return auraColor
}
private fun castFireball (numFireballs: Int = 2) =
    println("A glass of Fireball springs into existence. (x$numFireballs)")

private fun formatHealthStatus(healthPoints: Int, isBlessed: Boolean) =
    when (healthPoints) {
        100 -> "is in excellent condition!"
        in 90..99 -> "has a few scratches."
        in 75..89 -> if (isBlessed) {
            "has some minor wounds but is healing quite quickly!"
        } else {
            "has some minor wounds."
        }
        in 15..74 -> "looks pretty hurt."
        else -> " is in awful condition!"
    }
