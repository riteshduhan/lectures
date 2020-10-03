package lectures.part1basics

object Expressions extends App{
  val x = 1 + 2 // EXPRESSION return a value
  println(x)

  println(2 + 3 * 4)
  //maths expression
  // + - * / & | ^ << >> >>> (right shift with zero extension)

  println(1 == x)   //conditional operators
  // == != > >= < <=

  println(!(1 == x))
  // ! && ||

  var aVariable = 2
  aVariable += 3 // also works with -= *= /= ..... side effects
  println(aVariable)

  // Instructions (DO) vs Expressions (VALUE)

  // IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3 // IF EXPRESSION
  println(aConditionedValue)
  println(if(aCondition) 5 else 3)
  println(1 + 3)

  var i = 0
  val aWhile = while (i < 10) {
    println(i)
    i += 1
  }

  // NEVER WRITE THIS AGAIN.

  // EVERYTHING in Scala is an Expression!

  val aWeirdValue = (aVariable = 3) // Unit === void
  println(aWeirdValue)

  // side effects: println(), whiles, reassigning. Scala forces everything to be an expression. So it makes statements
  //to return null/unit

  // Code blocks. Should return a value. Last statement gives the return type. so its an expression
  //definitions within a code block are local and cant be referred outside

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }

  // 1. difference between "hello world" vs println("hello world")?
  //"hello world" is a string value where println is a side effect that returns null/unit
  // 2.

  val someValue = {
    2 < 3
  }
  println(someValue) //return true as 2<3 is true

  val someOtherValue = {
    if(someValue) 239 else 986
    42
  }
  println(someOtherValue)  //return 42 as it is the last statement of the block


}
