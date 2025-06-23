/**
 *
 * Task 4: Using open Keyword
 * Description:
 * Create an open class Shape with a method draw().
 * Create subclasses Circle and Square that override draw().
 * Create objects of both and call draw() on them.
 *
 */

fun main() {

    // create obj's
    var circle: Circlee = Circlee()
    var square = Square()

    // call draw()
    circle.draw()
    square.draw()


} // main

open class Shape(){

    open fun draw(){
        println("draw a shape")
    } // draw()


} // superclass Shape()

class Circlee(): Shape() {

    override fun draw() {
//        super.draw()
        println("draw a circle")
    } //

} // subclass Circlee()

class Square(): Shape() {

    override fun draw() {
//        super.draw()
        println("draw a square")
    } //

} // subclass Square()