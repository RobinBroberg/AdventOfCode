import java.io.File

fun main() {

    partOne2020()
    partTwo2020()
}
fun readFile(): List<String> {
    return File("src/main/Textfiles/input-day2-2020.txt").readLines()
}
    fun partOne2020() {


        var list: MutableList<String>
        var min: Int
        var max: Int
        var charString: String
        var count = 0


        for (line in readFile()) {
            list = line.trim().split("-", " ", ":", null.toString()).toMutableList()
            list.removeAll(listOf("", null))

            min = list[0].toInt()
            max = list[1].toInt()
            val letter = list[2]
            val char: Char = letter.first()
            charString = list[3]

            val result = charString.count { it == char }

            if (result in min..max) {
                count++
            }
        }
        println(count)
    }
fun partTwo2020(){

    var list: MutableList<String>
    var positionOne: Int
    var positionTwo: Int
    var charString: String
    var count = 0
    for (line in readFile()) {
        list = line.trim().split("-", " ", ":", null.toString()).toMutableList()
        list.removeAll(listOf("", null))

        positionOne = list[0].toInt()
        positionTwo = list[1].toInt()
        val letter = list[2]
        val char: Char = letter.first()
        charString = list[3]

        val one = charString.getOrNull(positionOne-1)
        val two = charString.getOrNull(positionTwo-1)

        if (one == char && two != char || two == char && one != char ) {
            count++
        }
    }
    println(count)

}



