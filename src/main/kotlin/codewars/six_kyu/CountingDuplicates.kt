package codewars.six_kyu

/** Counts the number of characters with duplicates in a string (case insensitive) */
fun duplicateCount(text: String): Int {
    val textSet = mutableSetOf<Char>()
    val countedChars = mutableSetOf<Char>()
    var count = 0
    text.lowercase().forEach { c ->
        if (textSet.contains(c) && !countedChars.contains(c)) {
            count++
            countedChars.add(c)
        } else textSet.add(c)
    }
    return count
}

fun main() {
    println(duplicateCount("aabBc")) // should return 2
}