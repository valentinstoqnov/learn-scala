val file = new java.io.FileReader("./trycatch_example.scala")
val msg = 
    try {
	//Doing some work
	"File work finished"
    } catch {
	case ex: java.io.FileNotFoundException => "File not found"
	case ex: java.io.IOException => "IO error"
    } finally {
	file.close()
    }
   
println(msg)
