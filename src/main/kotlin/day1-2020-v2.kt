import java.io.File

fun main(){

    val numbers = File("src/main/Textfiles/input-day1-2020.txt").readLines().map { it.toInt() }

    for (i in numbers.indices){
        for (y in i until numbers.size){
            if (numbers[i] + numbers[y] == 2020)
                println("Part 1: " + numbers[i] * numbers[y])


            for (j in y until numbers.size)
                if (numbers[i] + numbers[y] + numbers[j] == 2020)
                    println("Part 2: "+ numbers[i]*numbers[j]*numbers[y])
        }
    }

    // Annat sett att lösa uppgiften
    fun partOne(total: Int) = numbers.filter { numbers.contains(total - it) }
    fun partTwo(total: Int) = numbers.filter { partOne(total - it).isNotEmpty()}

    println("Part 1: " + partOne(2020).let { it[0] * it[1] })
    println("Part 2: " + partTwo(2020).let { it[0] * it[1] * it[2] })
}


// Inspiration från https://www.reddit.com/r/adventofcode/comments/k4e4lm/2020_day_1_solutions/
