import jdk.jfr.DataAmount

/**
 *
 *
 * 5. Mini Banking System
 *    Create a function transfer(from: Account, to: Account, amount: Double): Boolean that transfers money from one account to another.
 *    The class Account has the properties name: String and balance: Double.
 *    The function should check if there are sufficient funds and perform the transfer accordingly or print an error message.
 *
 */


fun main() {

    // obj of Accounts
    val account1 = Account("Paul", 2000.00)
    val account2 = Account("Moritz", 1500.00)


    transfer(account2, account1,1400.0)


} // main

fun transfer(from: Account, to: Account, amount: Double): Boolean {

//    var acc2 = from
//    var acc1 = to
    // transfers money from one account to another.
        // check for sufficient funds
        // either perform transfer or print error (if not sufficient funds)


    // from's funds are sufficient
    // check first if the input is negative or 0
    if (amount <= 0) {
        println("a negative number or 0 amount is not transferable")
        return false
    } else {
        // check if funds are sufficient
        if (from.balance >= amount) {
            println("PRE-TRANSFER:")
            println("the balance of the account of ${from.name} is: $${from.balance}")
            println("the balance of the account of ${to.name} is: $${to.balance}")

            // LOGIC
            // take from
            from.balance -= amount
            // give to
            to.balance += amount

            println("\n")
            println("POST-TRANSFER:")
            println("the following amount: $$amount succesfully transfered from: ${from.name} -> to ${to.name}")
            println("the balance of the account of ${from.name} is: $${from.balance}")
            println("the balance of the account of ${to.name} is: $${to.balance}")
            return true
        } else {
            println("ERROR: funds are not sufficient for this money transfer. Top-up your funds, please!")
            return false
        }
    }


} // fun transfer

class Account(var name: String, var balance: Double) {} // class Account



