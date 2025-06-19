/*
*
* Task 3: Temperature Tracker with Unit Conversion
* Description: Create a class Temperature with a property celsius: Double.
* Add a getter-only property called fahrenheit that converts Celsius to Fahrenheit using the formula:
* fahrenheit = celsius * 9/5 + 32
*
*
* */

fun main() {

    // obj of Temp
    val temp = Temperature(32.0)
    var fahrenheit = temp.fahrenheit

    println("${temp.celsius} C° is equal to ${temp.fahrenheit} F")



} // main

class Temperature(var celsius: Double) {

    val fahrenheit : Double
        get() {
            return celsius * 9/5 + 32
        }

} // class Temperature
