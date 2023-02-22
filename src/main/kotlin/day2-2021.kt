import java.io.File

fun main() {
    /*
    Part 1
    Forward X increases the horizontal position of X units
    Down X increased the depth by X units
    Up X decreases the depth by X units
    */
    val file = File("src/main/Textfiles/input-day2-2021.txt")
    val list = file.readLines()
    var depth = 0
    var horizontal = 0
    var forward: Int
    var down: Int
    var up: Int

    for (i in list.indices) {
        if (list[i].startsWith("f")) {
            forward = list[i].last().digitToInt()
            horizontal += forward

        } else if (list[i].startsWith("d")) {
            down = list[i].last().digitToInt()
            depth += down

        } else {
            up = list[i].last().digitToInt()
            depth -= up
        }
    }
    val total: Int = depth * horizontal
    println("Part 1: $total")

    /*
    Part 2
    Forward X increases the horizontal position of X units and increase depth by aim * X
    Down X increased the aim by X units
    Up X decreases the aim by X units
    */
    var aim = 0
    var depthTwo = 0
    var horizontalTwo = 0

    for (i in list.indices) {
        if (list[i].startsWith("f")) {
            forward = list[i].last().digitToInt()
            horizontalTwo += forward
            depthTwo += (aim*forward)

        } else if (list[i].startsWith("d")) {
            down = list[i].last().digitToInt()
            aim += down

        } else {
            up = list[i].last().digitToInt()
            aim -= up
        }
    }
    val totalPartTwo = horizontalTwo * depthTwo
    println("Part 2: $totalPartTwo")
}