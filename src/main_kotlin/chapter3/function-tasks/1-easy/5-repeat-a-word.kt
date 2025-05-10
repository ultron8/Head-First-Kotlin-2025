package main_kotlin.chapter3.`function-tasks`.easy

// Task 5: Repeat a Word
// Description:
// Write a function repeatWord that takes a String and an Int,
// and prints the string that many times.

fun main(){
    var strInt = repeatWord("sheesh", 7)
    strInt // 7 sheesh's
}

fun repeatWord(string_param: String, int_param: Int) {
    for (i in 1..int_param) {
        println("$string_param")
    }
}