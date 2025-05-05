package main_kotlin.chapter2.tasks

// commenting out the NOT WORKING CODE

fun main() {

    // declaring a Int but initializing a float - not working ❌
//    var x : Int = 65.2

    // boolean - is working
    var isPunk = true

    // String - is working
    var message = "Hello"

    // Int - is working
    var y = 7

    // Int ref Int - is working
    var z : Int = y

    // Int + Int - is working
    y = y + 50

    // declaring a short  - is working
    var s: Short

    // initializing a Int to a Long by using the method .toLong() - is working
    var bigNum: Long = y.toLong()

    // initializing a Byte - is working
    var b: Byte = 2

    // converting a Byte into a Short - is working
    var smallNum = b.toShort()

    // initializing a Byte to Short - not working ❌
//    b = smallNum

    // initializing a String to Boolean - not working ❌
//    isPunk = "false"

    // converting an Int into Double - is working
    var k = y.toDouble()

    // converting a Double into Byte - not working ❌
//    b = k.toByte()
    // converting a Double into a Int then to Byte - is working (Down-Casting)
    b = k.toInt().toByte()

    // initializing a binary number/value to a Short - is working
        // Type Compatibility:
            //Kotlin allows direct assignment of compile-time constant
            // literals to smaller types like Short or Byte if the value is safe (i.e., no overflow).
    s = 0b10001




}