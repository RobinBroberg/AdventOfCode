import java.io.File


fun main() {
    partOne()
    partTwo()
}
fun partOne() {

    val file = File("src/main/Textfiles/input-day3-2016.txt").readLines()
    var count = 0
    var sides: List<Int>
    for (line in file) {
        sides = line.trim().split("\\s+".toRegex()).map { it.toInt() }
        if (sides[0] + sides[1] > sides[2] && sides[1] + sides[2] > sides[0] && sides[0] + sides[2] > sides[1]) {
            count++
        }
    }
    println(count)
}
fun partTwo() {

    val file = File("src/main/Textfiles/input-day3-2016.txt").readLines()
    val list = mutableListOf<Int>()
    val list2 = mutableListOf<Int>()
    val list3 = mutableListOf<Int>()
    var sides: List<Int>
    var count2 = 0
    for (line in file){
        sides = line.trim().split("\\s+".toRegex()).map { it.toInt() }
        for (i in sides.indices step 3){
            list.add(sides[0])
            list2.add(sides[1])
            list3.add(sides[2])
        }

    }
    for (i in 0 until list.size - 2 step 3){
        if (list[i] + list[i+1] > list[i+2] && list[i] + list[i+2] > list[i+1] && list[i+1] + list[i+2] > list[i]) {
            count2++
        }
        if (list2[i] + list2[i+1] > list2[i+2] && list2[i] + list2[i+2] > list2[i+1] && list2[i+1] + list2[i+2] > list2[i]) {
            count2++
        }
        if (list3[i] + list3[i+1] > list3[i+2] && list3[i] + list3[i+2] > list3[i+1] && list3[i+1] + list3[i+2] > list3[i]) {
            count2++
        }
    }

    println(count2)
}