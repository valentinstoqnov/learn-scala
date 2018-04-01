import scala.collection.mutable

val treasureMap = mutable.Map[Int, String]()
treasureMap += (1 -> "Go to island.")
treasureMap += (2 -> "Find big X on ground.")
treasureMap += (3 -> "Dig.")

for(i <- 1 to 3)
    println(treasureMap(i))

val romanNumeral = Map(
    1 -> "I",
    2 -> "II",
    3 -> "III",
    4 -> "IV",
    5 -> "V"
)

for(i <- 1 to 5)
    println(romanNumeral(i))
