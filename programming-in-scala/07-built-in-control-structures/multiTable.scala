def makeRowSeq(row: Int) = for (col <- 1 to 10) yield {
    val product = (row * col).toString
    val padding = " " * (4 - product.length)
    padding + product
}

def makeRow(row: Int) = makeRowSeq(row).mkString

def multiTable() = (for (row <- 1 to 10) yield makeRow(row)).mkString("\n")

println(multiTable)
    
     
