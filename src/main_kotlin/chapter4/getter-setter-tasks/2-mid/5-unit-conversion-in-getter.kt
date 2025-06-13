/*
* Task 5: Unit Conversion in Getter
* Goal: Create a Distance class with a private meters property.
* Expose a read-only property inKilometers using a getter that converts meters to kilometers.
*
* */

class Distance(private var meters: Double){

    val inKilometers: Double
        get() {
            return meters / 1000
        }

} // class Distance

fun main() {

    // obj of Distance
    var distance = Distance(1230.23)

    // cause distance.meters is private I don't have access to it
        // reverse thinking it distance.inKilometers*1000 is the same as the variable meters
    println("${distance.inKilometers*1000} meters in km are: ${distance.inKilometers} km")

} // main


