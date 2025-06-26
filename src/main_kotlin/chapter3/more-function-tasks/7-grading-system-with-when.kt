/**
 *
 *  Grading System with when
 *   Write a function gradeToText(grade: Int): String that converts a grade to a text:
 *
 * 1 -> "Very good"
 * 2 -> "Good"
 * 3 -> "Satisfactory"
 * 4 -> "Sufficient"
 * 5 -> "Poor"
 *
 * Otherwise -> "Invalid grade"
 *
 * Use a when-structure.
 *
 */

fun main() {

    //
    var gradeResult = gradeToText(1)
    println(gradeResult)

} // main

fun gradeToText(grade: Int): String {

    // with when
    var result = when (grade) {
        1 -> "Very good"
        2 -> "Good"
        3 -> "Satisfactory"
        4 -> "Sufficient"
        5 -> "Poor"
        else -> "Invalid grade"
    } // when


    return result
} // fun gradeToText