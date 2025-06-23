/**
 * Task 2: Method Overriding
 * Description:
 * Create an Beast class with a function makeSound() that prints a generic sound. Create a subclass Dog that overrides makeSound() to print "Bark!".
 * Call the function for both Animal and Dog objects.
 *
 *
 *
 */


fun main() {

    // obj's
    var beast = Beast()
    var doggy = Doggy()

    beast.makeSound()
    doggy.makeSound()

} // main

open class Beast() {
    open fun makeSound(){
        //
        println("The beast is making a sound")
    } // method

} // class Beast()

class Doggy(): Beast() {

    override fun makeSound() {
        println("Bark!")
    }

}



