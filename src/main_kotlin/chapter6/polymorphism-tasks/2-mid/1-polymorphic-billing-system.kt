/**
 * Task 1: Polymorphic Billing System
 * Description:
 * Create an abstract class Product with a method calculatePrice(): Double.
 * Create two subclasses: DigitalProduct (no shipping) and PhysicalProduct (adds shipping cost).
 * Store them in a list and use polymorphism to calculate the total price.
 *
 */

fun main() {

    // store the obj of subclasses in a list
    val products = listOf(
        DigitalProduct("Snapchat+", 2.49),
        PhysicalProduct("Head First: Kotlin", 49.99, 3.0)
    )

    for (product in products) {
        println("${product.product} will cost you $${product.calculatePrice()}")
    }

} // main


abstract class Product(open var product: String, open var price: Double) {

    // method
    abstract fun calculatePrice(): Double


} //


// sub-class DigitalProduct (no shipping)
class DigitalProduct(override var product: String, override var price: Double): Product(product, price) {

    // method
    override fun calculatePrice(): Double {
        return price
    }
} // class DigitalProduct()


// sub-class PhysicalProduct (adds shipping cost)
class PhysicalProduct(override var product: String, override var price: Double, var shippingCost: Double): Product(product, price) {

    // method
    override fun calculatePrice(): Double {
        val totalPrice = price + shippingCost
        return totalPrice
    }
} // class DigitalProduct()

