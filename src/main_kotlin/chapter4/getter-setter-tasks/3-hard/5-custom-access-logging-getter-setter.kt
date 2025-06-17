/*
* Task 5: Custom Access Logging in Getter/Setter
* Goal: Create a class TrackedValue<T> with a generic value property.
* Every time the property is read or written, log the action (e.g., to the console).
* Count and expose the number of reads and writes via two separate read-only properties: readCount, writeCount.
*
* */

// DON'T HAVE THE KNOW-HOW ABOUT GENERIC VALUE PROPERTIES


// LLM version
fun main() {
    val someInt = TrackedValue(100)
    val someStr = TrackedValue("Ultron")

    // read
    println(someInt.value)
    println(someStr.value)

    // write
    someInt.value = 200
    someStr.value = "Vision"

    // read again
    println(someInt.value)
    println(someStr.value)

    // print counts
    println("Int reads: ${someInt.readCount}, writes: ${someInt.writeCount}")
    println("Str reads: ${someStr.readCount}, writes: ${someStr.writeCount}")
}

class TrackedValue<T>(initialValue: T) {
    var readCount = 0
        private set
    var writeCount = 0
        private set

    var value: T = initialValue
        get() {
            readCount++
            return field
        }
        set(newValue) {
            writeCount++
            field = newValue
        }
}


// My version - but could definitley not solve the problem below
//fun main() {
//    var someInt = TrackedValue(100)
//    var someStr = TrackedValue("Ultron")
//
//    // read
//    println(someInt)
//    println(someStr)
//
//
//} // main
//
//class TrackedValue<T>(val someValue: T) {
//
//    var readCount: Int = 0
//        get() {
//            if (someValue.length > 0)) {
//                readCount++
//            }
//        } // getter
//    var writeCount: Int = 0
//        set(value) {
//            field = value
//            if (field != value) {
//                writeCount++
//            }
//        } // setter
//
//} // class TrackedValue

