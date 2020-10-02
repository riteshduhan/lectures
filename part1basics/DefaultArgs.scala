package lectures.part1basics

object DefaultArgs extends App{
  def trFact(n: Int, acc: Int = 1): Int =
    if (n <= 1) acc
    else trFact(n-1, n*acc)

  val fact10 = trFact(10, 2)  //It should have acc =1 to get correct result for factorial but function would not fail
  println(fact10)
  println(trFact(10))  //trFact can be called without acc as it is defaulted to 1 in definition
  def savePicture(format: String = "jpg", width: Int = 1920, height: Int = 1080): Unit = println("saving picture")
  savePicture(width = 800)  //called by naming parameters. Others would be defaulted to definition value

  /*
    1. pass in every leading argument
    2. name the arguments
   */
  def add(x:Int,y:Int, z:Int =4):Int = x+y+z
  //println(add(3)) // would need all the leading arguments before default one
  println(add(2,3))  //would return 9
  savePicture(height = 600, width = 800, format = "bmp")
}
