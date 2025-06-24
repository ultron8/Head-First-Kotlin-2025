/**
 *
 * Task 3: Transport Fare Calculator
 * Description:
 * Create a sealed class Transport with subclasses Bus, Train, and Taxi.
 * Each should override a method calculateFare(distance: Int): Double.
 * Write a function that takes a Transport object and prints the fare for a given distance.
 *
 */

fun main() {

//    // output 1
//    // obj of transport sub-classes
//    var bus = Bus()
//    var train = Train()
//    var taxi = Taxi()
//
//    farePrice(bus)
//    farePrice(train)
//    farePrice(taxi)

    // output 2
    var list = mutableListOf(Bus(), Train(), Taxi())

    for (i in list) {
        farePrice(i)
    }




} // main



sealed class Transport() {

    abstract var pricePerKM: Double

    open fun calculateFare(distance: Int): Double {
        return pricePerKM * distance
    } //
} // superclass transport

fun farePrice(transportVehicle: Transport) {

    val result = when (transportVehicle) {
        is Bus -> "The fare price for the bus distance of 20 km is ${transportVehicle.calculateFare(distance = 20)}"
        is Train -> "The fare price for the bus distance of 20 km is ${transportVehicle.calculateFare(distance = 20)}"
        is Taxi -> "The fare price for the bus distance of 20 km is ${transportVehicle.calculateFare(distance = 20)}"
        else -> "unknown transport"
    } // when


    println(result)

} // fun farePrice

class Bus(): Transport() {

    override var pricePerKM: Double = 2.29

    override fun calculateFare(distance: Int): Double {
        return super.calculateFare(distance)
    }

} // sub-class Bus()


class Train(): Transport() {

    override var pricePerKM: Double = 7.562

    override fun calculateFare(distance: Int): Double {
        return super.calculateFare(distance)
    }

} // sub-class Train()


class Taxi(): Transport() {

    override var pricePerKM: Double = 15.176

    override fun calculateFare(distance: Int): Double {
        return super.calculateFare(distance)
    }

} // sub-class Taxi


/**
 * LLM recommendation of how to structure the code:
 *
 * sealed class Transport {
 *     abstract val pricePerKM: Double
 *     open fun calculateFare(distance: Int): Double = pricePerKM * distance
 * }
 *
 * class Bus : Transport() {
 *     override val pricePerKM = 2.29
 * }
 *
 * class Train : Transport() {
 *     override val pricePerKM = 7.562
 * }
 *
 * class Taxi : Transport() {
 *     override val pricePerKM = 15.176
 * }
 *
 * fun farePrice(transport: Transport, distance: Int = 20) {
 *     val type = when (transport) {
 *         is Bus -> "bus"
 *         is Train -> "train"
 *         is Taxi -> "taxi"
 *     }
 *     println("The fare price for the $type for a distance of $distance km is ${transport.calculateFare(distance)}")
 * }
 *
 * fun main() {
 *     val transports = listOf(Bus(), Train(), Taxi())
 *     for (t in transports) {
 *         farePrice(t)
 *     }
 * }
 *
 *
 *
 *
 */