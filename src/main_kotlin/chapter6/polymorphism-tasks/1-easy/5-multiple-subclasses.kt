/**
 *
 * Task 5: Multiple Subclasses
 * Description:
 * Create a class Employee with a property name and a function work().
 * Create two subclasses Manager and Intern.
 * Override work() in both to print what kind of work each does.
 * Call work() on both using a polymorphic reference.
 *
 */


fun main() {
    val employees = mutableListOf(Manager("Paul"), Intern("Luca"))
    for (employee in employees) {
        employee.work()
    } //

} // main

abstract class Staff(open var name: String) {
    abstract fun work()

} // class Staff()

class Manager(override var name: String): Staff(name) {
    override fun work() {
        println("$name the manager is managing the employees of the company.")
    }

} // sub-class Manager()

class Intern(override var name: String): Staff(name) {
    override fun work() {
        println("$name the intern is helping out the manager in the company to get experience.")
    }

} // sub-class Intern()

