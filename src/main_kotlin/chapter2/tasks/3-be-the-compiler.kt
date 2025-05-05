package main_kotlin.chapter2.tasks

fun main(){
    val hobbits = arrayOf("Frodo", "Sam", "Merry", "Pippin")
    var x = 0

    // if x < 5 then
        // Exception: ArrayIndexOutOfBoundsException
    while (x < 4) {
        println("${hobbits[x]} is a good Hobbit name")
        x++
    }

} // fun main