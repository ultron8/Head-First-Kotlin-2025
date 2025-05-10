// Write a function greet that takes a name as a parameter and prints:
//Hello, <name>!

fun main(){

    println("What is your name?\n")
    var someName = readLine()
    var nameString = someName.toString()

    var greet = greeting(nameString)
    println(greet)
}

fun greeting(name_param: String): String {

    return "Hello, $name_param"
}