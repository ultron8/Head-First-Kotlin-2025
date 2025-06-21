/*
* Task 3: Event Scheduler
* Description: Create a class Event with properties: name, startTime, endTime.
* Create a class Schedule that manages a list of events.
* Requirements:
    * Add an event only if it does not overlap with existing ones.
    * Provide a method to list all scheduled events sorted by startTime.
*
*
* */

// COMMENT: Had a bit of trouble creating the logic in addEvent(). The LLMs helped me to handle the logic and also to create a code that fits my programming understanding

fun main() {
    // obj Event's

    var event1 = Event("Nacht der Technik", 17, 18)
    var event2 = Event("YC AI Startup School", 11, 12)
    var event3 = Event("LSVP Vibe Coding Hackathon", 8, 10)
    var event4 = Event("Cochella", 13, 16)
    var event5 = Event("Abi-Ball", 19, 20)
    var event6 = Event("Tech Europe KIT", 20, 23)

    // List of Events
//    var eventsFavList = mutableListOf(event1, event2, event3)
    var schedule = Schedule()
    var eventsFavList = Schedule()
    // adding events to list
    eventsFavList.addEvent(event1)
    eventsFavList.addEvent(event2)
    eventsFavList.addEvent(event3)
    eventsFavList.addEvent(event4)
    eventsFavList.addEvent(event5)


    println("These are our events that we provide: \n ${eventsFavList.eventsList}")

    // printing the sorted eventsFavList
    eventsFavList.sortEvents()


} // main

class Event(var name: String, var startTime: Int, var endTime: Int) {


    override fun toString(): String {
        return " '$name'\t -> start at $startTime and ends at $endTime,\n"
    }



} // class Event()


class Schedule() {

    // toString
    override fun toString(): String {
        var result = ""
        for (event in eventsList) {
            result += event.toString()
        }
        return result
    }

    // manages a list of events
    var eventsList: MutableList<Event> = mutableListOf()

    // addEvents to the list above
    fun addEvent(newEvent: Event) {

        var canAdd = true

        // add event if eventsList is empty
        for (i in eventsList) {
                if (i.startTime < newEvent.endTime && newEvent.endTime > i.startTime) {
                    println("❌CONFLICT: '${newEvent.name}' overlaps with '${i.name}'")
                    canAdd = false
                    break // Stop checking, conflict found
                } // inner if
            } // for


        if (canAdd) {
            eventsList.add(newEvent)
        } // if

    } // fun addEvents




    // events is a list of events
    fun sortEvents(){
        val sorted = eventsList.sortedBy { it.startTime }
        println("Scheduled events (sorted): ")
        for (i in sorted) {
            println(i)
        }

    } //

} // class Event()