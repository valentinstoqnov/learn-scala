def fileLines(file: java.io.File) = scala.io.Source.fromFile(file).getLines().toList

def grep(pattern: String, files: Array[java.io.File]) = for {
	file <- files
	if file.isFile
	if file.getName.endsWith(".scala")
	line <- fileLines(file)
	trimmed = line.trim
	if trimmed.matches(pattern)
    } println(file + " | " + trimmed)

grep(".*gcd.*", (new java.io.File(".")).listFiles)
