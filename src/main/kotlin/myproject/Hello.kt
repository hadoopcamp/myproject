package myproject

fun main() {
//    println("Hello Kitty!")
//    Person.hello()
//    com.myproject.Person().Hello()

    val personkt = Person(height = 1.65f, weight = 90.1f)
    personkt.hello()
    println(personkt.bmi())

//    val personjv = com.myproject.Person()
//    personjv.Hello()

    var personktvar = Person(2.3f, 71.3f, "Goblin")
    personktvar.hello()

//    var personjvvar = com.myproject.Person()
//    personjvvar.Hello()

//    val item = "piano"
//    Person().play(item)

    var game : String
    game = "3"

    var name : Int
    name = 4
    println(game + name)

}

class Person(val height:Float, val weight:Float, val name:String = "Kotlin") {
    init {
        println("Person constructor $name $height $weight")
    }

    fun bmi():Float{
        return weight / (height*height)
    }

    fun hello() {
        println("Hello from Kotlin")
    }
    fun play(item: String){
        println("I'm playing " + item)
    }
}