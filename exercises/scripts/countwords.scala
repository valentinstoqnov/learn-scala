import scala.io.Source

if(args.length > 0) {
    val wordsCount = Source.fromFile(args(0)).getLines().mkString(" ").replaceAll("""[\p{Punct}]""", "").split("\\s+").length
    println(wordsCount)
} else {
    Console.err.println("Please enter filename")
}
