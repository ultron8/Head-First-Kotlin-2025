package main_kotlin.chapter3.`function-tasks`.`2-medium`

// Task 1: Reverse a String
// Description:
// Write a function reverseString that takes a String and returns the reversed version.

fun main() {

    println("What is your String?\n")
    var someStr = readLine()

    val revStr = reverseString(someStr.toString())
    println("String before: $someStr and reversed: $revStr")

}

fun reverseString(str_param: String): String {

    var reversedStr = str_param.reversed()
    return reversedStr

}