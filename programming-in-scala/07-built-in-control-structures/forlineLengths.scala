def fileLines(file: java.io.File) = scala.io.Source.fromFile(file).getLines().toList

val filesHere = (new java.io.File(".")).listFiles

val forLineLengths = for {
    file <- filesHere
    if file.getName.endsWith(".scala")
    line <- fileLines(file)
    trimmed = line.trim
    if trimmed.matches(".*for.*")
} yield trimmed.length

println(forLineLengths.mkString("\n"))
