/*
* Task 4: Student Grades
* Description: Create a class Studentt with:
* * Properties: name: String, grades: MutableList<Int>
* * Method: addGrade(grade: Int)
* * Method: averageGrade(): Double
*
* Test adding several grades and calculate the average.
*
* */


fun main() {

    // grades
    val dataMining = 1
    val st = 1
    val iUP = 2
    val businessIntelligence = 1

    // create a mutableList of grades
    var gradesList = mutableListOf(dataMining, st, iUP, businessIntelligence)

    // obj of Studentt
    var studentt = Studentt("Paul", gradesList)

    // add another grade
    studentt.addGrade(3)

    // print out the gradesList
    println("This is the list of all grades: ${studentt.grades}")

    // print out the avg grade
    println("This is the avg grade of all grades from the list... ")
    println("${studentt.name}'s GPA is: ${studentt.averageGrade()}")

} // main


class Studentt(var name: String, var grades: MutableList<Int>) {

    // addGrade(grade: Int)
    fun addGrade(_grade: Int) {
        grades.add(_grade)
    } // fun addGrade

    // averageGrade(): Double
    fun averageGrade(): Double {
        var sum = 0.0
        var avg = 0.0
        for (i in grades) {
            var amountOfGrades = grades.size.toDouble()
            sum = sum + i.toDouble()
            avg = sum / amountOfGrades

        } // for loop
        return avg

    } //fun averageGrade
} // class Student