package hacker_rank

/** Given an Array of Ints, calculates the ratio of positives, negatives and 0 to 6 decimal places and prints them */
fun plusMinus(arr: Array<Int>) {
    println(ratio(arr, arr.count { it > 0 }))
    println(ratio(arr, arr.count { it < 0 }))
    println(ratio(arr, arr.count { it == 0 }))
}

fun ratio(arr: Array<Int>, count: Int): String {
    return "%.6f".format(count.toDouble() / arr.size)
}

fun main() {
    println(
        plusMinus(
            arrayOf(-4, 3, -9, 0, 4, 1)
        )
    )
}