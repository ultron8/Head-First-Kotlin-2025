class Song(val title: String, val artist: String) {

    fun play(){
        println("Playing the song $title by $artist")
    }

    fun stop(){
        println("Stopped playing $title")
    }
} // class Song

fun main(){

    // the Song objects
    val songOne = Song("Cry For Me", "The Weeknd")
    val songTwo = Song("Liberian Girl", "MJ")
    val songThree = Song("Hips don't lie", "Jamin")

    songTwo.play()
    songTwo.stop()
    songThree.play()




} // fun main