package lectures.part1basics

object StringOps extends App{
  val str: String = "Hello, I am learning Scala"

  println(str.charAt(2))               //character at 3 position
  println(str.substring(7, 11))        // String from char 7 till 10
  println(str.split(" ").toList)  //splits into list
  println(str.startsWith("Hello"))      //check if strings starts with "Hello"
  println(str.replace(" ", "-"))    //replace characters in string
  println(str.toLowerCase()) //lowercase
  println(str.length)   //string length

  val aNumberString = "2"
  val aNumber = aNumberString.toInt    //converts to Integer
  println('a' +: aNumberString :+ 'z')
  println('a' + aNumberString :+ 'z')
  println(str.reverse)            //reverses the string
  println(str.take(2))            //Take first 2

  // Scala-specific: String interpolators.

  // S-interpolators - inject values and expressions inside string

  val name = "David"
  val age = 12
  val greeting = s"Hello, my name is $name and I am $age years old"
  val anotherGreeting = s"Hello, my name is $name and I will be turning ${age + 1} years old."
  println(anotherGreeting)

  // F-interpolators - formats the print output. Type is matched by the compiler for val and format specified after val
  // i.e if speed is float, after $speed %2.2f means mm.nn format %d -> Integer
  val speed = 1.2f
  val myth = f"$name can eat $speed%2.2f burgers per minute"
  println(myth)

  // raw-interpolator - Print whatever is written in quotes but injects vals and vars
  println(raw"This is a \n newline")
  val escaped = "This is a \n newline"
  println(raw"$escaped")

}
