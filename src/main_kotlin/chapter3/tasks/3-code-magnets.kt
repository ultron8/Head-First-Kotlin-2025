// SINGLE BODY EXPRESSION

// max value example
//fun max(a: Int, b: Int): Int {
//    val maxValue = if (a > b) a else b
//    return maxValue
//}

// a shorter expression
//fun max(a: Int, b: Int): Int = if (a > b) a else b

// even shorter expression
    // w/o the : Int of the return expression of the function
fun max(a: Int, b: Int) = if (a > b) a else b


// -----------------------------------
// fun getGameChoice accepts an array of strings

fun getGameChoice(optionsParam: Array<String>) = optionsParam[(Math.random() * optionsParam.size).toInt()]

// body:
/* *
* Math.random generates a random number between 0 and 1
* which will be multiplied with the size of the optionsParam array
* after that the result will be converted into an Int
* this result will be used to access the index of optionsParam through the square brackets
*
* */