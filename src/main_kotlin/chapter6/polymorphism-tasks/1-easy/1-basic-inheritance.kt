/**
 * Task 2: Method Overriding
 * Description:
 * Create an Animal class with a function makeSound() that prints a generic sound. Create a subclass Dog that overrides makeSound() to print "Bark!".
 * Call the function for both Animal and Dog objects.
* */

fun main() {

    // obj of Auto
    val car1 = Auto("Tesla", 4)
    println("This is a ${car1.name} and it has ${car1.numberOfDoors} doors")


} // main

abstract class Machine() {
    abstract var name: String
} // Machine()

// sub-class
class Auto(override var name: String, var numberOfDoors: Int): Machine() {


} // class Auto()




