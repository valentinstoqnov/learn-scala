import scala.collection.mutable.ArrayBuffer

abstract class IntQueue {
    def get(): Int
    def put(x: Int)
}

class BasicIntQueue extends IntQueue {
    private val buf = new ArrayBuffer[Int]
    def get() = buf.remove(0)
    def put(x: Int) = { buf += x }
}

trait Doubling extends IntQueue {
    abstract override def put(x: Int) = { super.put(2 * x) }
}

trait Incrementing extends IntQueue {
    abstract override def put(x: Int) = { super.put(x + 1) }
}

trait Filtering extends IntQueue {
    abstract override def put(x: Int) = { if (x > 0) super.put(x) }
}

object StackableModifications extends App {
    println("Basic Queue")
    val basicQueue = new BasicIntQueue
    basicQueue.put(5)
    basicQueue.put(15)
    basicQueue.put(25)
    println(basicQueue.get())
    println(basicQueue.get())
    println(basicQueue.get())

    println("Doubling Queue")
    val doublingQueue = new BasicIntQueue with Doubling
    doublingQueue.put(5)
    doublingQueue.put(15)
    doublingQueue.put(25)
    println(doublingQueue.get())
    println(doublingQueue.get())
    println(doublingQueue.get())

    println("Incrementing Queue")
    val incrementingQueue = new BasicIntQueue with Incrementing
    incrementingQueue.put(5)
    incrementingQueue.put(15)
    incrementingQueue.put(25)
    println(incrementingQueue.get())
    println(incrementingQueue.get())
    println(incrementingQueue.get())

    println("Positive Queue")
    val positiveQueue = new BasicIntQueue with Filtering
    positiveQueue.put(-5)
    positiveQueue.put(15)
    positiveQueue.put(-50000)
    positiveQueue.put(25)
    println(positiveQueue.get())
    println(positiveQueue.get())

    println("Doubling and then Incrementing Queue")
    val diQueue = new BasicIntQueue with Incrementing with Doubling
    diQueue.put(5)
    diQueue.put(15)
    println(diQueue.get())
    println(diQueue.get())

    println("Incrementing and then Doubling Queue")
    val idQueue = new BasicIntQueue with Doubling with Incrementing
    idQueue.put(5)
    idQueue.put(15)
    println(idQueue.get())
    println(idQueue.get())
}
