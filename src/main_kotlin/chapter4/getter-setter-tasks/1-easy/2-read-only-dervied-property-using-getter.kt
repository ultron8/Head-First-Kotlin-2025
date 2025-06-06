/*
* Task 2: Read-Only Derived Property Using Getter
* Task: Create a class Rectangle with length and width.
* Add a read-only property area that returns the product of length and width using a custom getter.
*
* */

fun main() {
    var output = RectangleE(120, 30)
    println("Rectangle has a area of ${output.area} m^2")

} // fun main

class RectangleE(var length: Int, var width: Int) {
    val area : Int
        get() {return length * width }
} // class RectangleE

