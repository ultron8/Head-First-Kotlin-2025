// this task was to see how much is already understood about Kotlin and programming in advance

fun main() {

    // declare a constant variable named 'name' and initialize the value of 'Misty'
    val name = "Misty"
    // declare a constant variable named 'height' and initialize the integer of 9
    val height = 9

    // output some Strings & co.
    println("Hello")
    println("My cat is called $name")
    println("My cat is $height inches tall")

    // initialize some values
    val a = 6
    val b = 7
    // applying arithmetic addition
    val c = a + b + 10
    // changing the integer into a string through the .toString() method
    val str = c.toString()

    // try out more things f.e. control flow through a while loop
    // create a constant variable named 'numList' which contains an array with 3 integers
    val numList = arrayOf(1, 2, 3)
    var x = 0
    // using x with a comparison operator to execute some task
    while (x < 3) {
        // output the value of x and access the index of numList based on the value in x
            // x = 0 -> numList[0] = 1
        println("Item $x is ${numList[x]}")
        // incrementing x by 1
        x++
    } // while

    //
    // create an object of the class Cat which has two parameters named 'name', and 'height'
    val myCat = Cat(name, height)
    // calculate: substraction between height and 3, cause height contains an integer
    val y = height - 3

    // if statement: check through a comparison operator
    // if y < 5 then use the object of Cat 'myCat' and access the method in Cat named 'miaow'
        // maybe the 4 as a parameters means 4 times?
    // furthermore this syntax uses an expression body syntax i.e. a simplified form of the representation of an if statement
    if (y < 5) myCat.miaow(4)
    else myCat.miaow(3)

    // again a while loop which checks if y < 8
    // if yes
    while (y < 8) {
        // then the object myCat : Cat access the internal method play()
        myCat.play()
        // incrementing y by 1
            // but this is not possible because y is declared as a val (constant variable)
        //y++
    } // while



} // fun main

class Cat(val name : String, val height : Int) {

    fun miaow(someInt_param: Int) {
        for (i in 0 .. someInt_param) {
            println("miaow")
        }
    } // miaow

    fun play(): String {
        return "the cat: ${this.name} starts to play"
    }

} // class Cat