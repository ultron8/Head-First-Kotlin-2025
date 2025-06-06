/*
* Task 3: Setter with Logging Goal:
* Create a Thermostat class with a temperature property.
* In the setter, print a message every time the temperature is updated.
* */

fun main() {

    var thermostat = Thermostat(20.0)

    // update temperature
    thermostat.temperature = 50.0

} // fun main


class Thermostat(var _temperature: Double) {

    var temperature = _temperature
        set(value) {
            println("the temperature was $_temperature and is now updated to $value fahrenheit")
            field = value // This actually updates the property!
        }
} // class Thermostat