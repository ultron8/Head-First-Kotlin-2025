/*
* Task 4: Create a Default Constructor
* Goal: Create a class User with default values for name = "Guest" and age = 0.
* Requirement: Allow creating users with or without passing parameters.
*
* * */

fun main() {

    var user0 = Userrr()
    println("This is a default user0: ${user0.name}, ${user0.age}")

    var user1 = Userrr("Ultron", 8)
    println("This is a default user1: ${user1.name}, ${user1.age}")

} // main

class Userrr(var name: String = "Guest", var age: Int = 0)