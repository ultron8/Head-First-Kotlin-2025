/*
* Task 5: Add Suffix with Custom Getter
* Task:
* Create a class Employee with a name and a position.
* Add a custom getter for position that always returns "Position: <value>".
*
* */

fun main() {

    // obj of Employee
    var employeeAnton = Employee("Anton", "CEO & Co-Founder")
    println(employeeAnton.name)
    println("has the ${employeeAnton.position} at lovable.dev" )


} // main

class Employee( val name: String, val _position: String) {

    val position : String
        get() {
            return "Position: $_position"
        }



} // class Employee