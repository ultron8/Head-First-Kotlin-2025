/*
*
* */

fun main() {

    val animals = arrayOf (
        Hippo(),
        Wolf()

    ) // animal

    for (i in animals) {
        i.roam()
        i.eat()
    } // for loop

    val vet = Vet()
    val wolf = Wolf()
    val hippo = Hippo()
    val vehicle = Vehicle()

    vet.giveShot(wolf)
    vet.giveShot(hippo)

    vehicle.velocity = 30
    println(vehicle.velocity)

    println(vehicle.roam())

} // main

//enum class Image {
//
//}
//
//enum class Food {
//    MEAT,
//    GRASS
//}
//
//enum class Habitat{
//    WOODLAND, // FORESTS
//    SAVANNAH,
//    WATER
//}

// interfaces
interface Roamable {

    // abstract and getter and setter in interfaces
    var velocity: Int
        get() = 20
    // restrictions -> interfaces dont have backing fields!
//        set(value) {
//            field = value
//        }
    // but this works bc we dont use a field keyword
    set(value) {
        println("unable to update velocity")
    }

    // abstract method of the interface
//    fun roam()

    // or concrete method of the interface
    fun roam(){
        println("The Roamable is roaming")
    }

}


// superclass

class Vehicle(): Roamable {



    override var velocity: Int = 0

    override fun roam() {
//        super.roam()
        println("The vehicle is roaming") // this code overrides the roam() function that the Vehicle class inherits from the Roamable interface
    }


}

    // abstractt -> prventing to get instantiated
abstract class Animal(): Roamable {
    abstract val image: String
    abstract val food: String
    abstract val habitat: String
    var hunger: Int = 10


    // animal make a noise
    abstract fun makeNoise()

    // eating
    abstract fun eat()

    // when its not eating or sleeping
    override fun roam() {
        println("The Animal is roaming")
//        if (eat() == false || sleep() == false) {
//            //
//        } // if
    } // fun roam()

    // take a nap
    fun sleep() {
        println("The Animal is sleeping")
    } // fun sleep()

    // just to use the final prefix
    open fun test() {}

} // class Animal()


// Animal Sub-Classes - Races

// wolf & fox
abstract class Canine(): Animal(){

    override fun roam() {
        println("The Canine is roaming")
    } // fun roam()



    // this prevents sub-classes of the Canine() class from overriding
    final override fun test(){}
}

// Lion, cheetah & lynx
abstract class Feline(): Animal(){

    override fun roam() {
        super.roam()
    }

}





// RACES Sub-Classes

class Hippo(): Animal() {

    override val image = "hippo.jpg"
    override val food = "grass"
    override val habitat = "water"

    override fun makeNoise() {
        println("Grunt")
    }

    override fun eat() {
//        super.eat() // Output: The Animal is eating
        // in the class Animal() we declared the fun eat() as abstract so there is not pre-implementation that we
        // can access through -> super.eat()
        println("The Hippo is eating grass")
    }


}// class Hippo


// SPECIFIC ANIMALS Sub-Classes
class Lion(): Feline() {

    override val image = "lion.jpg"
    override val food = "meat"
    override val habitat = "SAVANNAH"

    override fun makeNoise() {
        println("Roar")
    }

    override fun eat(){

    }

} // class Lion


class Lynx(): Feline() {
    override val image = "lynx.jpg"
    override val food = "meat"
    override val habitat = "forests"

    override fun makeNoise() {
        println("Roar")
    }

    override fun eat(){

    }

} // class Lynx

class Cheetah(): Feline() {

    override val image = "cheetah.jpg"
    override val food = "meat"
    override val habitat = "SAVANNAH"

    override fun makeNoise() {
        println("Roar")
    }

    override fun eat(){

    }

} // class Cheetah

class Fox(): Canine() {

    override val image = "fox.jpg"
    override val food = "meat"
    override val habitat = "forests"


    override fun roam() {
        println("The Canine is roaming")
    } // fun roam()

    override fun makeNoise() {
        println("Barks")
    }

    override fun eat() {
        println("The fox is eating $food")
    }

} // class Fox

class Wolf(): Canine() {

    override val image = "wolf.jpg"
    override val food = "meat"
    override val habitat = "forests"

    override fun makeNoise() {
        println("Howl")
    }

    override fun eat() {
        println("The Wolf is eating $food")
    }

} // class Wolf



class Vet() {

    // injection
    fun giveShot(animal: Animal) {
        // code to do something medical
        animal.makeNoise()
    }

} // class Vet()