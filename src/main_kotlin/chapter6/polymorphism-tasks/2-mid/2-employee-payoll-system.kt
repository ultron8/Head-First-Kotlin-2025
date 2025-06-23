/**
 *
 * Task 2: Employee Payroll System
 * Description:
 * Create an abstract class Employee with properties name and baseSalary, and an abstract method calculateMonthlySalary(): Double.
 * Create two subclasses:
 *
 * FullTimeEmployee that adds a bonus to the base salary.
 * PartTimeEmployee that gets paid by the hour.
 *
 * Store a list of employees and calculate the total monthly payroll using polymorphism.
 *
 */

fun main() {

    // obj's
    var ft1 = FullTimeEmployee("Kevin Systrom", 3345.34, 345637.43)
    var ft2 = FullTimeEmployee("Andressen Horrowitz", 7456.34, 634567.43)
    var ft3 = FullTimeEmployee("Bryon Trott", 2348.34, 3457.43)
    var ft4 = FullTimeEmployee("Lazy D", 2482.69, 0.0)
    var pt1 = PartTimeEmployee("Peter Thiel", 0.0, 22)
    var pt2 = PartTimeEmployee("Alexander Karp", 0.0, 11)
    var pt3 = PartTimeEmployee("Warren Buffett", 0.0, 14)

    var personnel: MutableList<Personnel> = mutableListOf(
        ft1,
        ft2,
        ft3,
        ft4,
        pt1,
        pt2,
        pt3
    ) // mutableLIst

    var totalMonthlyPayroll = 0.0


    for (p in personnel) {
        totalMonthlyPayroll += p.calculateMonthlySalary()
    }

    println("The total monthly payroll is: $$totalMonthlyPayroll ")


} // main

abstract class Personnel(){
        abstract var name: String
        abstract var baseSalary: Double

        abstract fun calculateMonthlySalary(): Double
} // superclass Personnel

class FullTimeEmployee(override var name: String, override var baseSalary: Double, var bonus: Double): Personnel() {




    override fun calculateMonthlySalary(): Double {
        val fullSalary = baseSalary + bonus
        return fullSalary
    }

} // FT

class PartTimeEmployee(override var name: String, override var baseSalary: Double, var hours: Int): Personnel() {

    override fun calculateMonthlySalary(): Double {
        baseSalary = hours * 15.0
        return baseSalary
    }

} // PT