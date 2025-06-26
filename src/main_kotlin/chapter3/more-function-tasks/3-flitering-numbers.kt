/**
 *
 * 3. Filtering Numbers
 *    Write a function filterEvenNumbers(numbers: List<Int>): List<Int> that returns all even numbers from a list.
 *    Use a for-loop and an if-statement.
 */

fun main() {

    val numsList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14)

    val allEvenNums = filterEvenNumbers(numsList)

    println(allEvenNums)

} // main

fun filterEvenNumbers(numbers: List<Int>): List<Int> {

    val evenNumbersList: MutableList<Int> = mutableListOf()
    // return all even numbers from a list
    for (i in numbers) {
        if (i % 2 == 0) {
            evenNumbersList.add(i)
        } // if
    } // for

    return evenNumbersList

} // filterEvenNumbers()