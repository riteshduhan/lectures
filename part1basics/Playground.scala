package lectures.part1basics

object Playground extends App {
val Counter1 = new Counter(3)
  Counter1.inc.print
}
class Counter(val count: Int =0){
  //println("incrementing")
  def inc:Counter = {
    println("incrementing ")
    new Counter(count + 1)
  }
    def print:Unit = println(count)

}


