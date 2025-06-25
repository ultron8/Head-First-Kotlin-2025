/**
 *
 * 4. LLM App (Large Language Model App) (Difficulty: Hard)
 *
 * **Task:**
 * Define an interface `Promptable` with a function `generatePrompt(): String`.
 * Implement two classes, `ChatBot` and `Assistant`, that implement this interface with their own versions of `generatePrompt()`.
 * Write a function that iterates over a list of `Promptable` objects and prints the generated prompt for each.
 *
 * *Concepts to use:*
 * - Abstract Classes and Interfaces (Polymorphism)
 * - Classes and Objects
 * - Functions
 * - Control Flow (for-loop)
 *
 *
 */


fun main() {

    // prompt objs
    var prompt1ChatBot = ChatBot("How I can use this tool?")
    var prompt1Assistant = Assistant("Create an app which can upload PDF documents from the german company registery, analyse them and extract only the necessary points")
    // create more prompts + add them to the list + create more cases in each classes (chatbot and assistant)

    // create list of classes instead of individuell objects
    val promptables = listOf(ChatBot("..."), Assistant("...")) // use this with the fun printAllPrompts() function

    var promptsList = mutableListOf(prompt1ChatBot, prompt1Assistant)

    printAllPrompts(promptsList)




} // main

interface Promptable {
    fun generatePrompt(): String// fun generatePrompt
} // interface


fun printAllPrompts(promptslist: MutableList<Promptable>) {

    // code logic
    for (i in promptslist) {
        println(i.generatePrompt())
    } // for

} // fun iterateOverListPrompts


// Classes
class ChatBot(var prompt: String): Promptable{

    var howTo = "How I can use this tool?"
    var result = ""
    override fun generatePrompt(): String {
        if (prompt == howTo) {
            result = "a how to use manual about LLMs..."
        }
        return result
    } // fun generatePrompt()

}  // class ChatBot()

class Assistant(var prompt: String): Promptable {

    var howTo = "Create an app which can upload PDF documents from the german company registery, analyse them and extract only the necessary points"
    var result = ""
    override fun generatePrompt(): String {
        if (prompt == howTo) {
            result = "ui = \"\"\"\n" +
                    "    +--------------------------------------+\n" +
                    "    |           \uD83D\uDCDD  My To-Do App           |\n" +
                    "    +--------------------------------------+\n" +
                    "    | \uD83D\uDD0D Search: [_____________________]   |\n" +
                    "    |                                      |\n" +
                    "    | ➕ Add New Task                      |\n" +
                    "    |                                      |\n" +
                    "    | ✅ [ ] Buy groceries                 |\n" +
                    "    | ✅ [x] Finish homework               |\n" +
                    "    | ✅ [ ] Call mom                      |\n" +
                    "    | ✅ [ ] Walk the dog                  |\n" +
                    "    |                                      |\n" +
                    "    | ----------------------------------- |\n" +
                    "    | \uD83D\uDCC5 Today: June 25, 2025              |\n" +
                    "    | \uD83D\uDCA1 Tip: Tap a task to mark it done!  |\n" +
                    "    +--------------------------------------+\n" +
                    "    | \uD83D\uDCF1 Home   \uD83D\uDCCB Tasks   ⚙\uFE0F Settings       |\n" +
                    "    +--------------------------------------+\n" +
                    "\"\"\""
        }
        return result
    } // fun generatePrompt()

} // class Assistant()