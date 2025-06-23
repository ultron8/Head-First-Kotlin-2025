/**
 * Task 3: Polymorphic Function Call
 * Description:
 * Define a function describeAnimal(animal: Animal) that calls makeSound().
 * Create classes Cat and Bird that inherit from Animal and override makeSound().
 * Pass objects of Cat and Bird to describeAnimal() and observe polymorphic behavior.
 *
 */

fun describeAnimal(someAnimal: SomeAnimal){
    someAnimal.makeSound()
} //  fun describeAnimal

fun main() {

    // create obj of Caty and Birdd
    var caty = Caty()
    var birdd = Birdd()

    // Pass objects of Cat and Bird to describeAnimal() and observe polymorphic behavior
    describeAnimal(caty)
    describeAnimal(birdd)


} // main


open class SomeAnimal(){

    open fun makeSound() {
        println("SomeAnimal makes a sound")
    } // fun makeSound()

} // superclass SomeAnimal()

class Caty(): SomeAnimal() {

    override fun makeSound() {
        println("Caty makes a sound: Meow")
    } // fun makeSound()

} // Caty

class Birdd(): SomeAnimal() {

    override fun makeSound() {
        println("Birdd makes a sound: Tweet")
    }

} // Bird



