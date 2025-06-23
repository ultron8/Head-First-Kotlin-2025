// Task:
// produce this out out
// Plane is flying
// Superhero is flying

fun main() {

    // my first choice
    val f = arrayOf(Bird(), Plane(), Superhero())
    var x = 0
//    while(x in 0..2) {
//        val y = when (f[x]) {
//            is Bird -> false
//            else -> true
//        } // when
//        if (y) {
//            f[x].fly()
//        } // if
//        x++
//    } // while

    // this was tricky to identify on the first sight
    while (x in 0..2) {
        when (f[x]) {
            is Bird -> {
                x++
                f[x].fly()
            } // is operator
            is Plane, is Superhero -> f[x].fly()
        } // when
        x++
    } // while
    // what is happening in this code above
        // declare f as an array which hold Bird(), Plane(), Superhero()
        // x = 0
        // while x is between 0 and 2 -> run the while loop -> x = 0
            // when f at the index of x (iteration 1 is index: 0)
                // check with the 'is' operator if index 0 is Bird, if so increment x and access the fly() method of the index 1 (means f[1].fly() == of Plane()) -> x = 1
            // the code jumps directly to the incrementation of x++ -> x = 2
        // while x is between 0 and 2 -> run the while loop -> x = 2
            // when f at the index of x (iteration 2 is index: 2)
                // check with the 'is' operator if index 2 is Bird or Plane or Superhero -> oh its Superhero obviously
                // so this access the fly() method of the index 2 (means f[2].fly() == of Superhero() -> x = 2
            // the code jumps directly to the incrementation of x++ -> x = 3
        // end of the while loop, bc it is just between 0..2

} // main


interface Flyable {
    val x: String

    fun fly() {
        println("$x is flying")
    } // fun
} // interface

class Bird: Flyable {
    override val x = "Bird"
}

class Plane: Flyable {
    override val x = "Plane"
}

class Superhero: Flyable {
    override val x = "Superhero"
}

