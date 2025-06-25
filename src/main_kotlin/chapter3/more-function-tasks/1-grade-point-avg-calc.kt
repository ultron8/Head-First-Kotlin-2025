import kotlin.random.Random

/**
 *
 * 1. Grade Point Average Calculation
 *    Write a function calculateAverage that takes a list of integers (grades) as a parameter and calculates the average.
 *    Depending on the average, print a message:
 *
 * If the average is >= 4.0, print “Passed”.
 *
 * Otherwise, print “Failed”.
 *
 * Hint: Use a for-loop and an if-else structure.
 *
 *
 */


fun main() {


//    val formattedNum = String.format("%.1f", randomNum)
//    val formattedIntNum = formattedNum.toInt()
//    println(formattedNum)

    // list of grades
    var gradesList: MutableList<Double> = mutableListOf()

    for (i in 1..10) {
        val randomNum = Random.nextDouble(1.0, 5.0)
        gradesList.add(randomNum)
    }

//    println(gradesList)

    calculateAverage(gradesList)





} // main

fun calculateAverage(grades: MutableList<Double>) {

    for (i in grades) {
        if (i >= 4.0){
            println("Passed")
        } else {
            println("Failed")
        } // if
    } // for

} // fun calculateAverage
