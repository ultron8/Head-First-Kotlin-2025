// Task 3: Find Common Elements
// Description:
// Write a function findCommonElements that takes two lists
// of integers and returns a list of elements found in both.

fun main(){

    // two lists of integers
    var list1 = mutableListOf(1, 2, 3, 6, 7, 9)
    var list2 = mutableListOf(5, 2, 7, 6, 10, 11)

    var takeLists = findCommonElements(list1, list2)
    println(takeLists)


}

fun findCommonElements(x_param: MutableList<Int>, y_param: MutableList<Int>):  MutableList<Int>{

    var commonElementsList : MutableList<Int> = mutableListOf()
    var counter = 0

    for (outer in x_param) {
        for (inner in y_param) {
            if (outer == inner) {
                var y = inner
                counter++
                commonElementsList.add(y)

            } // if
        } // inner for loop
    } // outer for loop

    return commonElementsList
} // fun findCommonElements
