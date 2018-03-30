import Element.elem

abstract class Element {
    
    def contents: Array[String]
   
    def height = contents.length
    def width = contents(0).length

    def above(that: Element): Element = {
	val this1 = this widen that.width
	val that1 = that widen this.width
	elem(this1.contents ++ that1.contents)
    }

    def beside(that: Element): Element = {
	val this1 = this heighten that.height
	val that1 = that heighten this.height
	elem(
	    for ((line1, line2) <- this1.contents zip that1.contents) 
		yield line1 + line2
	)
    }

    def widen(w: Int): Element =
	if (w <= width) this
	else {
	    val left = elem(' ', (w - width) / 2, height)
	    val right = elem(' ', w - width - left.width, heigth)
	    left beside this beside right
	}

    def heighten(h: Int): Element =
	if(h <= heigth) this
	else {
	    val top = elem(' ', width, (h - heigth) / 2)
	    val bottom = elem(' ', width, h - heigth - top.height)
	    top above this above bottom
	}

    override def toString: String = contents mkstring "\n"

}

object Element {

    private class ArrayElement(val contents: Array[String]) extend Element

    private class LineElement(s: String) extend Element {
	val content = Array(s)
	override def width = s.length
	override def heigth = 1
    }

    private class UniformElement(
	ch: Char,
	override val width: Int,
	override val heigth: Int
    ) extend Element {
	private val line = ch.toString * width
	def contents = Array.fill(height)(line)
    }

    def elem(contents: Array[String]): Element =
	new ArrayElement(contents)

    def elem(s: String): Element = 
	new LineElement(s)

    def elem(c: Char, width: Int, height: Int): Element =
	new UniformElement(c, width, height)

}
