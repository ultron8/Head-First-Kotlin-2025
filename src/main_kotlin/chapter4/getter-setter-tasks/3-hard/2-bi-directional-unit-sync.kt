/*
* Task 2: Bi-directional Unit Sync (Celsius ↔ Fahrenheit)
* Goal: Create a class Temperature (Tmp) with a primary unit in Celsius and a secondary property for Fahrenheit.
* When one is set, the other should update automatically via custom getter and setter logic.
*
* */

// COMMMENT: still to hard to do by my own

class Tmp(celsius: Double) {

    // Private backing field in Celsius
    private var _celsius: Double = celsius

    // Celsius property
    var celsius: Double
        get() = _celsius
        set(value) {
            _celsius = value
        }

    // Fahrenheit property
    var fahrenheit: Double
        get() = _celsius * 9 / 5 + 32
        set(value) {
            _celsius = (value - 32) * 5 / 9
        }
} // class Tmp

fun main() {
    val tmp = Tmp(0.0)
    println("Celsius: ${tmp.celsius}, Fahrenheit: ${tmp.fahrenheit}") // 0.0, 32.0

    tmp.fahrenheit = 212.0
    println("Celsius: ${tmp.celsius}, Fahrenheit: ${tmp.fahrenheit}") // 100.0, 212.0

    tmp.celsius = 20.0
    println("Celsius: ${tmp.celsius}, Fahrenheit: ${tmp.fahrenheit}") // 20.0, 68.0
} // main
