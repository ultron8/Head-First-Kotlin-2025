package main_kotlin.chapter3.`function-tasks`.easy

// Task 4: Maximum of Three Numbers
// Description:
// Write a function maxOfThree that takes three integers
// and returns the largest of the three.

fun main() {

    var x = 0
    var y = 0
    var z = 0

//    while (x == 0 || y == 0 || z == 0) {
//        for (i in 1..3) {
//            println("What is your number $i?")
//        }
//    }

    for (i in 1..3) {
        println("What is your $i'st/nd/rd number?")
        if (x == 0){
            x = Integer.valueOf(readLine())
        } else if (y == 0) {
            y = Integer.valueOf(readLine())
        } else if (z == 0) {
            z = Integer.valueOf(readLine())
        }

    } // for loop

//    println("$x, $y, $z")

    // call the function
    var maxValue = maxOfThree(x, y, z)

} // fun main

fun maxOfThree(x_param: Int, y_param: Int, z_param: Int) {

    if (x_param > y_param && x_param > z_param) {
        println("$x_param is the biggest value out of $y_param and $z_param")
    } else if (y_param > x_param && y_param > z_param) {
        println("$y_param is the biggest value out of $x_param and $z_param")
    } else if (z_param > x_param && z_param > y_param) {
        println("$z_param is the biggest value out of $x_param and $y_param")
    }

} // fun maxOfThree


