/**
 *
 * 2. Social Messaging App (Difficulty: Medium)
 *
 * **Task:**
 * Create a class `Message` with properties for sender, receiver, and message content.
 * Implement getters and setters for the message content so that it can never be empty (empty strings are not allowed).
 * Also, write a function that takes a list of messages and prints all messages from a specific sender.
 *
 * *Concepts to use:*
 * - Classes and Objects
 * - Getter and Setter
 * - Functions
 * - Control Flow (for-loop, if-statement)
 *
 */

// COMMENT: Getter and Setter is still not good learned❗ - watch below the code

fun main() {




    // create more messages
    val msg1 = Message("Paul", "Moritz", "Hi Moritz, whats up ?")
    val msg2 = Message("Moritz", "Paul", "Hi Paul, nice to hearing from you. Im good, what about you?")
    val msg3 = Message("Paul", "Moritz", "Thanks Im all good. So, what poppin with your startup?")
    val msg4 = Message("Moritz", "Paul", "You don't will believe it! We got into YC 🟠!")

    // messageList
    var messageList: MutableList<Message> = mutableListOf(msg1, msg2, msg3, msg4)
    messageListFunction(messageList)




    // access

} // main


fun messageListFunction(messageList: MutableList<Message>) {

    // local function
    fun printAllMessagesOf(sender: String) {
        for (i in messageList) {
            if (i.sender == sender) {
                println("From ${i.sender} to ${i.receiver}: ${i.message}")
            } // if
        } // for
    } // fun printAllMessagesOf

    printAllMessagesOf("Moritz")

} // fun messageListFun


class Message(var sender: String, var receiver: String, _message: String = "Default message") {

    var message: String= _message
        set(value) {
            if (value.isEmpty()) {
                throw IllegalArgumentException("Message content cannot be empty!")
            }
            field = value
        }
        get() = field



} // class Message


/**
 * LEARNINGS
 * Function Scope:
 *
 * Difference between functions inside other functions (local) and functions declared outside (top-level)
 *
 * Where you can call each function from
 *
 * Variable and Function Visibility:
 *
 * Variables and functions can only be used where they are visible (inside their scope)
 *
 * Understand what “scope” means in Kotlin
 *
 * Function Parameters and Types:
 *
 * How to correctly define and use function parameters and return types
 *
 * Matching types when adding items to lists or passing arguments
 *
 * Using Classes Properly:
 *
 * How to create objects with all needed properties (e.g., sender, receiver, message)
 *
 * Passing data correctly to constructors
 *
 * Idiomatic Kotlin Basics:
 *
 * When to use val (immutable) vs. var (mutable)
 *
 * Using List vs. MutableList appropriately
 *
 * Using data classes for simple data holders
 *
 * Calling Functions:
 *
 * You can only call a function if it is visible in the current scope
 *
 * Local functions can only be called inside their parent function
 *
 *
 */