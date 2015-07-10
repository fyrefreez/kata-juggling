object SumEvenFibonacci {
  val fibs: Stream[BigInt] = BigInt(1) #:: BigInt(2) #:: fibs.zip(fibs.tail).map { n => n._1 + n._2}
  val expectedFibs = List(2, 8, 34, 144, 610, 2584, 10946, 46368, 196418, 832040, 3524578) sum

  def evenTerms(max: Long) = {
    fibs takeWhile(_ <= max) filter(_ % 2 == 0)
  }


  def main(args: Array[String]) = {
    Predef.assert(expectedFibs == evenTerms(4000000).sum)
  }
}

