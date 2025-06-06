/*
* Task 2:
* Dynamic Full Name Goal: Create a Person class with firstName and lastName properties.
* Add a read-only fullName property using a custom getter that combines both names.
*
* */

fun main() {

    val person = Person("Anton", "Osika")
    println("This is his full name: ${person.fullName}")

//    test
    person.firstName = "Anna"
    person.lastName = "Molatidi"
    println("This is her full name: ${person.fullName}")



} // fun main()


class Person(var firstName: String, var lastName: String) {

    val fullName : String
        get() {
            return "$firstName $lastName"
        } // getter

} // class Person