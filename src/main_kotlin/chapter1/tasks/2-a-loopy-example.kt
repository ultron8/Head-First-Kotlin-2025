package main_kotlin.chapter1.tasks

fun main(){



    // WHILE
    var x = 1
    println("Before the loop: x = $x")
    while (x < 4) {
        println("In the loop: x = $x")
        x++
    } // while
    println("After the loop: x = $x")

    x = 30
    val y = 10
    // IF and easier expression
    if (x > y) {
        println ("x > y")
    } else {
        println ("x < y")
    }

    // OR
    if (x > y) "x > y" else "x < y"



} // fun main