package lectures.part1basics

object Playground extends App {
  //greeting
  def aGreeting(name: String, age: Int): String = {
    "My name is " + name + ", I am " + age + " years old"
  }

  println(aGreeting("Gul", 9))

  //factorial
  def aFact(num1: Int): Int = {
    if (num1 <= 1) 1 else num1 * aFact(num1 - 1)
  }
  println(aFact(5))
  //concatenate a string n times. this will give stackoverflow error as recursion is not tail recursion (last expression
  //of the code block). The same stack memory is not used.
  def aStrconcat(str: String,n: Int): String = {
    if (n <=1) str
      else
      str + aStrconcat(str,n-1)
     }
  println(aStrconcat("Ritesh",2))

  //concatenate a string n times using tail recursion
  def aTailStrconcat(str: String,n: Int): String = {
    def aStrhelper(x: String, a: Int, acc: String): String = {
      if (a <= 1) acc
      else aStrhelper(x, a - 1, acc + str)
          }
    aStrhelper(str,n,str)
  }
println(aTailStrconcat("ritesh",5))
// Fibonacci function
 // def aFib(num1:Int):
}


