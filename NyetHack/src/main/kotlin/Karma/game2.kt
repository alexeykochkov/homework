fun main(args: Array<String>) {
    val name = "Madrigal"
    var healthPoints = 45
    val isBlessed = true
    val isImmortal = false
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal


    val karma = (Math.pow(Math.random(), (110 - healthPoints) / 100.0) *
            20 ).toInt()
    val auraColor = when (karma) {
        in 16..20 -> "GREEN"
        in 11..15 -> "PURPLE"
        in 6..10 -> "ORANGE"
        in 0..5 -> "RED"
        else -> "NO KARMA"
    }
    println("(karma: $karma) " +
            if (auraVisible) {
                "(aura colore is: ${auraColor})"
            } else "(No Vision aura colore)")


    val race = "gnome"
    val faction = when (race) {
        "dwarf" -> "Keepers of the Mines"
        "gomne" -> "Keepers of the Mines"
        "orc"-> "Free People of the Rolling Hills"
        "human" -> "Free People of the Rolling Hills"
        else -> "no race"
    }

    val healshStatus = when (healthPoints) {
        100 -> "is in excellent condition!"
        in 90..99 -> "has a few scratches."
        in 75..89 -> if (isBlessed) {
            "has some minor wounds but is healing quite quickly!"
        } else "has some minor wounds."
        in 15..74 -> "looks pretty hurt."
        else -> " is in awful condition!"
    }
    println("$name $healshStatus")
    println("(Aura: $auraColor) " + " (Blessed: ${if (isBlessed) "YES" else "NO"})")

}