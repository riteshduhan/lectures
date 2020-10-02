package lectures.part1basics

object CBVvsCBN extends App{
  def calledByValue(x: Long): Unit = {
    println("by value: " + x)
    println("by value: " + x)
  }

  def calledByName(x: => Long): Unit = {
    println("by name: " + System.nanoTime())
    println("by name: " + System.nanoTime())
  }
  //it will evaluate System.nanoTime() first and then passes it to function and hence return same result
  // even the time is changed
  calledByValue(System.nanoTime())
  //it will pass System.nanoTime() to the function and evaluates inside when used. If used twice,
  // evaluated twice and hence different time
  calledByName(System.nanoTime())

  def infinite(): Int = 1 + infinite()  //will fail if called by value
  def printFirst(x: Int, y: => Int) = println(x)

   // printFirst(infinite(), 34) --will fail as infinite() is evaluated(called by value)
  printFirst(34, infinite())  // will not fail as infinite() is called by name and not evaluated inside the method
}
