package codewars.seven_kyu

fun getCount(str : String) : Int = str.count { it in "aeiou" }

fun main() { println(getCount("hello")) }