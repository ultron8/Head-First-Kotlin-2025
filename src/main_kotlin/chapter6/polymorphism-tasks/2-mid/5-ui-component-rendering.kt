/**
 *
 * Task 5: UI Component Rendering
 * Description:
 * Create a base class UIComponent with a method render().
 * Subclasses: Button, TextField, and Image.
 * Override render() in each to print a specific rendering message.
 * Store different components in a list and call render() on each using polymorphism.
 *
 */


fun main() {

    val components = mutableListOf(Button(), TextField(), Image())

    for (i in components) {
        i.render()
    }

} // main

abstract class UIComponent(){

    abstract fun render()

} // class UIComponent()

class Button(): UIComponent() {

    override fun render() {
        println("This is a BUTTON.btn")
    }

}


class TextField(): UIComponent() {

    override fun render() {
        println("This is a TEXTFIELD.txt")
    }

}


class Image(): UIComponent() {

    override fun render() {
        println("This is a IMAGE.png")
    }

}


