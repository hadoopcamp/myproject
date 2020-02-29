package myproject

fun main() {
//    println("Hello Kitty!")
    Person().hello()
    com.myproject.Person().Hello()

    val personkt = Person()
    personkt.hello()

    val personjv = com.myproject.Person()
    personjv.Hello()

    var personktvar = Person()
    personktvar.hello()

    var personjvvar = com.myproject.Person()
    personjvvar.Hello()

    val item = "piano"
    Person().play(item)
}

class Person {
    fun hello() {
        println("Hello from Kotlin")
    }
    fun play(item: String){
        println("I'm playing " + item)
    }
}