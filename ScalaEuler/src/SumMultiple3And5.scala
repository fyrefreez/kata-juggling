object SumMultiple3And5 {
  def ->(function: (Int) => Unit) = function((for (i<-1 until 1000 if i%3==0|i%5==0) yield i).sum)

  def main(args: Array[String]) = -> (i => println(i))
}


