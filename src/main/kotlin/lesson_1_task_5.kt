fun main() {
    val seconds: Int = 6480
    val minutes: Int = seconds / 60
    val hour: Int = minutes / 60
    println("0$hour:${minutes-(hour*60)}:0${seconds-(minutes*60)}")
}