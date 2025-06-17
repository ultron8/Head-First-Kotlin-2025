import javax.print.Doc

/*
* Task 4: Auto-Correct Input with Setter
* Goal: Create a class Document with a property title.
* The setter should trim whitespace, capitalize the first letter, and convert the rest to lowercase.
* The getter should return the formatted title.
* Input: " hELLo WoRLD " → Output: "Hello world"
*
* */


// STILL I NEED GUIDEDANCE THROW AN LLM ABOUT THE DIFFERENT IN-BUILT FUNCTIONS F.E. TRIM(), DROP(), uppercaseChar(), isNotEmpty()

class Document(){

    var title : String = " "
        set(value) {
//            println("this is value: $value")
            val trimmed = value.trim()
//            println("this is trimmed: $trimmed")

            // recommendation by LLM: If the value passed to the setter is blank or empty, trimmed[0] will throw an IndexOutOfBoundsException.


            field = if (trimmed.isNotEmpty()) {
                trimmed[0].uppercaseChar() + trimmed.drop(1).lowercase()
            } else {
                ""
            }
//

        }
        get() {
            return field
        }


} // class Document

fun main() {

    // obj of Document
    var document = Document()

    document.title = " hELLo WoRLD "

    var test = document.title
    println(test)



    document.title = "   "
    println(document.title) // Output: (empty string, no crash)

} // main


