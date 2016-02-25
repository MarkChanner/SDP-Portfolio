package question01

/**
  * SDP Scala Exercises Week 8
  * Generics, Question 1
  *
  * @author Mark Channer
  */

sealed trait LinkedList[A] {
  def length: Int =
    this match {
      case Pair(head, tail) => 1 + tail.length
      case End() => 0
    }

  def apply(index: Int): A =
    this match {
      case Pair(head, tail) =>
        if (index == 0) head
        else tail(index - 1)
      case End() =>
        throw new Exception("Bad things happened")
    }

  def contains(item: A): Boolean = {
    this match {
      case Pair(head, tail) =>
        if (head == item) true
        else tail.contains(item)
      case End() => false
    }
  }
}

final case class End[A]() extends LinkedList[A]

final case class Pair[A](head: A, tail: LinkedList[A]) extends LinkedList[A]

object Main extends App {
  val example = Pair(1, Pair(2, Pair(3, End())))
  assert(example.length == 3)
  assert(example.tail.length == 2)
  assert(End().length == 0)

  val example2 = Pair(1, Pair(2, Pair(3, End())))
  assert(example2.contains(3))
  assert(!example2.contains(4))
  assert(!End().contains(0))
  // This should not compile
  // example.contains("not an Int")

  val example3 = Pair(1, Pair(2, Pair(3, End())))
  assert(example3(0) == 1)
  assert(example3(1) == 2)
  assert(example3(2) == 3)
  assert(try {
    example3(3)
    false
  } catch {
    case e: Exception => true
  })
}