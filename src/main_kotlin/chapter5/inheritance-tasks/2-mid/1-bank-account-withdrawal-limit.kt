/*
* Task 1: BankAccount with Withdrawal Limit
* Description: Create a BankAccount class that has the following:
    * Properties: accountHolder: String, balance: Double
    * Method: withdraw(amount: Double)
        * Prevent withdrawal if amount exceeds balance
        * Show a message if insufficient funds
*
* */

fun main() {

    var bankAccountWD = BankAccountWD("Benjamin Graham", 2000.00)

    // withdrawal
    bankAccountWD.withdraw(300.00)
    println("The 1st withdrawal of $300.00 results in a new balance of: $${bankAccountWD.balance}")

    bankAccountWD.withdraw(343.00)
    println("The 2nd withdrawal of $343.00 results in a new balance of: $${bankAccountWD.balance}")

    bankAccountWD.withdraw(2000.00)
    println("The 3rd withdrawal of $2000.00 results in a new balance of: $${bankAccountWD.balance}")


} // main

class BankAccountWD(var accountHolder: String, var balance: Double) {

    // method
    fun withdraw(amount: Double) {
        if (amount > balance) {
            println("❌Attention, you cannot withdrawal more from your bank account!")
            println("You want to take $$amount from your $$balance balance on your bank account")
            println("Your balance would be: $${balance-amount}")
        } else {
            balance -= amount
        }
    } // fun withdraw

} // class BankAccountWD

