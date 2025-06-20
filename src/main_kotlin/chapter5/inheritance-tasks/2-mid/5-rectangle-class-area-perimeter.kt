/*
* Task 5: Rectanglee Class with Area & Perimeter
* Description: Create a class Rectangle with:
* Properties: length and width
* A method area()
* A method perimeter()
* Add a check that length and width must be positive values (use init block)
*
*
* */

fun main() {

    // obj of Rectanglee
    val rectangle = Rectang(13.0, 34.0)

    // area
    println("This is the rectangle area: ${rectangle.area()}")

    // perimeter
    println("This is the perimeter: ${rectangle.perimeter()}")

} // main

class Rectang(var length: Double, var width: Double) {

    init {
        check (length > 0) {
            println("length must be positive")
        }
        check (width > 0) {
            println("width must be positive")
        }
    } // init

    // area: a = w * l
    fun area(): Double {
        return length * width
    } // area


    // perimeter: P = 2l + 2w
    fun perimeter(): Double {
        return (2 * length) + (2 * width)
    } // perimeter



} // Rectangle