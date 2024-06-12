fun main() {
    val children = arrayOf(3, 4, 3, 5)
    val sum = children.sum().toFloat()
    val size = children.size.toFloat()
    val averageValue: Float = sum / size
    println(averageValue)
}