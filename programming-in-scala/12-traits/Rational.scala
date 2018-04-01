class Rational(n: Int, d: Int) extends Ordered[Rational] {
    require(d != 0)

    private val g = gcd(n.abs, d.abs)
    val numerator = n / g
    val denominator = d / g

    def this(n: Int) = this(n, 1)

    def compare(that: Rational) = this.numerator * that.denominator - that.numerator * this.denominator

    def +(that: Rational): Rational = new Rational(
    	numerator * that.denominator + that.numerator * denominator,
    	denominator * that.denominator
    )

    def +(i: Int): Rational = this + new Rational(i)

    def *(that: Rational): Rational = new Rational(
    	numerator * that.numerator,
    	denominator * that.denominator
    )

    def *(i: Int): Rational = this * new Rational(i)

    def unary_- = new Rational(-numerator, denominator)

    def -(that: Rational): Rational = this + -that;

    def -(i: Int): Rational = this - new Rational(i)

    def /(that: Rational): Rational = this * new Rational(that.denominator, that.numerator)

    def /(i: Int): Rational = this / new Rational(i)

    override def toString = numerator + "/" + denominator

    private def gcd(a: Int, b: Int): Int = if(b == 0) a else gcd(b, a % b)
}

object Rational {
    def main(args: Array[String]): Unit = {
        val oneHalf = new Rational(1, 2)
        val twoThirds = new Rational(2, 3)
        println(oneHalf < twoThirds)
        println(oneHalf <= twoThirds)
        println(oneHalf > twoThirds)
        println(oneHalf >= twoThirds)
        println(oneHalf == twoThirds)
    }
}
