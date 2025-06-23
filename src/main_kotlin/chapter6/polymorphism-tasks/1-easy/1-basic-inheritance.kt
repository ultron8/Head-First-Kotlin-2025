/*
* Task 1: Basic Inheritance
* Description:
* Create a base class Machine with a property name.
* Create a subclass Car that inherits from Machine
* and adds a property numberOfDoors.
* Create an object of Auto and print all properties.
*
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




