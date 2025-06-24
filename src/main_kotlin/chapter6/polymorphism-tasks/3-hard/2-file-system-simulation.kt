/**
 *
 * 🔥 Task 2: File System Simulation
 * Description:
 * Create an abstract class FileSystemItem with subclasses File and Directory.
 * A Directory can contain multiple FileSystemItem objects.
 * Implement methods like getSize(), printStructure(), and search(name: String).
 * Use recursion and polymorphism to handle nested structures.
 *
 */


// COMMENT: Need to fix some points
/**
 * What you did well:
 * You have an abstract class FileSystemItem and subclasses File and Directory.
 *
 * You can add files to a directory.
 *
 * You implemented getSize(), printStructure(), and search().
 *
 * What needs improvement:
 * 1. Directory should store FileSystemItem, not just File
 * Why: To support nested directories (directories within directories), your Directory should store a list of FileSystemItem, not just File.
 *
 * Fix:
 *
 * kotlin
 * var storage: MutableList<FileSystemItem> = mutableListOf()
 * 2. Methods should be polymorphic and recursive
 * Why: Each method should be defined in the base class and overridden in subclasses, so you can call them on any FileSystemItem and recursion works for nested directories.
 *
 * Fix:
 *
 * Define getSize(), printStructure(), and search(name: String) as abstract or open methods in FileSystemItem.
 *
 * Implement them in both File and Directory.
 *
 * In Directory, these methods should recursively call the same method on each item in storage.
 *
 * 3. File class should implement the methods
 * Why: So you can treat files and directories uniformly.
 *
 * 4. The search logic prints "not found" for every non-match
 * Why: This results in multiple "not found" messages if the file isn't present.
 *
 * Fix: Only print "not found" after searching all items and not finding a match.
 *
 */

fun main() {

    // file obj's
    var file1 = File("photo", ".jpg")
    var file2 = File("video", ".mp4")
    var file3 = File("ba-thesis", ".docx")
    var file4 = File("randomGIF", ".gif")
    var file5 = File("the weeknd - timeless", ".mp3")
    var file6 = File("charles aznavour ", ".mp3")

    // list
//    var filesList = mutableListOf(file1, file2, file3, file4, file5, file6)
    var directory = Directory()

    // adding files to the directory
    directory.addFiles(file1)
    directory.addFiles(file2)
    directory.addFiles(file3)
    directory.addFiles(file4)
    directory.addFiles(file5)
    directory.addFiles(file6)

    // size of the directory
    println("The storage size is: ${directory.getSize()} \n")

    // print the structure of the storage
    directory.printStructure()

    // searching the directory
    directory.search("video")


} // main

abstract class FileSystemItem() // super-class FileSystemItem

class File(var fileName: String, var fileFormat: String): FileSystemItem()


class Directory(): FileSystemItem() {

    var storage: MutableList<File> = mutableListOf()

    fun addFiles(file: File) {
        storage.add(file)
    } //

    // getSize()
    fun getSize(): Int {
        return storage.size
    }

    // printStructure()
    fun printStructure() {
        println("\nthe storage:")
        for (i in storage) {
            println("${i.fileName} | ${i.fileFormat} |")
        } // for
        println("\n")


    } // fun printStructure()

    fun search(name: String) {
        println("the SEARCH request: ")
        for (i in storage) {
            if (i.fileName == name) {
                println("✅ Found: ${ i.fileName } - it is in the directory")
            } //
            else {
                println("❌ Sry, there is not such a name: $name in the directory")
            } // if
        } // for loop
        // create a print statement independent from the for loop

    } // fun search




} // class Directory

