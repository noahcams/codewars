package hacker_rank

/** Prints a staircase of size n
 * Example: n = 4
 * output:     #
 *            ##
 *           ###
 *          #### */
fun staircase(n: Int): Unit {
    for (num in 1..n) {
        println(" ".repeat(n - num).plus("#".repeat(num)))
    }
}

fun main() {
    println(staircase(6))
}

