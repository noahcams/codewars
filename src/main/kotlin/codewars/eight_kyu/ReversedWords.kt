package codewars.eight_kyu

object Reversed {
    fun reverseWords(str: String): String = str.split(" ").reversed().joinToString(" ")
}