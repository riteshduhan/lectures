package lectures.part1basics

object ValuesVariablesTypes extends App{
  //; used to separate expressions on a single line. compiler inferred y to be an integer
  val x: Int = 42; val y =5

  println(x)
  // VALS ARE IMMUTABLE
  // COMPILER can infer types

  val aString: String = "hello"
  val anotherString = "goodbye"
  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val anInt: Int = 1234567890 //4 byte
  val aShort: Short = 4613  //2 byte storage
  val aLong: Long = 1234567890123456789L  //8 byte
  println(aLong)
  val aFloat: Float = 2.123456789f   //decimal number less precision and storage
  println(aFloat)
  val aDouble: Double = 3.1234567890123456789 //decimal number more precision and storage
  println(aDouble)

  // variables
  var aVariable: Int = 4
  aVariable = 5 // side effects
}
