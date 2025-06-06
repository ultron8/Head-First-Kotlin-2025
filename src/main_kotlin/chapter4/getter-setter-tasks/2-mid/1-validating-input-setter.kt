/*
* Task 1: Validating Input with Setter
* Goal: Create a BankAccount class with a balance property.
* In the setter, prevent the balance from being set to a negative value.
*
* */

/*
* // Example:
* // val account = BankAccount()
* // account.balance = -100  // Should not change the balance
* */


fun main() {


    var account = BankAccount()

    account.balance = 2000

    // test 1
    println("the actual balance is: ${account.balance}")
    account.balance += 100
    println("the actual balance is: ${account.balance}")
    account.balance -= 100
    println("the actual balance is: ${account.balance}")
    account.balance -= 2000
    println("the actual balance is: ${account.balance}")
    account.balance -= 146
    println("the actual balance is: ${account.balance}")
    account.balance = -1246
    println("the actual balance is: ${account.balance}")



} // fun main()

class BankAccount() {

    var balance : Int = 0
        set(value) {
            if (value < 0) {
                println("a bank account be negative atm")
                field = 0
            } else {
                field = value
            }
        } // setter

} // class BankAccount
