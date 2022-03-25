package codewars.fivekyu

import kotlin.math.roundToInt

fun rgbToHex(r: Int, g: Int, b: Int): String { return "${hexDigit(r)}${hexDigit(g)}${hexDigit(b)}" }

private fun hexDigit(c: Int): String {
    val operation = c.toDouble() / 16
    val firstDig = operation.toInt()
    val secondDig = (operation - firstDig) * 16
    return "${hex[firstDig]}${hex[secondDig.roundToInt()]}"
}

private val hex = listOf(
    "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"
)


data class RGB(val r: Int, val g: Int, val b: Int)

fun hexToRGB(hexString: String): RGB = RGB(
    parseRGB("${hexString[0]}${hexString[1]}"),
    parseRGB("${hexString[2]}${hexString[3]}"),
    parseRGB("${hexString[4]}${hexString[5]}")
)

fun parseRGB(h: String): Int = hex.indexOf(h[0].toString()) * 16 + hex.indexOf(h[1].toString())

fun main() {
    println(rgbToHex(0, 0, 0))
    println(hexToRGB("AE359D"))
}
