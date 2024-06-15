fun main() {
    val numbers: IntArray = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val number: Int = 8
    var s: String = ""
        numbers.forEach {s+="$number * $it = ${number * it}\n"}
    println(s)
}
