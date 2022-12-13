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
        val greetingFunction = { playerName: String, numBuildings: Int ->
        val currentYear = 2018
        println("Adding $numBuildings houses")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }
        runSimulation("Guyal", greetingFunction)
}
    fun runSimulation(playerName: String, greetingFunction: (String, Int) -> String) {
        val numBuildings = (1..3).shuffled().last() // Случайно выберет 1, 2 или 3
        println(greetingFunction(playerName, numBuildings))
    }



