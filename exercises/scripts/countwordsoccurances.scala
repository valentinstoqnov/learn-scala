import scala.io.Source

if(args.length > 0) {
    val words = Source.fromFile(args(0)).getLines().mkString(" ").toLowerCase().replaceAll("""[\p{Punct}]""", "").split("\\s+")
    val wordOccurances = words.groupBy(identity).map(x => (x._1, x._2.length))
    println(wordOccurances)
} else {
    Console.err.println("Please enter filename")
}
