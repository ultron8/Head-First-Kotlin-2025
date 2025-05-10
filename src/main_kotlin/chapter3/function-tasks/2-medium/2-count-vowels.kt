package main_kotlin.chapter3.`function-tasks`.`2-medium`

// ask 2: Count Vowels
//Description:
//Write a function countVowels that counts how many vowels
// (a, e, i, o, u) are in a given string. Return the count as an Int.

fun main(){

    println("What is the word to check?\n")
    var userInput = readLine()
    userInput = userInput.toString()

    val countVowels = countVowels(userInput)

    println("The str ultron contains $countVowels vowels")

}

fun countVowels(str_param: String): Int {

    val vowelArray = arrayOf<Char>('a', 'e', 'i', 'o', 'u')
    var counter = 0

    // go through the vowelArray of type Char one by one
    for (v in vowelArray) {
        // go through the str_param String of type String one by one
        for (chr in str_param) {
            // then compare the values in v and chr individually with each other
            if (chr == v ) {
                // count up in the counter in the event of a hit
                counter++
            } // if
        }

    } // for

    // and return the value from the counter as output
    return counter
}