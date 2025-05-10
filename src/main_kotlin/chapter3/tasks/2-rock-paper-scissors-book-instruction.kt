package main_kotlin.chapter3.tasks

import kotlin.random.Random

fun main() {

    // create an array of r, s, p to randomly pick one of them
    val options = arrayOf("Rock", "Scissors", "Paper")

    // create an object of getGameChoice
    val gameChoice = getGameChoice(options)
//    println("this is the game choice number: ${gameChoice}")
    val userChoice = getUserChoice(options)

    //
    val printResult = printResult(userChoice, gameChoice)

} // fun main()


fun getGameChoice(options_param: Array<String>): String {

    // which will choose "Rock", "Scissors", "Paper" at random
    var symbol = options_param[(Math.random() * options_param.size).toInt()]
    return " $symbol"

} // getGameChoice()


fun getUserChoice(options_param: Array<String>): String {

    var isValidChoice = false
    var userChoice = ""

    // loop until the user enters a valid choice
    while (!isValidChoice) {
        // Ask the user for their choice
        print("Pls enter one of the following:")
        for (item in options_param) {
            print(" $item")
        } // for loop
        println(".")
        // read the user input
        val userInput = readLine()

        // validate the user input (not null & is in options_param)
        if (userInput != null && userInput in options_param) {
            //
            isValidChoice = true
            userChoice = userInput
        } // if
        // if the choice is invalid, inform the user
        if (!isValidChoice) {
            println("You must enter a valid choice")
        }


    } // while
    return userChoice

} // getUserChoice()


// IRGENDWAS IST AN DER LOGIK DES CODES FALSCH - bekommen ständig you lose!
// the logic of the game
fun printResult(userChoice: String, gameChoice: String) {
    val result: String

    // Figure out the result
    if (userChoice == gameChoice) {
        result = "Tie!"
    }
    // S kills P
    // R kills S
    // P kills R
    else if (
        (userChoice == "Scissors" && gameChoice == "Paper") ||
        (userChoice == "Rock" && gameChoice == "Scissors") ||
        (userChoice == "Paper" && gameChoice == "Rock")
        ) {
        result = "You win!"
    } // else if
    else {
        result = "You lose!"
    }
    // print the result
    println("USER chose: $userChoice. GAME chose: $gameChoice. $result ")
} // fun printResult