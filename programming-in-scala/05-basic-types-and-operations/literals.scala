//Integer literals

val hex = 0x5
println(hex)

val dec = 1998
println(dec)

val long = 35L
println(long)

val short: Short = 200
println(short)

val byte: Byte = 38
println(byte)

println()

//Floating point literals

val double1 = 1.2345
println(double1)
val double2 = 1.2345e2
println(double2)

val float1 = 1.2345F
println(float1)
val float2 = 3e5f
println(float2)

println()

//Character literals

val a = 'A'
println(a)
val d = '\u0041'
println(d)

println()

//String literals

val hello = "hello"
println(hello)
val escapes = "\\\"\'"
println(escapes)
println("""This is three
	    double quotation marks text.""")
println("""|This is three double
	   |quotation marks text
	   |with stripMargin called on it.""".stripMargin)

println()

//Symbol literals

val symbol = 'aSymbol
println(symbol)
val symbolName = symbol.name
println(symbolName)

println()

//Boolean literals

val bool = true
println(bool)
val fool = false
println(fool)
