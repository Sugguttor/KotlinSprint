fun main() {
    var letterFrom = "E"
    var numberFrom = 2
    var letterWhere = "E"
    var numberWhere = 4
    var strokeNumber = 1

    var stroke = "$letterFrom$numberFrom в $letterWhere$numberWhere, $strokeNumber"
    println(stroke)
    letterFrom = "D"
    letterWhere  = letterFrom
    numberWhere = numberFrom + 1
    strokeNumber ++
    stroke = "$letterFrom$numberFrom в $letterWhere$numberWhere, $strokeNumber"
    println(stroke)
}