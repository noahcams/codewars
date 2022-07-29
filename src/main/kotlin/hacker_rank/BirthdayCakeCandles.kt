package hacker_rank

/** Receives an array of candle heights and returns the number of candles that are tallest */
fun birthdayCakeCandles(candles: Array<Int>): Int {
    val max = candles.maxOrNull()
    return candles.count { it == max }
}

fun main(args: Array<String>) {
    println(birthdayCakeCandles(arrayOf(1, 3, 5, 7, 7))) // expecting 2
}