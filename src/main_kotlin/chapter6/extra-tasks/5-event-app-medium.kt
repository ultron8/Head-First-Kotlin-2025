/**
 *
 * 5. Event App (Difficulty: Medium)
 *
 * **Task:**
 * Create a class `Event` with properties for title, date, and number of participants.
 * Implement getters and setters for the number of participants so that it can never be negative.
 * Write a function that takes a list of events and prints a special message for events with more than 100 participants.
 *
 * * Concepts to use:*
 * - Classes and Objects
 * - Getter and Setter
 * - Functions
 * - Control Flow (for-loop, if-statement)
 *
 */


fun main() {

    // obj of vents
//    val ndt = Vents("Nacht der Technik", 20250926)
//    ndt.numParticipants = 3000
//
//    val ltr = Vents("Langer Tag der Regionen", 20250621)
//    ltr.numParticipants = 80

    val ventsList = mutableListOf(
        Vents("Nacht der Technik", 20250926, 3000),
        Vents("Langer Tag der Regionen", 20250621, 80),
        Vents("Cochella", 20250101, 10000),
        Vents("Ballon D'or", 20251218, 200),
        Vents("YC AI Startup School", 20250616, 50),
        Vents("lsvp vibe coding hackathon", 20250613, 15)
    )

//    for (i in ventsList) {
//
//    }

    // specialMessage
    specialMessage(ventsList)



} // main

fun specialMessage(events: MutableList<Vents>) {
    for (i in events) {
        if (i.numParticipants > 100) {
            println("🎉 '${i.title}' has ${i.numParticipants} participants – THIS IS AN AWESOME EVENT! Few places still available!")
        }
    }
}

// class Events
class Vents(var title: String, var date: Int, _numParticipants: Int) {

    var numParticipants: Int = _numParticipants
        set(value) {
            if (value < 0) {
                println("this value cannot be negative!")
//                throw IllegalArgumentException("this value cannot be negative!")
            } else {
                field = value
            } // if
        } // setter
        get() {
            return field
        }


} // class Vents