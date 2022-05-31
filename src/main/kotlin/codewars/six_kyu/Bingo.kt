package codewars.six_kyu

/** Returns true if the amount of character codes of any letter in a string that match their paired integer are greater
 *  than or equal to the winning number. Each character code can only count as one point. */
fun bingo(ticket: Array<Pair<String, Int>>, win: Int): String {
    var numPoints = 0
    val charCodes = mutableListOf<Int>()
    for ((str, num) in ticket) {
        var matchingCode = false
        for (c in str.split("")) {
            if (c.isNotEmpty() && c.first().code == num) matchingCode = true
        }
        if (matchingCode && num !in charCodes) {
            charCodes.add(num)
            numPoints++
        }
    }
    return if (numPoints >= win) "Winner!" else "Loser!"
}

fun main() {
    println(bingo(arrayOf("ABC" to 65, "HGR" to 74, "BYHT" to 74), 2)) // expected: "Loser!"
}