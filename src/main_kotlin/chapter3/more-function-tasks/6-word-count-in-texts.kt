/**
 *
 * 6. Word Count in Texts
 *    Write a function countWords(text: String): Int that counts the number of words in a given text.
 *    Additionally, for texts with more than 100 words, print a special message ().
 *
 */

fun main() {

    var longTextCount = "Your solution is almost correct and demonstrates a solid understanding of classes, properties, functions, and control flow. However, there are a couple of important issues and some best practice suggestions to make your code more robust and idiomatic."
    var textCount = "some text"

    println(countWords(textCount))
    println(countWords(longTextCount))

} // main

fun countWords(text: String): Int {

    // counts the number of words in a given text
    if (text.count() < 100) {
        return text.count()
    } else {
        println("Long text detected!")
        return text.count()
    }

} // fun countWords()





