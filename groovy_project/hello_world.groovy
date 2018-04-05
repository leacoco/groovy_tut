class HelloWorldTest {
  def sayHello( String name ) {
    println "You asked me to say Hello"
    println "Now i say HELLO $name"
  }

  static void main(args) {
    def helloinstance = new HelloWorldTest()
    helloinstance.sayHello('Leadel')

  }
}
