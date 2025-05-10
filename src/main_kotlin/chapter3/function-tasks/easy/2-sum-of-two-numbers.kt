// Task 2: Sum of Two Numbers
//Description:
//Write a function sum that takes two integers and returns their sum.


fun main(){

    var sumResult = sum(10, 20)
    println("Sum of 10 + 20 = $sumResult")
}

fun sum(x_param: Int, y_param: Int): Int {
    return x_param + y_param
}