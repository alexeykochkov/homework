fun main() {
    var swordsJuggling: Int? = null
    val isJugglingProficient = (1..3).shuffled().last() == 3
    if (isJugglingProficient) {
        swordsJuggling = 2
    }
//    proficiencyCheck(swordsJuggling)
//    swordsJuggling = swordsJuggling!!.plus(1)
//    println("You juggle $swordsJuggling swords!")
    try {
        proficiencyCheck(swordsJuggling)
        swordsJuggling = swordsJuggling!!.plus(1)
    } catch (e: Exception) {
        println(e)
    }
    println("You juggle $swordsJuggling swords!")
}
fun proficiencyCheck(swordsJuggling: Int?) {
//    swordsJuggling ?: throw IllegalStateException("Player cannot juggle swords")
    swordsJuggling ?: throw UnskilledSwordJugglerException()
}
class UnskilledSwordJugglerException() :
    IllegalStateException("Player cannot juggle swords")