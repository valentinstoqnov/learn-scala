object App extends App {
    implicit def intToRational(i: Int) = new Rational(i)

    val oneHalf = new Rational(1, 2)
    val twoThirds = new Rational(2, 3)

    println(oneHalf)
    println(twoThirds)

    println(oneHalf + twoThirds)
    println(oneHalf - twoThirds)
    println(oneHalf * twoThirds)
    println(oneHalf / twoThirds)
    println(-oneHalf)
    println(oneHalf + 1)
    println(oneHalf - 1)
    println(twoThirds * 2)
    println(twoThirds / 2)
    println(2 + oneHalf)
}
