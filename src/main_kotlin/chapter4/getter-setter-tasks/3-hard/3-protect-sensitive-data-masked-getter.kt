/*
*
* ask 3: Protect Sensitive Data with Masked Getter
* Goal: Create a class UserAccount with a property password: String.
* Expose a custom getter that only returns masked characters (e.g., "*******").
* Still allow the password to be set normally.
*
* */

fun main() {

    // obj of UserAccount
    var userAcc = UserAccount("@vtgj")

    val maskedPw = userAcc.password
    println("This is your masked password: $maskedPw and length is ${maskedPw.length}")

} // main



class UserAccount(private var _password: String){

    private fun myRepeat(_someString: String): String {
        var strAsterikLength = ""
        for (i in 0 until _someString.length){
            strAsterikLength += "*"
        }
        return strAsterikLength
    } // fun repeat

    var password: String = _password
        get() {
                val maskedVar = myRepeat(field)
                return maskedVar
        } // getter

} // class UserAccount
