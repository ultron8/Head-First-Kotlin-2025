/**
 *
 * Task 4: Notification System
 * Description:
 * Create a class Notification with a method send().
 * Create subclasses EmailNotification, SMSNotification, and PushNotification, each overriding send() with specific behavior.
 * Write a function that sends all notifications in a list, demonstrating polymorphism
 *
 */


// COMMENT: LLM recommendation: polymorphic function design -> The function should take a list of notifications and call send() on each, not return anything.

//Iteration 2
fun main() {

    val notificationList = mutableListOf(EmailNotification(), SMSNotification(), PushNotification())
    sendAllNotifications(notificationList)


} // main

abstract class Notification() {

    abstract fun send()

} // class Notification

fun sendAllNotifications(notification: List<Notification>) {

    for ( i in notification) {
        i.send()
    }

} // fun sendAllNotifications


class EmailNotification(): Notification() {

    override fun send() {
        println("You got a NEW 📧 email")
    }

} // EmailNotification()


class SMSNotification(): Notification() {

    override fun send() {
        println("You got a NEW 💬 sms")
    }

} // SMSNotification()


class PushNotification(): Notification() {

    override fun send() {
        println("You got a NEW 📲 push-notifi")
    }

} // PushNotification


// Iteration 1
//fun main() {
//
//    val notifiList = mutableListOf(EmailNotification(), SMSNotification(), PushNotification())
//
//    for (i in notifiList) {
//        allNotifi(i)
//    } // for loop
//
//
//} // main
//
//abstract class Notification() {
//
//    abstract fun send()
//
//} // class Notification
//
//fun allNotifi(notification: Notification): MutableList<Unit> {
//
//    var allNotification: MutableList<Unit> = mutableListOf()
//    allNotification.add(notification.send())
//
//    return allNotification
//
//}
//
//
//class EmailNotification(): Notification() {
//
//    override fun send() {
//        println("You got a NEW 📧 email")
//    }
//
//} // EmailNotification()
//
//
//class SMSNotification(): Notification() {
//
//    override fun send() {
//        println("You got a NEW 💬 sms")
//    }
//
//} // SMSNotification()
//
//
//class PushNotification(): Notification() {
//
//    override fun send() {
//        println("You got a NEW 📲 push-notifi")
//    }
//
//} // PushNotification