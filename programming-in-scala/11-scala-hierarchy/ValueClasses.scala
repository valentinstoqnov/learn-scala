class Dollar(val amount: Int) extends AnyVal {
    override def toString() = "$" + amount
}

class Lev(val amount: Int) extends AnyVal {
    override def toString() = amount + "lv."
}

class Anchor(val value: String) extends AnyVal {
    override def toString() = value
}

class Style(val value: String) extends AnyVal {
    override def toString() = value
}

class Text(val value: String) extends AnyVal {
    override def toString() = value
}

class Html(val value: String) extends AnyVal {
    override def toString() = value
}

object ValueClasses extends App {
    val hundredLeva = new Lev(100)
    val thousandDollars = new Dollar(1000);
    println(hundredLeva)
    println(thousandDollars)

    def title(text: Text, anchor: Anchor, style: Style): Html =
        new Html(
            s"<a id='${anchor.value}'>" +
            s"<h1 class='${style.value}'>" +
            text.value +
            "</h1></a>"
        )

    println(title(new Text("Value Classes"), new Anchor("chap:vcls"), new Style("bold")))
}
