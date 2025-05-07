// MY TRY W/O INSTRUCTIONS
// COULD NOT IMPLEMENT the is choice valid?

/*
* HOW THE GAME WILL WORK
* GOAL: make a guess that beats the computer's, and win
*
* SETUP: when the application is launched, the game chooses Rock
* Paper, Scissors at random. It then asks you to choose one of these options
*
* RULES: game compares the two choices. If they are the same,
* the result is a draw. If the choices are different, however, the
* game determines the winner using the following rules:
*
* CHOICES           | RESULT
* Scissors, Paper   | scissors choice wins, as scissors can cut paper
* Rock, Scissors    | rock choice wins, as rock can blunt scissors
* Paper, Rock       | paper choice wins, as paper can cover rock
*
* STEPS
* 1. computer needs to choose one of the options
* 2. computer chose an option
* 3. users turn
* 4. user chose option x
* 5. game compares two choices against each other
* 6. announcing the winner user vs pc
*
* ADDITIONALLY
* add a while loop if both choose the same
* add lowercase and uppercase
* add points
* add rounds
* store all the previous choices of the computer and user and output them after the game
*

* */

import kotlin.random.Random

fun main() {

    // declare variables

    val trpArray = arrayOf("Rock", "Scissors", "Paper")
    var isValid = false
    var rounds = 0
    var userPoints = 0
    var computerPoints = 0

    // DECISION
    // make it random
    // get the size of the trpArray
    val arraySize = trpArray.size

    // use the arraySize to a get random number of 0, 1, 2
    var randomNum = Random.nextInt(trpArray.size)

    // use randomNum to randomly pick the index in trpArray and sign it to computerChoice
    var computerChoice = trpArray[randomNum]


//    println(computerChoice)
    // feedback to the console - to make the user ready to chose
    println("the computer made his decision - now make ur own decision...")
    // asking the user to make a decision
    println("What is your choice? Rock, Paper, Scissors?\n")
    var userChoice = readLine()

    // feedback about the choice
    println("the user chose: $userChoice")

    println("Now the game will evaluate your decision. Who will win... stay tuned")

    // 3 rounds: if one of them wins to 2 rounds in row than the game stops and the winner will be announced

    // maybe I need to create a function for the userChoice and add the fun into the while loop after a playing round

    while (rounds < 4) {

        // logic - comparing the choices
        // USER WIN: Scissors✅, Paper❌
        if (userChoice == "Scissors" && computerChoice == "Paper") {
            println("USER WIN: Scissors cuts Paper. Congrats you win! 🥳")
            rounds++
            userPoints++
        } // COMPUTER WIN:
        else if (computerChoice == "Scissors" && userChoice == "Paper") {
            println("COMPUTER WIN: Scissors cuts Paper. That's bad you lost 😭!")
            rounds++
            computerPoints++
        }

        // USER WIN: Rock✅, Scissors❌
        else if (userChoice == "Rock" && computerChoice == "Scissors") {
            println("USER WIN: Rock destroys the Scissors. Congrats you win! 🥳")
            rounds++
            userPoints++
        }  // COMPUTER WIN:
        else if (computerChoice == "Rock" && userChoice == "Scissors") {
            println("COMPUTER WIN: Rock destroys the Scissors. That's bad you lost 😭!")
            rounds++
            computerPoints++
        }

        // USER WIN: Paper✅, Rock❌
        else if (userChoice == "Paper" && computerChoice == "Rock") {
            println("USER WIN: The Paper can cover Rock. Congrats you win! 🥳")
            rounds++
            userPoints++
        } else if (computerChoice == "Paper" && userChoice == "Rock") {
            println("COMPUTER WIN: Paper can cover Rock. That's bad you lost 😭!")
            rounds++
            computerPoints++

        // SAME CHOICES, PLAY AGAIN
        } else if (userChoice == computerChoice) {
            println("You both made the same choice. User: $userChoice and Computer: $computerChoice")
            println("Play again")

        } // else case is missing (console is not stopping the activity)
        else {
            println("$userChoice is not a valid choice. Pls choose between Rock, Scissors, Paper")
        } // if

    } // while



    println("END OF GAME.")


} // fun main