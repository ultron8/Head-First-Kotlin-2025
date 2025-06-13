/*
* Task 4: Internal State Tracking Goal: Create a Car class with a speed property.
* In the getter, return the current speed.
* In the setter, increase a counter each time the speed is changed.
*
* */

class Car() {

    var changeCount = 0

    var speed : Int = 0
        get() {
            return field
        } // getter
        set(value) {
//            println("This is field: $field")
//            println("this is value: $value")
//            if (speed < value || speed > value) -> my solution
            // recommended solution by LLMs
                // explanation: The setter compares the current value (field) with the new value (value). If they are different, it increments changeCount.
            if (field != value) {
                changeCount++
            } // if
            field = value
        } // setter

} // class Car

fun main() {

    var car = Car()
    println(car.speed) // this must be 0
    car.speed = 100
    println(car.speed)
    car.speed = 200
    println(car.speed)
    car.speed = 50
    println(car.speed)
    car.speed = 10
    println(car.speed)
    println("How often the car changed its speed: ${car.changeCount} times")

} // main