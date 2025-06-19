/*
*
* Task 3: Custom Getter to Format Output
* Task: Create a class Book with a property title (String).
* Make a getter that returns the title in uppercase every time it’s accessed.
*
* */

fun main(){

    var createTitle = Books("Ultron will conquer the world")
    println("The title of the WSJ is: ${createTitle.title}")
    println("The title of the WSJ is: ${createTitle.title_param}")

} // fun main

// Could use private val title_param: String
// Then 'title_param' is not accessible: it is private in 'Book'
class Books(val title_param: String) {

    val title : String
        get() {
            return title_param.uppercase()
        } // getter
} // class Book