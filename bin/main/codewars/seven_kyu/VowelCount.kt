package codewars.seven_kyu

fun getCount(str : String) : Int = str.count { it in "aeiou" }

fun main() {
    println(getCount("hello"))
//    println(countVowels("hello"))
}

//fun countVowels(s: String): Int {
//    val regex = Regex("([^aeiou])")
//    return s.replace(regex, "").length
//}