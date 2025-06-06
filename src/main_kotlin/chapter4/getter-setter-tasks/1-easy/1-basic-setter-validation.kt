/*
* Task 1: Basic Setter Validation
* Task:
* Create a class Student with a name (String) and age (Int).
* Ensure that the age cannot be set to a negative number using a custom setter.
*
* */


class Student(var name : String, var age_param: Int) {

    var age = age_param
        set(value) {
            if (value > 0) {
                field = value
            } else {
                println("Age cannot be set to a negative number")
//                field = 0
            }
        }
} // class Student

fun main() {

    var student = Student("Massoud", 18)
    println("${student.name} is ${student.age_param}")

    student.age = -1
    println("Is the student age now negative? -> ${student.age}")

} // fun main