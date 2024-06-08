fun main() {
    val SECONDS = 6480
    val MINUTES: Int = SECONDS / 60
    val HOUR: Int = MINUTES / 60
    val transferOfMinutes = MINUTES - (HOUR * 60)
    val transferOfSeconds = SECONDS - (MINUTES * 60)
    val hour = String.format("0$HOUR")
    val seconds = String.format("0$transferOfSeconds")
    println("$hour:$transferOfMinutes:$seconds")
}