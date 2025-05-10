// Task 3: Check Even or Odd
// Write a function isEven that takes an integer
// and returns true if it’s even, otherwise false.


fun main() {

    println("What is your number?\n")
    var someNum = Integer.valueOf(readLine())

    var chkNumber = isEven(someNum)

    if (chkNumber == true) {
        println("the number $someNum is even - $chkNumber")
    } else {
        println("the number $someNum is odd - $chkNumber")
    }

} // fun main

fun isEven(x_param: Int?): Boolean {

    var isEven = false

    if (x_param != null) {
        if ((x_param % 2) == 0) {
            isEven = true
            return isEven
        }// if
    } // if

    isEven = false
    return isEven

} // fun main