/*
* Task 1: Create a Simple Car Class
* Goal: Create a class Car with properties: brand, model, and year.
* Requirement: Instantiate an object in main() and print its values.
*
* */

class SomeCar(var brand: String, var model: String, var year: Int) {

    init {
        println("The car is: $brand, $model, $year ")
    }

}

fun main() {

    var tesla = SomeCar("Tesla", "Y", 2020)
    var bmw = SomeCar("BMW", "X6", 2023)
    var mercedesBenz = SomeCar("Mercedes Benz", "C64", 2018)

    // instead of init, could use also
    /*
    * println("Car 1: ${tesla.brand} ${tesla.model}, Year: ${tesla.year}")
    * println("Car 2: ${bmw.brand} ${bmw.model}, Year: ${bmw.year}")
    * println("Car 3: ${mercedes.brand} ${mercedes.model}, Year: ${mercedes.year}")
    *
    * */

} // main