package hacker_rank


/** Receives an array of 5 integers and prints the
 * largest and smallest possible sums of 4 integers */
fun minMaxSum(arr: Array<Int>) {
    val sortedArr = arr.sortedArray()
    val smallSum = sortedArr.take(4).sumOf { it.toLong() }
    val largeSum = sortedArr.takeLast(4).sumOf { it.toLong() }
    println("$smallSum $largeSum")
}

fun minMaxSum2(arr: Array<Int>) {
    println("${arr.sumOf { it.toLong() } - arr.maxOrNull()!!} ${arr.sumOf { it.toLong() } - arr.minOrNull()!!}")
}

fun main() {
    println(minMaxSum(arrayOf(1, 3, 2, 4, 5)))
    println(minMaxSum2(arrayOf(1, 3, 2, 4, 5)))
}