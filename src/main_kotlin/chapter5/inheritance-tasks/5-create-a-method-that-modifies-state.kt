/*
*
* Task 5: Create a Method That Modifies State
* Goal: Create a class BankAccount with balance: Double.
* Requirement: Add a method deposit(amount: Double) that adds to the balance. Print the new balance after depositing.
*
* */

fun main() {

    var bankAccount = SomeBankAccount(2000.00)
    var newBalance = bankAccount.deposit(159.12)

    println("The new balance on your bank Account is: ${newBalance}")


} // main

class SomeBankAccount(var balance: Double) {

    fun deposit(amount: Double): Double {
        balance = balance + amount
        return balance
    } // amount()

} // SomeBankAccount