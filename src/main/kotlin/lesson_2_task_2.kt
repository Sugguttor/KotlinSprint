fun main() {
    val permanentEmployees: Int = 50
    println("Число постоянных работнико - $permanentEmployees")
    val salaryOfPermanentEmployees: Int = 30000
    println("Зарплата постоянного работника - $salaryOfPermanentEmployees")
    val intern: Int = 30
    println("Число стажеров - $intern")
    val salaryOfInterns: Int = 20000
    println("Зарплата стажера - $salaryOfInterns")
    val costOfPermanent: Int = permanentEmployees * salaryOfPermanentEmployees
    val costOfInterns: Int = intern * salaryOfInterns
    val generalExpenses: Int = costOfInterns + costOfPermanent
    val totalNumberOfEmployees = permanentEmployees + intern
    val averageSalary = generalExpenses / totalNumberOfEmployees
    println("Средняя зарплата сотрудника - $averageSalary")
}