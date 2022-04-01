/* Integers have a max value of 2^32 - 1, so for numbers that exceed that limit, you should use Longs.  */

/** Returns the sum of an array of large numbers where the first number in the array is the amount of numbers,
 * not including itself. */
fun aVeryBigSum(ar: Array<Long>): Long {
    ar[0] = 0
    return ar.sum()
}

val input = arrayOf<Long>(5, 1_000_000_001, 1000000002, 1000000003, 1000000004, 1000000005)

fun main() {
    println(aVeryBigSum(input))
}
