class DrumKit(var hasTopHat: Boolean, var hasSnares: Boolean) {

    // initializing before using variables
    var volume : Int

    init {
        volume = 10
    }

    // late initialization - tells the compiler that we handle it later
    lateinit var playlist : MutableList<String>


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

    println("How high is the volume: ${d.volume}")

} // fun main



