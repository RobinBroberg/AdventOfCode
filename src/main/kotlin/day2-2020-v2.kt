import java.io.File
fun main() {

    val input = File("src/main/Textfiles/input-day2-2020.txt").readLines()
    var countOne = 0
    var countTwo = 0
    for (line in input) {

        val password = line.substringAfter(":")
        val letter = line.substringAfter(" ").substringBefore(":").single()
        val range = line.substringBefore(" ").let {
            val (start, end) = it.split("-")
            start.toInt()..end.toInt()
        }
        if (password.count() { it == letter } in range)
            countOne++
        if ((password[range.first] == letter) xor (password[range.last] == letter)) //xor ger true om bara en är true
            countTwo++
    }
    println(countOne)
    println(countTwo)
}

// Inspiration från https://blog.jetbrains.com/kotlin/2021/07/advent-of-code-in-idiomatic-kotlin-day2/