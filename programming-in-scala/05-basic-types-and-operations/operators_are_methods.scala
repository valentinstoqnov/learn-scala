val sum = 1 + 2
println(sum)
val sumMore = 1.+(2)
println(sumMore)

val longSum = 1 + 2L
println(longSum)

val s = "Hello, world!"
println(s indexOf 'o')
println(s indexOf ('o', 5))

//Allowed prefix operators +, -, !, ~
println(-2.0)
println((2.0).unary_-)
//unary_* fails because is not allowed

//Postfix operators
println(7 toLong)


//IMPORTANT: include parentheses if method has side effects, otherwise they
//	     migth be skipped.
println(s.toLowerCase)
