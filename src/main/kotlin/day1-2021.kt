import java.io.File

fun main() {

    val file = File("src/main/Textfiles/input-day1-2021.txt")
    val list = file.readLines()
    val listOfNumbers = list.map { it.toInt() }

    var count = 0
    var countTwo = 0

    for (i in 1 until listOfNumbers.size) {

        if (listOfNumbers[i] > listOfNumbers[i - 1])
            count++
    }
    println(count)

    for (i in 0 until listOfNumbers.size - 3) {
        val sum = listOfNumbers[i] + listOfNumbers[i + 1] + listOfNumbers[i + 2]
        val sumTwo = listOfNumbers[i + 1] + listOfNumbers[i + 2] + listOfNumbers[i + 3]
        if (sum < sumTwo) {
            countTwo++
        }

    }
    println(countTwo)
}



