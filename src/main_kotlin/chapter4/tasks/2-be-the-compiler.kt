// A
/*
* Error: there was no object creation in the previous code
* I will add a val t = TapeDeck()
*
* */

// B

/*
*
* Error: there was no method in the class DVDPlayer of playDVD()
* I will add a:
* fun playDVD() {}
*
* */

fun main(){

    // TapeDuck object
    val t = TapeDuck()
    t.hasRecorder = true
    t.playTape()
    t.recordTape()

    // DVDplayer object
    val d = DVDplayer(true)
    d.playDVD()
    d.recordDVD()


} // fun main

class TapeDuck() {
    var hasRecorder = false

    fun playTape() {
        println("Tape playing")
    } // fun playTape()

    fun recordTape() {
        if (hasRecorder) {
            println("Tape recording")
        }
    } // fun recordTape()

} // fun main


class DVDplayer(var hasRecorder: Boolean) {

    fun playDVD() {
        println("DVD playing")
    }

    fun recordDVD(){
        if (hasRecorder) {
            println("DVD recording")
        }
    }

}