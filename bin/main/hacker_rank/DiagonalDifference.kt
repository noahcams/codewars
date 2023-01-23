package hacker_rank

import kotlin.math.abs

/*
Problem:
Given a square matrix, calculate the absolute difference between the sums of its diagonals.
For example, the square matrix  is shown below:
1 2 3
4 5 6
9 8 9
The left-to-right diagonal = 1 + 5 + 9 = 15. The right to left diagonal = 3 + 5 + 9 = 17. Their absolute difference is
|15 - 17| = 2.
Note: The first line of the matrix is the number of nested arrays.
 */

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var leftToRightSum = 0
    var rightToLeftSum = 0
    for (i in arr.indices) {
        leftToRightSum += arr[i][i]
        rightToLeftSum += arr[i][arr.size - i - 1]
    }
    return abs(leftToRightSum - rightToLeftSum)
}

fun main() {
    val m = arrayOf(
        arrayOf(1, 2, 3),
        arrayOf(4, 5, 6),
        arrayOf(9, 8, 9)
    )
    println(diagonalDifference(m) == 2)
}