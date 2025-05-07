package main_kotlin.chapter3.tasks

import kotlin.random.Random

fun main(){

    // create the array
//    val trpArray = arrayOf("Rock", "Scissors", "Paper")
//    getGameChoice()

}

fun getGameChoice(){
    // which will choose "Rock", "Scissors", "Paper" at random
    val trpArray = arrayOf("Rock", "Scissors", "Paper")
    val arraySize = trpArray.size
    var randomNum = Random.nextInt(trpArray.size)

    // picks randomly one of the elements in the array
    var gameChoice = trpArray[randomNum]

} // getGameChoice()

fun getUserChoice(){
    // enter your choice
    // check for validChoice
        // if not keep ask them unitl they do
    println("Pls enter one of the following: Rock, Paper, Scissors.\n")
    var userChoice = readLine()

    if (userChoice != "Rock" || userChoice != "Paper" || userChoice != "Scissors") {
        println("Pls enter one of the following: Rock, Paper, Scissors.")
        println("Errr... dunno.")
        println("You must enter a valid choice.")
    }




} // getUserChoice()