import org.scalatest.{FunSuite, Matchers}

class RoundTest extends FunSuite with Matchers {
  test("testResult") {
    val guess1 = Guess(Vector(Red(), Red()))
    val feedback1 = Feedback(Vector[ResultPeg]())
    val empty: Round = Round(guess1, feedback1)
    empty.toString should be("RR Result: No pegs\n")

    val guess2 = Guess(Vector(Red(), Red()))
    val feedback2 = Feedback(Vector(Black()))
    val directMatch: Round = Round(guess2, feedback2)
    directMatch.toString should be("RR Result: Black\n")

    val guess3 = Guess(Vector(Red(), Red()))
    val feedback3 = Feedback(Vector(White(), Black()))
    val directAndIndirectMatch: Round = Round(guess3, feedback3)
    directAndIndirectMatch.toString should be("RR Result: White Black\n")
  }

  test("tests analyse method") {
    val unsolved1 = Feedback(Vector[ResultPeg]())
    val unsolved2 = Feedback(Vector(Black(), White()))
    val unsolved3 = Feedback(Vector(Black(), Black()))
    val solved1 = Feedback(Vector(Black(), Black()))
    val solved2 = Feedback(Vector(Black(), Black(), Black(), Black()))

    assert(Round.analyse(unsolved1, 2) == Unsolved)
    assert(Round.analyse(unsolved2, 2) == Unsolved)
    assert(Round.analyse(unsolved3, 3) == Unsolved)
    assert(Round.analyse(solved1, 2) == Solved)
    assert(Round.analyse(solved2, 4) == Solved)
  }
}


