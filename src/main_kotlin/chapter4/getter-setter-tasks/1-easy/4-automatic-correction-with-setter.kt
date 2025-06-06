/*
*
* Task 4: Automatic Correction with Setter
* Task: Create a class Temperature with a property celsius (Double).
* Add a setter that prevents values below absolute zero (i.e., -273.15).
*
* */


fun main() {

    val testAbsoluteZero = Temperature(-274.16)
    println("What is the temperature? \n${testAbsoluteZero.celsius}")

}

class Temperature(_celsius : Double) {
    var celsius: Double = 0.0
        set(value) {
            if (value < -273.15) {
                println("Celsius cannot be below absolute zero")
            } else {
                field = value
            } // if

        } // setter

    init {
        celsius = _celsius // uses the setter
    }

} // class Tempera