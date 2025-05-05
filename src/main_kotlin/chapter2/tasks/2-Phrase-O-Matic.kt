package main_kotlin.chapter2.tasks
import kotlin.random.Random

/* task:
* main function that creates three arrays of words,
* randomly picks one word from each
* and then joins them together. Add the code below to PhraseOMatic.kt
*
*/

fun main() {

    val wordArray1 = arrayOf("24/7", "multi-tier", "B-to-B", "dynamic", "pervasive")
    val wordArray2 = arrayOf("empowered", "leverage", "aligned", "targeted")
    val wordArray3 = arrayOf("process", "paradigm", "solution", "portal", "vision")

    // getting the size, to just use the size of the array
        // with .size
    val arraySize1 = wordArray1.size // 5
    val arraySize2 = wordArray2.size // 4
    val arraySize3 = wordArray3.size // 5

    // MY SOLUTION
    // getting a random number from 0 to arraySize
//    val rand1 = Random.nextInt(arraySize1)
//    val rand2 = Random.nextInt(arraySize2)
//    val rand3 = Random.nextInt(arraySize3)


    // Math.random() -> returns a randomly generated number between 0 and 1
    // Head First Kotlin SOLUTION
    val rand1 = (Math.random() * arraySize1).toInt()
    val rand2 = (Math.random() * arraySize2).toInt()
    val rand3 = (Math.random() * arraySize3).toInt()


    // Head First output
    val phrase = "${wordArray1[rand1]} ${wordArray2[rand2]} ${wordArray3[rand3]}"
    println(phrase)


    // MY UNDERSTANDING OF THE OUTPUT
    // picking a word
    val pick1 = wordArray1[rand1]
    val pick2 = wordArray2[rand2]
    val pick3 = wordArray3[rand3]

    println(pick1 + pick2)
    println(pick2 + pick3 )
    println(pick3 + pick1)


} // fun main