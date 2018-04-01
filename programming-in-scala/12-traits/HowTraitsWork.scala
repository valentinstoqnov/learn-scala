trait Philosophical {
    def philosophize() = {
        println("Philosophize....")
    }
}

class Animal

class Frog extends Animal with Philosophical {
    override def toString = "frog"
    override def philosophize() = {
        println("It ain't easy being " + toString + "!")
    }
}

object HowTraitsWork extends App {
    val frog = new Frog
    frog.philosophize()

    val philosophical: Philosophical = frog
    philosophical.philosophize()
}
