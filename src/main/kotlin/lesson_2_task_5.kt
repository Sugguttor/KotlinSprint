import kotlin.math.pow

fun main() {
    val initialPayment = 70000
    val interestRate = 16.7
    val years = 20

    val part = 1+(interestRate / 100)
    val result = part.pow(years)
    val totalAmount: Double = initialPayment * result

    val newTotalAmount = String.format("%.3f", totalAmount)
    println(totalAmount)
    println(newTotalAmount)
}