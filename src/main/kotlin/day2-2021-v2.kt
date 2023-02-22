import java.io.File

fun main() {

    /* Part 1
    Forward X increases the horizontal position of X units
    Down X increased the depth by X units
    Up X decreases the depth by X units */

    val file = File("src/main/Textfiles/input-day2-2021.txt").readLines()
    val list = file.map { it.split(' ') } // Splittar listan vid mellanslag
    var depth = 0
    var horizontal = 0

    for ((direction, number) in list){
        val input = number.toInt()
        when(direction){
            "up" -> depth-=input
            "down" -> depth+=input
            "forward" -> horizontal+=input
        }
    }
   println("Part 1: " + depth * horizontal)

    /* Part 2
    Forward X increases the horizontal position of X units and increase depth by aim * X
    Down X increased the aim by X units
    Up X decreases the aim by X units */

    var aim = 0
    var depthTwo = 0
    var horizontalTwo = 0
    for ((direction, number) in list){
        val input = number.toInt()
        when(direction){
            "up" -> aim -= input
            "down" -> aim += input
            "forward" -> {
                horizontalTwo += input
                depthTwo += input * aim
            }
        }

    }
    println("Part 2: " + depthTwo * horizontalTwo)
}
// Inspiration från https://www.youtube.com/watch?v=4A2WwniJdNc&ab_channel=KotlinbyJetBrains