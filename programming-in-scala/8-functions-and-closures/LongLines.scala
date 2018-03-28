import scala.io.Source

object LongLines {
    
    def processFile(filename: String, width: Int) = {
	def processLine(line: String) =
	    if(line.length >= width)
		println(filename + ": " + line.trim)

	val file = Source.fromFile(filename)
	for(line <- file.getLines())
	    processLine(line)
    }
}
