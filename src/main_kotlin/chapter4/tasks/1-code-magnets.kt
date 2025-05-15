class DrumKit(var hasTopHat: Boolean, var hasSnares: Boolean) {

    // What a DrumKit can do ?
    fun playTopHat() {
        if (hasTopHat) {
            println("ding ding ba-da-bing")
        } // if
    } // playTopHat

    fun playSnare() {
        if (hasSnares) {
            println("bang bang bang")
        } // if
    } // playSnare


} // class DrumKit


fun main() {

    // create an object of DrumKit
    var d = DrumKit(true, true)


    d.playTopHat()
    d.playSnare()

    d.hasSnares = false

    d.playTopHat()
    d.playSnare()

} // fun main



