package lectures.part2oop

object OOBasics extends App{

  // constructor that is used to construct an instance or object. To create Person instance we need name, age
  //these are called class parameters and not fields
  //fields can be used by instancename.fieldname whereas parameters can't
  //to use parameters they need to be val or var - example age below
  class Person(name: String, val age: Int = 0) {
    // body
    val x = 2

    println(1 + 3)        //printed every time whenever a class instance is created as class body is evaluated

    // method -function inside a class
    //if a function is using same parameter name as class ..they can be distinguished by 'this' keyword
    def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

    // overloading - same function name with different signature (different parameters or types)
    def greet(): Unit = println(s"Hi, I am $name")

    // multiple constructors. These can be initiated by another constructor (Primary or secondary)
    //Generally constructors are used for default parameter that can be achieved by assigning a default vale
    //in the definition
    def this(name: String) = this(name, 0)
    def this() = this("John Doe")
  }
  val person1 = new Person("John")   //called without age argument. Ok as it is defaulted in the definition
  println(person1.age)
  val person = new Person("John", 26)   //new keyword creates an instance of Person class
  println(person.x)                                   //x is a class field and hence used as objectname.x
  person.greet("Daniel")       //greet is class method and hence called using objectname.greet.
  person.greet()                       //overloaded function called
  println(person.age)

  val writer1 = new Writer("Ritesh", "Duhan", 1980)
  val writer2 = new Writer("Ritesh", "Duhan", 1980)
  println(writer1.fullName)           //class method is called

  val novel1 = new Novel("Deception Point", 2020,writer1)
  println(novel1.authorAge)
  println(novel1.isWrittenBy(writer2))
  val counter = new Counter
  counter.inc.print
  counter.inc.inc.inc.print
  counter.inc(10).print
}
/*
  Novel and a Writer
  Writer: first name, surname, year of birth
    - method fullname
  Novel: name, year of release, author
  - authorAge at the time of novel publish
  - isWrittenBy(author)
  - copy (new year of release) = new instance of Novel
 */

class Writer(firstName: String, surname: String, val year: Int) {
  def fullName: String = firstName + " " + surname   //no parameter as it uses class parameters
}

class Novel(name: String, year: Int, author: Writer) {
  def authorAge = year - author.year
  def isWrittenBy(x: Writer) = x == this.author
  def copy(newYear: Int): Novel = new Novel(name, newYear, author)
 }
/*
  Counter class
    - receives an int value
    - method current count
    - method to increment/decrement => new Counter
    - overload inc/dec to receive an amount
 */
//class Counter(n: Int = 0) {
  //def count = n     --get rid of count function by typing val count as shown below. This is basically getter
class Counter(val count: Int = 0) {
  def inc = {
    println("incrementing")
    new Counter(count + 1)  // immutability  instances are not changed but fresh created if required
  }

  def dec = {
    println("decrementing")
    new Counter(count - 1)
  }

  def inc(n: Int): Counter = {
    if (n <= 0) this
    else inc.inc(n-1)
  }

  def dec(n: Int): Counter =
    if (n <= 0) this
    else dec.dec(n-1)

  def print = println(count)
}

// class parameters are NOT FIELDS