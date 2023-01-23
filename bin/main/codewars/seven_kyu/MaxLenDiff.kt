package codewars.seven_kyu

import kotlin.math.max

/** Finds the maximum difference between any given string from the first array and any string from the
 * second array */
fun mxdiflg(a1: Array<String>, a2: Array<String>): Int {
    if (a1.isEmpty() || a2.isEmpty()) {
        return -1
    }
    return max(
        a1.maxOf { it.length }.minus(a2.minOf { it.length }),
        a2.maxOf { it.length }.minus(a1.minOf { it.length })
    )
}

fun main() {
    val greatestDiff = mxdiflg(arrayOf("hello", "hi"), arrayOf("goodbye", "bye"))
    println(greatestDiff)
}