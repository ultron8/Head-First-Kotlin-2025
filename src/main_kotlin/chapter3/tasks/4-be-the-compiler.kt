package main_kotlin.chapter3.tasks

fun main() {
    val someObj = timesThree(1)
    println("Result of the second fun: $someObj")
}


// code will compile without return value
fun doSomething(msg: String, i: Int): Unit {
    if (i > 0) {
        var x = 0
        while (x < i) {
            println(msg)
            x++
        } // while
    } // if
} // fun doSomething

// the parameter x of timesThree cannot be reassigned
// cause they threated as local variables created using val,
// so they cant reused for other values ❗️
//fun timesThree(x: Int): Int {
//    x = x * 3
//    return x
//}

// what is missing?
// This new x shadows the parameter x, meaning that within the scope after
// the local declaration, references to x now refer to the local variable,
// not the function parameter anymore.
//fun timesThree(x: Int): Int {
//    val x = x * 3
//    return x
//}

// preferred syntax
fun timesThree(x: Int): Int {
    val result = x * 3
    return result
}


// : Int -> type of the function is missing
// cause the function has a return value at the end
fun maxValue(args: Array<Int>) {
    var max = args[0]
    var x = 1
    while (x < args.size) {
        var item = args[x]
        max = if (max >= item) max else item
        x++
    } // while
} // fun maxValue



