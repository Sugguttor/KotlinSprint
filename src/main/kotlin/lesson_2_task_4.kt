fun main() {
    val crystalOre = 7
    val ironOre = 11
    val buff = 20

    val buffOfCrystalOre = (crystalOre * buff) / INTOTAL
    val buffOfIronOre = (ironOre * buff) / INTOTAL

    println("Добавлено ${buffOfCrystalOre.toInt()} ед. кристалической руды")
    println("Добавлено ${buffOfIronOre.toInt()} ед. железной руды")
}
val INTOTAL = 100