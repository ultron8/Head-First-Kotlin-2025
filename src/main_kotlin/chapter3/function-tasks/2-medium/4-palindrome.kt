// Task 4: Is Palindrome
// Description:
// Write a function isPalindrome that checks whether a given string
// is a palindrome (reads the same backward as forward). Return true or false.

fun main(){

    println("Write down your word: \n")
    var str = readLine()
    str = str.toString().lowercase()

    val palindromeCheck = isPalindrome(str)

    println("The string: $str from the user input is a palindrome: $palindromeCheck ")


}

fun isPalindrome(word: String): Boolean {

    var isPalindrome : Boolean
    val reverseWord = word.reversed()

    if (word == reverseWord) {
        isPalindrome = true
    } else {
        isPalindrome = false
    }

    return isPalindrome

} // fun isPalindrome

