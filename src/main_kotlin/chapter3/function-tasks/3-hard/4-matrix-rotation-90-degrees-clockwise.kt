/*
* 🔴 Task 4: Matrix Rotation (90 Degrees Clockwise)
* Description:
* Write a function rotateMatrix that rotates an N x N matrix 90 degrees clockwise in place.
*
* */


fun main() {

    var matrix = mutableListOf(
        (mutableListOf(1, 2, 3)),
        (mutableListOf(4, 5, 6)),
        (mutableListOf(7, 8, 9))
    )


//    println(matrix) // print in a row



} // fun main


fun rotateMatrix(matrix: MutableList<MutableList<Int>>) {
    // Your implementation

    // accessing the rotateMatrix function
//    var rotatedMatrix = rotateMatrix(matrix)

    var container1 : Int
    var container2 : Int


    // THE EDGES
    // change 1 holding 3
    container1 = matrix[0][0] // holding 1
    container2 = matrix[0][2] // holding 3
    matrix[0][2] = container1 // 1 to position 3


    // change 3 holding 9
    container1 = matrix[2][2] // holding 9
    matrix[2][2] = container2 // 3 to position 9

    // change 9 holding 7
    container2 = matrix[2][0] // holding 7
    matrix[2][0] = container1

    // change 7
    matrix[0][0] = container2

    // THE CROSS
    // holding 4 and 2 change 4
    container1 = matrix[1][0]
    container2 = matrix[0][1]
    matrix[0][1] = container1

    // change 2 holding 6
    container1 = matrix[1][2]
    matrix[1][2] = container2

    // change 6 holding 8
    container2 = matrix[2][1]
    matrix[2][1] = container1

    // change 8
    matrix[1][0] = container2


    // for loop
    for (i in matrix){
        println(i) // print 3 equally long rows
    }


} // fun rotateMatrix



/*
* Ist noch zu schwer für mich
* C-GPT LÖSUNG
* /******************************************************************************
Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
fun main() {

    val matrix = mutableListOf(
        mutableListOf(1, 2, 3),
        mutableListOf(4, 5, 6),
        mutableListOf(7, 8, 9)
    )

    rotatePositions(matrix, listOf(
        0 to 0, 0 to 2, 2 to 2, 2 to 0 // Ecken
    ))

    rotatePositions(matrix, listOf(
        1 to 0, 0 to 1, 1 to 2, 2 to 1 // Kreuz
    ))

    println(matrix)


} // fun main


fun rotatePositions(
    matrix: MutableList<MutableList<Int>>,
    positions: List<Pair<Int, Int>>
) {
    val temp = matrix[positions[0].first][positions[0].second]
    for (i in 0 until positions.size - 1) {
        val (fromRow, fromCol) = positions[i + 1]
        val (toRow, toCol) = positions[i]
        matrix[toRow][toCol] = matrix[fromRow][fromCol]
    }
    val (lastRow, lastCol) = positions.last()
    matrix[lastRow][lastCol] = temp
}


*
*
* */