fun main() {

} // main




// class Appliance (Gerät)
abstract class Appliance(){

    // properties
    var pluggedIn: Boolean = true
    abstract var color: String

    // methods
    abstract fun consumePower()

} // class Appliance


class CoffeeMaker(): Appliance() {

    // properties
    override var color = ""
    var coffeeLeft: Boolean = false

    // methods
    override fun consumePower() {
        println("Consuming power")
    } // consumePower()

    fun fillWithWater() {
        println("Fill with water")
    } // fillWithWater

    fun makeCoffee() {
        println("Make the coffee")
    } // makeCoffee


} // class CoffeeMaker()