import java.io.File

fun main() {

    //Part 1
    val file = File("src/main/Textfiles/input-day1-2020.txt")
    val list = file.readLines()
    val listOfNumbers = list.map { it.toInt() }
    var multipliedSum = 0

    for (i in listOfNumbers.indices) {
        for (y in listOfNumbers.indices) {
            val sum = listOfNumbers[i] + listOfNumbers[y]
            if (sum == 2020) {
                multipliedSum = listOfNumbers[i] * listOfNumbers[y]
            }
        }
    }
    println("Part 1: $multipliedSum")

    //Part 2
    var threeNumbersMulti = 0
    for (i in listOfNumbers.indices) {
        for (y in listOfNumbers.indices) {
            for (x in listOfNumbers.indices) {
                val sum = listOfNumbers[i] + listOfNumbers[y] + listOfNumbers[x]
                if (sum == 2020) {
                    threeNumbersMulti = listOfNumbers[i] * listOfNumbers[y] * listOfNumbers[x]
                }
            }
        }

    }
    println("Part 2: $threeNumbersMulti")
    
}