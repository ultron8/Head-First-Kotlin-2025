// dog class and object


class Dog(val name: String, weight_param: Int, val breed: String) {


    var weight = weight_param
        set(value) {
            if (value > 0 ) field = value else println("KGs cant be negative")
        }

    var weightInKgs: Double = 0.0
        // this line defines the getter
        get() = weight / 2.2
        // weight can only updated to a value > 0
            // move the weight property definition from the constructor -> "var weight: Int"   to the class body



    // behaviour
    fun bark() {
        println(if (weight < 20) "Yip!" else "Woof")
    } // fun bark()
} // class Dog

fun main(){

    var myDog = Dog("Fido", 70, "Mixed")
    println(myDog) // output is

    // access name of myDog
    println("myDog name: ${myDog.name}")

    // access weight
    println("myDog weight: ${myDog.weight}")

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


    // Dog with negative weight would be a bad thing
//    myDog.weight_param = -1
//    var negativeWeightDog = myDog.weight_param
//    println("The Dog has a negative weight of (is that possible?): $negativeWeightDog")

    // a custom getter to return the Dog's weight in kg
    // asking for the value of the property weightInKgs


    // weight obj
    myDog.weight = 75
    println("Weight in KGs is ${myDog.weightInKgs}")

    myDog.weight = -2
    // minus 2 will be not considered bc of the setter function in the class Dog
    println("Weight is ${myDog.weight}")


    // weightInKgs
//    myDog.weightInKgs = 20.0
//    var dogLBtoKG = myDog.weightInKgs
//    println("the weight of the dog in kg is: $dogLBtoKG")
//
//
//    // a custom setter to validate a proposed value for the Dog's weight before we assign it
//    myDog.weightInKgs = -1.0
//    var test = myDog.weightInKgs
//    println("weight in KGs (is it negative or positive?): $test")




} // fun main