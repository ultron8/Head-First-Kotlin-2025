package main_kotlin.chapter3.tasks

import kotlin.random.Random

fun main() {

    // create an array of r, s, p to randomly pick one of them
    val options = arrayOf("Rock", "Scissors", "Paper")

    // create an object of getGameChoice
    val gameChoice = getGameChoice(options)
//    println("this is the game choice number: ${gameChoice}")

} // fun main()


fun getGameChoice(options_param: Array<String>) {

    // which will choose "Rock", "Scissors", "Paper" at random
    var symbol = options_param[(Math.random() * options_param.size).toInt()]
    println("This is the game choice symbol: $symbol")

} // getGameChoice()


fun getUserChoice() {

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