/**
 *
 * 4. Password Validation
 *    Write a function isValidPassword(password: String): Boolean that checks if a password meets the following criteria:
 *
 * At least 8 characters
 *
 * Contains at least one digit
 *
 * Contains at least one uppercase letter
 *
 * Print whether the password is valid or not. Use control structures and at least one helper function.
 *
 */


// COMMENT: solved with an LLM ❗️

fun main() {

    var testPassword = "r5Rnqixrng®"
    val isValid = isValidPassword(testPassword)
    println("Passwort validation: $isValid")

} // main

fun isValidPassword(password: String): Boolean {


    // criteria
//    Iteration 3
    // At least 8 characters
    if (password.length < 8) {
        println("$password \t is NOT valid. Needs to be at least 8 characters")
        return false
    }

    // Contains at least one digit
    if (!password.contains(Regex("\\d"))) {
        println("$password \t is NOT valid. Needs one digit at least")
        return false
    }

    // Contains at least one uppercase letter
    if (!password.contains(Regex("[A-Z]"))) {
        println("$password \t is NOT Valid. Needs at least one uppercase character")
        return false
    }

    if (!password.contains(Regex("[!@#\$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?`~ ®]"))) {
        println("$password \t is NOT valid. Needs at least one special character (look at keyboard)")
        return false
    }

    println("$password \t is valid")
    return true



    // placeholder for the Iteration2 - look below
    // placeholder for the Iteration1 - look below

} // fun isValidPassword



//// Iteration2 - reversed
//if (password.length < 8) {
//    println("$password \t is NOT valid. Needs to be at least 8 characters")
//    return false
//} //
//
//for (i in password) {
//    if (!(i.isDigit())) {
//        println("$password \t is NOT Valid. Needs one digit at least")
//        return false
//    }
//} // for loop
//
//
//for (i in password) {
//    if (!i.isUpperCase()) {
//        println("$password \t is NOT Valid. Needs a at least one uppercase character")
//        return false
//    }
//} // for
//
//println("$password \t is valid 🎉")
//return true


// Iteration1
//        // At least 8 characters
//    if (password.length >= 8) {
//       // Contains at least one digit
//       for (i in password) {
//           // Contains at least one digit
//           if (i.isDigit()) {
//               // Contains at least one uppercase letter
//               if (i.isUpperCase()) {
//                   println("$password \t is valid")
//                   bool = true
//               } else {
//                   println("$password \t is NOT Valid. Needs a at least one uppercase character")
//                   bool = false
//               }
//           } else {
//               println("$password \t is NOT Valid. Needs one digit at least")
//               bool = false
//           }
//       }
//   } else {
//       println("$password \t is NOT Valid. Password length is ${password.length}. Password needs to be at least 8 characters")
//       bool = false
//   }
//
//    return bool


/**
 *
 * LEARNING
 * +---------------+----------------------+--------------------------+
 * | Regex Pattern | Kotlin String Literal| Meaning                  |
 * +---------------+----------------------+--------------------------+
 * | \d            | "\\d"                | Matches a digit (0-9)    |
 * | \w            | "\\w"                | Matches a word character |
 * | \s            | "\\s"                | Matches whitespace       |
 * +---------------+----------------------+--------------------------+
 *
 */