fun main() {
    val permanentEmployees: Int = 50
    val salaryOfPermanentEmployees: Int = 30000
    val intern: Int = 30
    val salaryOfInterns: Int = 20000

    val costOfPermanent: Int = permanentEmployees * salaryOfPermanentEmployees
    val costOfInterns: Int = intern * salaryOfInterns
    val generalExpenses: Int = costOfInterns + costOfPermanent
    val totalNumberOfEmployees = permanentEmployees + intern
    val averageSalary = generalExpenses / totalNumberOfEmployees

    println("Число постоянных работнико - $permanentEmployees")
    println("Зарплата постоянного работника - $salaryOfPermanentEmployees")
    println("Число стажеров - $intern")
    println("Зарплата стажера - $salaryOfInterns")
    println("Средняя зарплата сотрудника - $averageSalary")
}