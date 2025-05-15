// dog class and object


class Dog(val name: String, var weight: Int, val breed: String) {

    // behaviour
    fun bark() {
        println(if (weight < 20) "Yip!" else "Woof")
    } // fun bark()
} // class Dog

fun main(){

    var myDog = Dog("Fido", 70, "Mixed")
    println(myDog) // output is

    // access name of myDog
    println(myDog.name)

    // access weight
    println(myDog.weight)

    // access breed
    println(myDog.breed)

    // Update properties f.e. weight
    myDog.weight = 100
    println("myDog: ${myDog.name} new weight: ${myDog.weight}")

    // access the barking of myDog
    println("${myDog.name} is barking: ${myDog.bark()}")

    // create an array of Dog objects
    var dogs = arrayOf(Dog("Thanos", 70, "Mixed"), Dog("Ripper", 10, "Poodle")) // type of array is array<Dog>

    // update second dogs weight
    dogs[1].weight = 15
    println("Ripper is barking: ${dogs[1].bark()}")
    println(dogs[1].weight)



} // fun main