/*
*
* Task 2: Book Library
* Description: Create a class Book with the properties: title, author, isCheckedOut (Boolean)
* Then create a class Library that manages a list of Book objects with methods:
*
addBook(book: Book)
checkoutBook(title: String)
availableBooks(): List<Book>
*
*
* */


// Iteration 2 - modified the task to my needs
    // I was important for me to insert a list where I can directly access the checked-out and available book-lists
    // to distinguish them!
fun main() {

    // obj's of Book (which are available)
    val book1 = Book("Slow and Fast Thinking", "Daniel Kahnemann", false)
    val book2 = Book("Harry Potter", "JK Rowling", false)
    val book3 = Book("Dataismus", "Yuval Harari", false)
    // checking out some books
    val book4 = Book("Liars Poker", "Michael Lewis", true)
    val book5 = Book("Hooked", "Nir Eyal", true)
    val book6 = Book("Lean Analytics", "Alistair Croll", true)

    // list of 3 books from above
    var booksList = mutableListOf(book1, book2, book3, book4, book5, book6)

    // obj of library with 3 books in the property manageBooks
    var library = Library(booksList)

    // general output of the list of books
    println("The library already has following books: ${booksList}")

    // output checked out list of books
    println("this is the list of checked out books: ${library.checkoutBook()}")

    // output available list of books
    println("this is the list of checked out books: ${library.availableBooks()}")




} // main

class Book(var title: String, var author: String, var isCheckedOut: Boolean) {

    override fun toString(): String {
        return "'$title' by $author${if (isCheckedOut) " (Checked Out)" else ""}\n"
    }

} // class Book

class Library(var manageBooks: MutableList<Book>) {

    // addBook to List
    fun addBook(book: Book){
        manageBooks.add((book))

    } // addBook

    var checkedOutBooks: MutableList<Book> = mutableListOf()
    // check if books are checked-out (so !available)
    fun checkoutBook(): List<Book> {
        for (i in manageBooks) {
            if (i.isCheckedOut == true) {
                checkedOutBooks.add(i)
            } // if
        } // for
        return checkedOutBooks
    } // checkoutBook


    var available: MutableList<Book> = mutableListOf()
    // check if books are !checkedBook's (so available
    fun availableBooks(): List<Book> {
        for (i in manageBooks) {
            if (!i.isCheckedOut) {
                available.add(i)
            }
        }


        return available
    } // availableBooks

} // class Library()




// Iteration 1
//fun main() {
//
//    // create the 3 obj's of Books
//    val book1 = Book("Slow and Fast Thinking", "Daniel Kahnemann", false)
//    val book2 = Book("Harry Potter", "JK Rowling", false)
//    val book3 = Book("Dataismus", "Yuval Harari", false)
//
//
//    // List of this 3 books
//    val someBooksList = mutableListOf(book1, book2, book3)
//
//    // create a libary obj
//    val library = Library(someBooksList)
//    println("The libary list of books are: $library")
//
//    // creat a new book
//    val book4 = Book("Head First: Kotlin", "Dawn & David Griffiths", false)
//
//    // add the book to the libary list
//    library.addBook(book4)
//
//    // print the list to showcase
//    println("The library list of books are: ${library.availableBooks()} the list is added by $book4")
//
//    // create a new book which is checkedOut
//    // new book
//    val book5 = Book("Apple User Guidelines", "Jobs & Wozinak", true)
//    // add the book to the libary list
//    library.addBook(book5)
//
//    println("The library list of books are: ${library.availableBooks()} the list is added by $book5 but it is already checkedOut and should be on the checkedOutList")
//
//
//} // main
//
//
//
//class Book(var title: String, var author: String, var isCheckedOut: Boolean) {
//    override fun toString(): String {
//        return "'$title' by $author${if (isCheckedOut) " (Checked Out)" else ""}"
//    }
//
//} // class Book
//
//class Library(var booksList: MutableList<Book>){
//
//
//    // adding books
//    fun addBook(book: Book) {
//        booksList.add(book)
//    }
//
//    var checkedOutBooks: MutableList<Book> = mutableListOf()
//
//    fun checkoutBook(title: String) {
//        for (i in booksList) {
//            println(i)
//            if (i.isCheckedOut == true) {
//                // entweder neue Liste mit nur isCheckout books generieren
//                // damit im Anschluss die availableBooks angezeigt werden können
//                checkedOutBooks.add(i)
//            }
//        }
//
//    } // checkoutBook
//
//
//    var availableBooks: MutableList<Book> = mutableListOf()
//    //
//    fun availableBooks(): List<Book> {
//        for (i in booksList) {
//            for (j in checkedOutBooks){
//                if (i != j) {
//                    availableBooks.add(i)
//                } // if
//            } // inner
//        } // outer
//
//        return availableBooks
//    } // availableBooks
//
//} // class Book


