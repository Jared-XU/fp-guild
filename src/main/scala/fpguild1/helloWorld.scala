package fpguild1

object factorial {

  def factorial(x: Int) :Int = {
     if (x==0) 1 else x*factorial(x-1)
  }

  val factorial2 = (x: Int) => if (x==0) 1 else x*factorial(x-1)

}


object helloWorld {


  def main(args: Array[String]) {
    println("Hello, world!")
    val s="a val test"; println(s)
    println(factorial.factorial(5))
    println(factorial.factorial2(5))
  }
}


