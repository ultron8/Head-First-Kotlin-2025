/**
 *
 * 1. General App Development Topics (Difficulty: Easy)
 *
 * **Task:**
 * Write a function that takes a list of usernames (Strings) and checks if each name is at least 5 characters long.
 * For each name, print a message (“Name is valid” or “Name is too short”). Use a loop and if-statements.
 *
 * *Concepts to use:*
 * - Basic Types and Variables
 * - Functions (with parameters and return value)
 * - Control Flow (for-loop, if/else)
 *
 */

fun main() {

    var names = mutableListOf("Paul", "Yashar", "Timo", "Jesaja", "Warrem", "Moritz", "Carlo", "Ultron", "Plusquamperfekt", "Lamine Yamal", "Enes", "Luci")

    userNameValidation(names)

} // main

fun userNameValidation(usernames: MutableList<String>) {

    for (i in usernames) {
        if (i.length >= 5) {
            println("✅ $i is valid")
        } else {
            println("❌ $i is too short")
        } // if
    } // for



} // fun userValidation