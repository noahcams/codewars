package codewars.seven_kyu

fun containAllRots(s: String, arr: ArrayList<String>): Boolean {
    val rotations = stringRotations(s)
    rotations.forEach { if (!arr.contains(it)) return false }
    return true
}

fun stringRotations(s: String): MutableList<String> {
    var rotations = mutableListOf<String>()
    val temp = s + s
    for (i in s.indices) {
        var currRot = ""
        for (j in s.indices) currRot += temp[i + j]
        rotations.add(currRot)
    }
    return rotations
}

fun main() {
    val a = arrayListOf("bsjq", "qbsj", "sjqb", "twZNsslC", "jqbs")
    println(containAllRots("bsjq", a))
}
