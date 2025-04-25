fun main(){

    println("printing anyway")

    // without x++ -> infinite loop
    var x = 1
    while (x < 10) {
        if (x > 3) {
            println("x1 - $x: big x")
        } // if
        x++
    } // while


    // if val x2 = 10 -> reassigned not possible. Code wouldn't compile
        // changed it to var x2 = 10
    var x2 = 10
    while (x2 > 1) {
        x2--
        if (x2 < 3) println("x2: $x2: small x2")
    } // while

    // without else "x3 - $x3: somethin else" the code wouldn't compile
    var x3 = 10
    while (x3 > 1) {
        x3--
        println(if (x3 < 3) "x3 - $x2: small x3" else "x3 - $x3: somethin else")
    } // while




} // fun main