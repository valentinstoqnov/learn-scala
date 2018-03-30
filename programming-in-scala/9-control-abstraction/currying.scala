def sum(x: Int)(y: Int)(z: Int) = x + y + z

val a = sum(2)(3)_
println(a(6))

val b = sum(-1)_
val c = b(2)(_: Int)
println(c(-1))
