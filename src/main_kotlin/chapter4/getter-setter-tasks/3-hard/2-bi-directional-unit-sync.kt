/*
* Task 2: Bi-directional Unit Sync (Celsius ↔ Fahrenheit)
* Goal: Create a class Temperature (Tmp) with a primary unit in Celsius and a secondary property for Fahrenheit.
* When one is set, the other should update automatically via custom getter and setter logic.
*
* */

fun main() {

    val temp = Tmp(25.0) // Celsius
    temp.fahrenheit = 98.6
    println(temp.celsius) // Updated to corresponding Celsius


} // main

class Tmp(var fahrenheit: Double){

    val celsius : Double
        get() {
            return (fahrenheit - 32) * (5/9)
        }

} // class Temperature