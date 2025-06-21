/*
* Task 1: Library System with Book Borrowing Limits
* Description: Create a system with the following classes:
    * Book: title, author, isAvailable (Boolean)
    * User: name, borrowedBooks (list of Book)
    * Library: contains a list of books and methods to borrow and return books.

* * Requirements:
    * Users can only borrow 3 books at once.
    * When borrowing, only available books should be lent.
    * When returning, the book should be marked as available again.
*
* */

// extras:
    // add a counter next to the edition of the series in the book list


// LLM recommendations
// c-gpt
/*
* // Book class
class Book(val title: String, val author: String, var isAvailable: Boolean = true) {

    override fun toString(): String {
        return "'$title' by $author"
    }
}

// User class
class User(val name: String) {
    val borrowedBooks = mutableListOf<Book>()

    fun canBorrow(): Boolean {
        return borrowedBooks.size < 3
    }

    fun borrowBook(book: Book) {
        borrowedBooks.add(book)
    }

    fun returnBook(book: Book) {
        borrowedBooks.remove(book)
    }
}

// Library class
class Library(private val books: MutableList<Book>) {

    fun borrowBook(user: User, title: String) {
        val book = books.find { it.title == title && it.isAvailable }

        if (book == null) {
            println("❌ Book '$title' is not available.")
            return
        }

        if (!user.canBorrow()) {
            println("❌ ${user.name} cannot borrow more than 3 books.")
            return
        }

        book.isAvailable = false
        user.borrowBook(book)
        println("✅ ${user.name} borrowed ${book.title}")
    }

    fun returnBook(user: User, title: String) {
        val book = user.borrowedBooks.find { it.title == title }

        if (book == null) {
            println("❌ ${user.name} hasn't borrowed '$title'")
            return
        }

        book.isAvailable = true
        user.returnBook(book)
        println("🔁 ${user.name} returned ${book.title}")
    }

    fun listAvailableBooks() {
        println("\n📚 Available Books:")
        books.filter { it.isAvailable }.forEach {
            println("- $it")
        }
    }
}
fun main() {
    // Library books
    val books = mutableListOf(
        Book("1984", "George Orwell"),
        Book("Brave New World", "Aldous Huxley"),
        Book("Fahrenheit 451", "Ray Bradbury"),
        Book("The Hobbit", "J.R.R. Tolkien"),
        Book("To Kill a Mockingbird", "Harper Lee")
    )

    val library = Library(books)
    val alice = User("Alice")

    library.listAvailableBooks()

    // Borrow 3 books
    library.borrowBook(alice, "1984")
    library.borrowBook(alice, "The Hobbit")
    library.borrowBook(alice, "Fahrenheit 451")

    // Attempt to borrow a 4th book
    library.borrowBook(alice, "Brave New World")

    // Return a book
    library.returnBook(alice, "1984")

    // Borrow again after returning
    library.borrowBook(alice, "Brave New World")

    library.listAvailableBooks()
}

*
* */
// perplexity - how to structure my code
/*
* fun main() {
    // Create some books
    val book1 = Book("Slow and Fast Thinking", "Daniel Kahnemann", true)
    val book2 = Book("Harry Potter", "JK Rowling", true)
    val book3 = Book("Dataismus", "Yuval Harari", true)
    val book4 = Book("Liars Poker", "Michael Lewis", true)
    val book5 = Book("Hooked", "Nir Eyal", false)
    val book6 = Book("Lean Analytics", "Alistair Croll", false)

    // List of books in the library
    val someBooksList = mutableListOf(book1, book2, book3, book4, book5, book6)
    val paulsBookList: MutableList<Book> = mutableListOf()

    // Create user and library
    val user1 = User("Paul", paulsBookList)
    val library = Library(someBooksList)

    // Borrowing books
    library.borrowBook(user1, book1)
    library.borrowBook(user1, book2)
    library.borrowBook(user1, book3)
    library.borrowBook(user1, book4) // Should fail (limit reached)

    // Return a book
    library.returnBook(user1, book3)

    // Show Paul's borrowed books
    println("This is the list of checked out books of Paul:\n${user1.borrowedBooks}")

    // Try borrowing a book that is not available
    library.borrowBook(user1, book5)
}

class Book(var title: String, var author: String, var isAvailable: Boolean) {
    override fun toString(): String {
        return "'$title' by $author${if (isAvailable) " (Is available)" else " (Checked Out)"}\n"
    }
}

class User(var name: String, var borrowedBooks: MutableList<Book>)

class Library(var booksList: MutableList<Book>) {

    fun borrowBook(user: User, book: Book) {
        if (user.borrowedBooks.size >= 3) {
            println("\n❌ ${user.name} tries to borrow '${book.title}' but has reached the maximum number of borrowed books!")
            println("🔙 Return one of the books to borrow a new one. Your books list:\n${user.borrowedBooks}")
            return
        }

        var found = false
        var success = false
        for (i in booksList) {
            if (i == book) {
                found = true
                if (i.isAvailable) {
                    i.isAvailable = false
                    user.borrowedBooks.add(i)
                    println("✅ ${user.name} borrowed '${i.title}'")
                    success = true
                }
                break // Stop after finding the book
            }
        }
        if (!found) {
            println("\n'${book.title}' is not in the library.")
        } else if (!success) {
            println("\n'${book.title}' is not available ❌ - Availability is: ${book.isAvailable}")
        }
    }

    fun returnBook(user: User, book: Book) {
        var removed = false
        for (i in user.borrowedBooks) {
            if (i == book) {
                user.borrowedBooks.remove(i)
                book.isAvailable = true
                println("🔄 ${user.name} returned '${book.title}'")
                removed = true
                break
            }
        }
        if (!removed) {
            println("⚠️ ${user.name} does not have '${book.title}' to return.")
        }
    }
}

*
* */

// what I need to improve
/*
* /*
Requirement                           | Your Code              | Needs Fix? | Suggestion                                DONE
--------------------------------------|------------------------|------------|-----------------------------------------------
Book class                            | Present                | No         | Good                                     |
User class                            | Present                | No         | Good                                     |
Library class                         | Present                | No         | Good                                     |
Borrowing limit                       | Checked                | No         | Good                                     |
Only available books can be lent      | Checked, but noisy     | Yes        | Print message once, after checking       |
Book marked available on return       | Not implemented        | Yes        | Set isAvailable = true on return         | ☑️
*/

* */

/*
* /*
Concept                      | Why It’s Needed
-----------------------------|-----------------------------------------------
Classes & Objects            | Model books, users, and the library
Properties                   | Store data for each entity
Methods                      | Actions like borrowing and returning books
Constructors                 | Initialize objects
Collections (Lists)          | Store books and borrowed books
Control Flow (if, loops)     | Enforce rules and search lists
Boolean Logic                | Check conditions
Encapsulation                | Organize code and data
Return Values                | Communicate results of actions
Object Comparison            | Find and match books
Printing/Output              | Show results and messages
Error Handling (optional)    | Handle invalid actions gracefully
*/

*
* */

// Iteration 2
fun main() {

    // obj of Book - some books
    val book1 = Book("Slow and Fast Thinking", "Daniel Kahnemann", true)
    val book2 = Book("Harry Potter", "JK Rowling", true)
    val book3 = Book("Dataismus", "Yuval Harari", true)
    // checking out some books
    val book4 = Book("Liars Poker", "Michael Lewis", true)
    val book5 = Book("Hooked", "Nir Eyal", false)
    val book6 = Book("Lean Analytics", "Alistair Croll", false)

    // a list of books
    var someBooksList = mutableListOf(book1, book2, book3, book4, book5, book6)
    var paulsBookList: MutableList<Book> = mutableListOf()

    // obj of user
    var user1 = User("Paul", paulsBookList)

    // obj of library
    var library = Library(someBooksList)

    // tests
    // Try borrowing and returning books.
        //Make sure users can’t borrow more than 3 books at once.
    // borrow a fourth book
    var firstBorrowedBook = library.borrowBook(user1, book1)
    var secondBorrowedBook = library.borrowBook(user1, book2)
    var thirdBorrowedBook = library.borrowBook(user1, book3)

//    println("Paul borrows his thirdBook: $thirdBook")
    var fourthBorrowedBook = library.borrowBook(user1, book4) // bekomme zwei outputs, das ist nicht richtig wegem dem for loop


    // remove a book from the list
        // remove book3
    library.returnBook(user1, book3)
    // check the borrowed list of Paul
    println("This is the list of checked out books of Paul: \n ${user1.borrowedBooks}")



    // Make sure only available books can be borrowed
        // add a not-available book to the list
        // its working but there is not output that showcase that
    var fifthBorrowedBook = library.borrowBook(user1, book5)


} // main

class Book(var title: String, var author: String, var isAvailable: Boolean){

    override fun toString(): String {
        return "'$title' by $author${if (isAvailable) " (Is available)" else " (Checked Out)"}\n"
    }


} // class Book

class User(var name: String, var borrowedBooks: MutableList<Book>) {



} // class User

class Library(var booksList: MutableList<Book>) {

    // borrowBook
    fun borrowBook(user: User,_book: Book) {
        // Check if the user has borrowed less than 3 books
        if (user.borrowedBooks.size < 3) {
            // Find the book in the library
            for (i in booksList) {
                // if i equal the book input & i isAvailable then...
                if (i == _book && i.isAvailable) {
                    i.isAvailable = false
                    user.borrowedBooks.add(i) // Add to user's borrowed list
                    println("✅ ${user.name} borrowed '${i.title}'")
                } // if
                if (i == _book && !i.isAvailable) {
                    println("\n'${_book.title}' is not available ❌ - Availability is: ${_book.isAvailable}")
                }
            } // for loop
        } else {
                    println("\n❌ ${user.name} tries to borrow '${_book.title} but has reached its maximum number of borrowed books!'")
                    println("🔙 Return one of the books to borrow a new one. Your books list: \n ${user.borrowedBooks}")
        }// if
    } // fun borrowBook

    // returnBooks
    fun returnBook(user: User, _book: Book) {
        _book.isAvailable = true
        user.borrowedBooks.remove(_book)

    } // fun returnBook


} // class Library


/* for Iteration 2:
* LLM helped with this:
* Step 1: Make the Book Class
Think: What does a book need? (title, author, is it available?)

Step 2: Make the User Class
Think: What does a user need? (name, a list of books they borrowed)

Step 3: Make the Library Class
Think: What does a library need? (a list of all books)

What should the library be able to do? (let users borrow and return books)

Step 4: Borrowing a Book
When a user wants to borrow a book:

Check if the user has less than 3 books.

Check if the book is available.

If both are true, let them borrow it (mark the book as not available, add it to the user’s borrowed list).

Step 5: Returning a Book
When a user returns a book:

Mark the book as available again.

Remove it from the user’s borrowed list.

Step 6: Test Everything
Try borrowing and returning books.

Make sure users can’t borrow more than 3 books at once.

Make sure only available books can be borrowed.

In short:
Make three classes (Book, User, Library), check the rules before borrowing/returning, and test your system!
* */



// Iteration 1
//fun main() {
//
//    // some books
//    val book1 = Book("Slow and Fast Thinking", "Daniel Kahnemann", true)
//    val book2 = Book("Harry Potter", "JK Rowling", true)
//    val book3 = Book("Dataismus", "Yuval Harari", true)
//    val book4 = Book("Liars Poker", "Michael Lewis", true)
//
//    var paulsBooksList: MutableList<Book> = mutableListOf(book1, book2, book3)
//
//    // list of books in the library
//    var library = Library(paulsBooksList)
//
//    // how to store the user's name and their borrowed books. f.e.
//    val user1 = User("Paul", paulsBooksList)
//    println("This is ${user1.name} books list: ${user1._borrowedBooks}")
//
//    // adding a fourth book into the list
//    user1._borrowedBooks.add(book4)
//    println("This is ${user1.name} books list: ${user1._borrowedBooks}")
//
//
//} // main
//
//// class Book
//class Book(var title: String, var author: String, var isAvailable: Boolean) {
//
////    override fun toString(): String {
////        return super.toString() // add the properties
////    }
//
//    override fun toString(): String {
//        return "'$title' by $author${if (isAvailable) " (Is available)" else ""}\n"
//    }
//
//    // Consider how you’ll represent whether a book is available or not
//    fun available(){
//        if (isAvailable == true) {
//            println("✅ ${title} is available") // NEED TO ADD HERE SOMETHING
//        } else {
//            println("❌ ${title} is not available. You need to wait.") // NEED TO ADD HERE SOMETHING
//        } // if
//    } // fun available()
//
//} // Book
//
//class User(var name: String, var _borrowedBooks: MutableList<Book>) {
//
//    // how you’ll add a book to the user’s borrowed list and check if they’ve reached their borrowing limit.
//    // setter borrowedBooks
//    var borrowedBooks: MutableList<Book> = _borrowedBooks
//        set(value) {
//            if (borrowedBooks.isNotEmpty()) {
//                for ( i in borrowedBooks) {
//                    i.isAvailable = true // checking them out by default
//                } // for
//            } // if
//            if (borrowedBooks.size > 3) {
//                println("Each user can borrow a maximum of 3 books.")
//            } else if (borrowedBooks.size > 2) {
//                println("You can borrow 1 more book.")
//            } else {
//                println("You can borrow 2 more books.")
//            }
//        } // setter
//
//
//} // Book
//
//class Library(var booksList: MutableList<Book>) {
//
//
//    // borrowing books
//        // When borrowing, only available books should be lent.
//            // In your borrow method, make sure to check if the user already has three books before allowing another borrow.
//
//
//
//    // returning books
//        // When returning, the book should be marked as available again.
//
//    // Decide how the library will interact with both books and users
//
//
//
//} // Book