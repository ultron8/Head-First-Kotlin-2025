import kotlin.time.Duration

/**
 *
 * 6. Music App (like Spotify) (Difficulty: Hard)
 *
 * **Task:**
 * Create a class `Track` with properties for title, artist, and duration (in seconds).
 * Define a superclass `PlaylistItem` and let `Track` inherit from it.
 * Write a function that takes a list of `PlaylistItem` objects and prints a special message for tracks longer than 300 seconds (“Long Track”). Use when or if-statements.
 *
 * *Concepts to use:*
 * - Classes and Objects
 * - Subclasses and Superclasses (Inheritance)
 * - Functions
 * - Control Flow (for-loop, when/if)
 *
 */


fun main() {

    // obj
    val playlist: List<PlaylistItem> = listOf(
        Track("Call out my name", "the weeknd", 301),
        Track("Slow Down","Leon Thomas", 314),
        Track("Smoke + Mirrors","Leo Waters", 248),
        Track("Drive Me Crazy", "Myles Lloyd", 242)
    )

    printLongTracks(playlist)



} // main


fun printLongTracks(playlistItems: List<PlaylistItem>) {

    for (i in playlistItems) {
        if (i is Track) { // this logic was a learnable experience
            if (i.duration > 300) {
                println("LONG:\t${i.title} by ${i.artist} is a Long Track (${i.duration}) seconds")
            } // if
            else {
                println("    \t${i.title} by ${i.artist} has (${i.duration}) seconds")
            }
        }
    } // for loop


//    when (playlistItem) {
//        >300 -> println(“Long Track”)
//        else {
//            println("sikerim senin")
//        }
//    }

} // fun specialMessage

open class PlaylistItem()

class Track(var title: String,
            var artist: String,
            var duration: Int // in seconds
): PlaylistItem() {



} // class Tracker

