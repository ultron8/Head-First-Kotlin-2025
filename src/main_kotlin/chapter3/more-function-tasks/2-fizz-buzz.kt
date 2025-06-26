/**
 *
 * 2. FizzBuzz with Functions
 *    Write a function fizzBuzz(n: Int) that prints the following for all numbers from 1 to n:
 *
 * “Fizz” for numbers divisible by 3,
 *
 * “Buzz” for numbers divisible by 5,
 *
 * “FizzBuzz” for numbers divisible by both 3 and 5,
 *
 * Otherwise, print the number itself.
 *
 * Use a for-loop and if/when.
 *
 */

fun main() {

    var test1 = fizzBuzz(20)

} // main

fun fizzBuzz(n: Int) {

//     if statement
    for (i in 1..n) {
        if ((i % 3 == 0) && (i % 5 == 0)) {
            println("FizzBuzz")
        } else if (i % 3 == 0) {
            println("Fizz")
        } else if (i % 5 == 0) {
            println("Buzz")
        } else {
            println(i)
        } // if
    }

    // when statement
//    for (i in 1..n) {
//        when {
//            i % 3 == 0 && i % 5 == 0 -> println("$i: FizzBuzz")
//            i % 3 == 0 -> println("$i: Fizz")
//            i % 5 == 0 -> println("$i: Buzz")
//
//            else -> println("$i")
//        } // when
//    } // for loop


} // fun fizzBuzz

