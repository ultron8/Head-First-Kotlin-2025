import kotlin.random.Random

// generating random numbers in fun main
// Numbers are passed to the function maxValue() with two parameters
// maxValue evaluates which of the values of x and y is bigger
// and prints out the max value statement

fun main() {

    var x = Random.nextInt(10)
    var y = Random.nextInt(10)

    var maxValuePrint = maxValue(x, y)

    maxValuePrint


}


fun maxValue(x_param : Int, y_param: Int) {

    if (x_param > y_param) {
        println("x: $x_param is bigger then y: $y_param")
    } else if (x_param == y_param) {
        println("x: $x_param is equal to y: $y_param")
    } else {
        println("y: $y_param is bigger then x: $x_param")
    } // if statement

} // fun main




