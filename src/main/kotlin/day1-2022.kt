import java.io.File

fun main() {

    //Part 1
    val file = File("src/main/Textfiles/input-day1-2022.txt")
    var emptyLine: Boolean
    var sum = 0
    val list = mutableListOf<Int>()

    file.forEachLine { line ->
        if (line.isNotEmpty()) {
            sum += line.toInt()
            list.add(sum)
            list.sort()
            list.reverse()
            emptyLine = false

        } else {
            emptyLine = true
        }
        if (emptyLine) {
            sum = 0
        }
    }
    println("Part 1: " + list[0])

    //Part 2

    val topThree = list[0] + list[1] + list[2]
    println("Part 2: $topThree")

}