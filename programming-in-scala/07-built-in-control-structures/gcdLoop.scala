def gcdLoop(x: Int, y: Int): Int = {
    var a = x
    var b = y
    while(a != 0) {
	val tmp = a
	a = b % a
	b = tmp
    }
    b
}

println(gcdLoop(1864, 2892))
