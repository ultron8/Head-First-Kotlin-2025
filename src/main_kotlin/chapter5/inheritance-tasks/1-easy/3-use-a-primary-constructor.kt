/*
* Task 3: Use a Primary Constructor
* Goal: Create a class Book with properties: title, author, and pages.
* Requirement: Initialize all properties using a primary constructor. Print the book information.
*
*
* */

fun main() {

    // obj of SomeBook
    var someBook = SomeBook("'Fast and Slow Thinking'", "'Daniel Kahnemann'", 356)

    println("The title of the book is: ${someBook.title}, the author is: ${someBook.author}, and you need to read: ${someBook.pages}")

} // main


class SomeBook(var title: String, var author: String, var pages: Int)