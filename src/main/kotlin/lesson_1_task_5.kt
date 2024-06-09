fun main() {
    val second = 6480
    val minutes: Int = second / SEC
    val hours: Int = minutes / SEC
    val transferOfMinutes = minutes - (hours * SEC)
    val transferOfSeconds = second - (minutes * SEC)
        println("%02d:%02d:%02d".format(hours, transferOfMinutes, transferOfSeconds))
}
const val SEC = 60