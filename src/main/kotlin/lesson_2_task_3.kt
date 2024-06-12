fun main() {
    val departureTime = "9:39"
    val travelTime = 457

    val time = departureTime.split(":")
    val hoursToMinutes = time[0].toInt() * MIN
    val sumOfMinutes = hoursToMinutes + time[1].toInt() + travelTime
    val hoursOfArrival = sumOfMinutes / MIN
    val minutesOfArrival = sumOfMinutes - (hoursOfArrival * MIN)

    println("$hoursOfArrival:$minutesOfArrival")
}
const val MIN = 60