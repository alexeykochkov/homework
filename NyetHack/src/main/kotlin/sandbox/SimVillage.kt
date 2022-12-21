package sandbox

fun main(args: Array<String>) {

//    [! Анонимная функция]

//    println({
//        val currentYear = 2018
//        "Welcome to SimVillage, Mayor! (copyright $currentYear)"
//    }())
//
//    [! Анонимная функция]

//   {    val currentYear = 2018
//        "Welcome to SimVillage, Mayor! (copyright $currentYear)"
//    }()

//    [! Присваивание переменной анонимной функции]

//    val greetingFunction: (String) -> String = {playerName ->
//        val currentYear = 2018
//        "Welcome to SimVillage, $playerName (copyright $currentYear)"
//    }
//    println(greetingFunction("Guyal"))

//    [! используем ключевое слово it]

//    val greetingFunction: (String) -> String = {
//        val currentYear = 2018
//        "Welcome to SimVillage, $it! (copyright $currentYear)"
//    }
//    println(greetingFunction("Guyal"))

//    [!получение нескольких аргументов в анонимную функцию]

//    val greetingFunction: (String, Int) -> String = { playerName, numBuildings ->
//        val currentYear = 2018
//        println("Adding $numBuildings houses")
//        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
//    }
//        println(greetingFunction("Guyal", 2))

//    [!автоматическое определение типов]

//    val greetingFunction = { playerName: String, numBuildings: Int ->
//        val currentYear = 2018
//        println("Adding $numBuildings houses")
//        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
//    }
//    println(greetingFunction("Guyal", 2))

//    [!функция которая принимает функцию]
//    val greetingFunction = { playerName: String, numBuildings: Int ->
//        val currentYear = 2018
//        println("Adding $numBuildings houses")
//        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
//    }
//    runSimulation("Guyal", greetingFunction)
//}
//    inline fun runSimulation(playerName: String, greetingFunction: (String, Int) -> String) {
//        val numBuildings = (1..3).shuffled().last() // Случайно выберет 1, 2 или 3
//        println(greetingFunction(playerName, numBuildings))
//    }

//     [! ссылка на функцию]
//    runSimulation("Guyal", ::printConstructionCost) { playerName, numBuildings ->
//        val currentYear = 2018
//        println("Adding $numBuildings houses")
//        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
//    }
//}
//    inline fun runSimulation(playerName: String,
//                         costPrinter: (Int) -> Unit,
//                         greetingFunction: (String, Int) -> String) {
//    val numBuildings = (1..3).shuffled().last() // Случайно выберет 1, 2 или 3
//    costPrinter(numBuildings)
//    println(greetingFunction(playerName, numBuildings))
//}
//fun printConstructionCost(numBuildings: Int) {
//    val cost = 500
//    println("construction cost: ${cost * numBuildings}")
//}

//    [!Тип функции как возвращаемый тип]

    runSimulation()

}
fun runSimulation() {
    val greetingFunction = configureGreetingFunction()
    println(greetingFunction("Guyal"))
}
fun configureGreetingFunction(): (String) -> String {
    val structureType = "hospitals"
    var numBuildings = 5
    return { playerName: String ->
        val currentYear = 2018
        numBuildings += 1
        println("Adding $numBuildings $structureType")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }
}
