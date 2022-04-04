package codewars.four_kyu

object TimeFormatter {

    fun formatDuration(seconds: Int): String {
        val years = seconds / 31_536_000
        val days = seconds % 31_536_000 / 86400
        val hours = seconds % 86400 / 3600
        val mins = seconds % 3600 / 60
        val secs = seconds % 60
        val timeList = listOf(readableUnit(years, "year"),
                readableUnit(days, "day"),
                readableUnit(hours, "hour"),
                readableUnit(mins, "minute"),
                readableUnit(secs, "second")
        )
        // create function for converting timeString to add the right commas and ands
        return prettify(timeList.filter { it.isNotEmpty() })
    }

    private fun readableUnit(time: Int, unit: String): String {
        return if (time > 1) "$time ${unit}s"
        else if (time == 1) "1 $unit"
        else ""
    }

    private fun prettify(list: List<String>): String {
        return when(list.size) {
            0 -> "now"
            1 -> list[0]
            2 -> "${list[0]} and ${list[1]}"
            3 -> "${list[0]}, ${list[1]} and ${list[2]}"
            4 -> "${list[0]}, ${list[1]}, ${list[2]} and ${list[3]}"
            else -> "${list[0]}, ${list[1]}, ${list[2]}, ${list[3]} and ${list[4]}"
        }
    }


}

fun main() {
    println(TimeFormatter.formatDuration(205851834))
//    println(86400 % 23)
}
