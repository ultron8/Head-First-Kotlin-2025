import kotlin.math.pow

/*
* Task 2: Add a Method to a Class
* Goal: Create a class Circle with a property radius.
* Requirement: Add a method getArea() that calculates and returns the area of the circle. Print the result.
*
* */


fun main() {

    var areaIs = Circle(10.0)

    var radius1 = areaIs.getArea()
    // formatting the
    var radius1Formatted = String.format("%.2f", radius1)
    // displaying a number with a fixed number of decimal places
    println("the ${areaIs.radius} has area of ${radius1Formatted}")

} // main

class Circle(var radius: Double) {

    // formula for area calc: A=πr2

    fun getArea(): Double {
        val a = 3.14 * radius.pow(2)
        return a
    }

} // class Circle