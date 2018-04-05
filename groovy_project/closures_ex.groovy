class Closure_ex {

  def printLine() {
    println "#"*20
  }

  public static void main (args) {
// show you examples on how to use cluseres in groovy
  def ins = new Closure_ex ()
//first lets take this example
  println('Hello World')
  ins.printLine()
// I want to have the above printed out 3times. Instead of typing
// the print statement 3 times, i do something like this
  3.times { println('Hello World') }
  ins.printLine()
// you can alwell pass the print statement to a variable and just
// call the times method on that variable

  def printstatement = { println 'Hello World' }
  3.times printstatement
  ins.printLine()

//Note, Closures may accept arguments, the times method will pass an argument to the Closures
  3.times { index -> println "index is ${index}" }

//Closures also have a so call it argument
  ins.printLine()
  5.times { println "index is ${it}" }

 ins.printLine()

 // Now we check on how to call multiple arguments

 def myMap = [ name:'Leadel', city:'Hamburg', age: 36 ]
 myMap.each { key, value ->
      println "Key = ${key} and value = ${value}"
    }
  }



}
