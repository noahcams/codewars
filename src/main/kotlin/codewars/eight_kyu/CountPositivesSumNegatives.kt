package codewars.eight_kyu

fun countPositivesSumNegatives(input: Array<Int>?): Array<Int> {
    if (input.isNullOrEmpty()) return arrayOf()
    val positivesCount = input.count { it > 0 }
    val sumNegatives = input.fold(0) { acc, curr -> if (curr < 0) acc + curr else acc }
    return arrayOf(positivesCount, sumNegatives)
}

// someone else's solution
fun betterCountPositivesSumNegatives(input : Array<Int>?) : Array<Int> {
    if (input == null || input.isEmpty()) return emptyArray()
    val (positive, negative) = input.partition { it > 0 } // This is sick!
    return arrayOf(positive.count(), negative.sum())
}