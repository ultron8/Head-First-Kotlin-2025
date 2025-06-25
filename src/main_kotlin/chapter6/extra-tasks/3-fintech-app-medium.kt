import kotlin.math.pow

/**
 *
 * 3. FinTech App (Difficulty: Medium)
 *
 * **Task:**
 * Implement a class `BankAcc` with properties for account number and balance. Create a subclass `SavingsAccount` that adds an interest rate property.
 * Write a function that checks a list of accounts and prints a warning if any balance is below 100 euros.
 *
 * *Concepts to use:*
 * - Classes and Objects
 * - Subclasses and Superclasses (Inheritance)
 * - Functions
 * - Control Flow (for-loop, if-statement)
 *
 */


// COMMENT: modify the fun addInterestRates() in the class SavingAccounts()

fun main() {

    // obj of BankAcc
    var bankAcc1 = BankAcc("DE16100202002838978656", 20000.00)
    var bankAcc2 = BankAcc("DE67500211004587326573", 1202334.67)
    var bankAcc3 = BankAcc("DE84500210008351753436", 34562333.44)
    var bankAcc4 = BankAcc("DE61601202003451448415", 1024.12)
    var bankAcc5 = BankAcc("DE91500211006823173231", 99.34)

    var bankAccList: MutableList<BankAcc> = mutableListOf(bankAcc1, bankAcc2, bankAcc3, bankAcc4, bankAcc5)

    // check bank accounts
    checkAccs(bankAccList)

    var savingsAccount = SavingsAccount("DE16100202002838978656", 20000.00, 100.0)

//    addInterestRates
    var totalCapital1 = savingsAccount.addInterestRates(bankAcc1)

    println("|Acc - ${savingsAccount.accountNumber}| The saved capital of ${savingsAccount.balance * 0.25} will be ${totalCapital1} with a monthly interest rate of ${savingsAccount.interest}% over 10 years")

} // main

fun checkAccs(bankAcc: MutableList<BankAcc>) {

    for (i in bankAcc) {
        if (i.balance < 100) {
            println("WARNING: lovely customer with the ${i.accountNumber} your bank account is below 100€. Please top-up your balance!")
        } // if
    } // for

} // fun checkAccs()

open class BankAcc(open var accountNumber: String,
                   open var balance: Double) {



} // BankAccount

class SavingsAccount(override var accountNumber: String,
                     override var balance: Double,
                     var monthlySavings: Double): BankAcc(accountNumber, balance) {

    var interest: Double = 2.25

    // prompting user to put in the relevant data...
    /**
     * K0 -> balance
     * i -> interests
     * R = monthlySavings
     * nYears -> 10 years
     * nMonths -> 12 months
     * n -> savingPeriod (nYears*nMonths)
     *
     */

    // create method that shows the interest rate logic over time
    fun addInterestRates(bankAcc: BankAcc): Double {
        // at least 5000€ initial capital
        var initialCapital = balance * 0.25
        println(initialCapital)
        var interestBearingInitialCapital = initialCapital * (1 + interest/12).pow(10*12)
        println(interestBearingInitialCapital)  // this is wrong
        var interestBearingMonthlyPremiums = (monthlySavings * (1 + interest/12).pow(10*12) - 1) / (interest/12)
        println(interestBearingMonthlyPremiums)  // this is wrong
        var totalFinalCapital = interestBearingInitialCapital + interestBearingMonthlyPremiums  // this is wrong

        return totalFinalCapital  // this is wrong

    } // fun addInterestRates

}

