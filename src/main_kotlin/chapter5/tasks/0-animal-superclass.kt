///*
//*
//* */
//
//fun main() {
//
//    val animals = arrayOf (
//        Hippo(),
//        Wolf()
//
//    ) // animal
//
//    for (i in animals) {
//        i.roam()
//        i.eat()
//    } // for loop
//
//    val vet = Vet()
//    val wolf = Wolf()
//    val hippo = Hippo()
//
//    vet.giveShot(wolf)
//    vet.giveShot(hippo)
//
//} // main
//
////enum class Image {
////
////}
////
////enum class Food {
////    MEAT,
////    GRASS
////}
////
////enum class Habitat{
////    WOODLAND, // FORESTS
////    SAVANNAH,
////    WATER
////}
//
//// superclass
//open class Animal() {
//    open val image = ""
//    open val food = ""
//    open val habitat = ""
//    var hunger: Int = 10
//
//
//    // animal make a noise
//    open fun makeNoise() {
//        println("The Animal is making a noise")
//    }
//
//    // eating
//    open fun eat(){
//        println("The Animal is eating")
//    }
//
//    // when its not eating or sleeping
//    open fun roam() {
//        println("The Animal is roaming")
////        if (eat() == false || sleep() == false) {
////            //
////        } // if
//    } // fun roam()
//
//    // take a nap
//    fun sleep() {
//        println("The Animal is sleeping")
//    } // fun sleep()
//
//    // just to use the final prefix
//    open fun test(){}
//
//} // class Animal()
//
//
//// Animal Sub-Classes - Races
//
//// wolf & fox
//open class Canine(): Animal(){
//
//    override fun roam() {
//        println("The Canine is roaming")
//    } // fun roam()
//
//    // this prevents sub-classes of the Canine() class from overriding
//    final override fun test(){}
//}
//
//// Lion, cheetah & lynx
//open class Feline(): Animal(){
//
//}
//
//
//
//
//
//// RACES Sub-Classes
//
//class Hippo(): Animal() {
//
//    override val image = "hippo.jpg"
//    override val food = "grass"
//    override val habitat = "water"
//
//    override fun makeNoise() {
//        println("Grunt")
//    }
//
//    override fun eat() {
//        super.eat() // Output: The Animal is eating
//    }
//}// class Hippo
//
//
//// SPECIFIC ANIMALS Sub-Classes
//class Lion(): Feline() {
//
//    override fun makeNoise() {
//        println("Roar")
//    }
//
//    override fun eat(){
//
//    }
//
//} // class Lion
//
//
//class Lynx(): Feline() {
//
//} // class Lynx
//
//class Fox(): Canine() {
//
//} // class Fox
//
//class Wolf(): Canine() {
//
//    override val image = "wolf.jpg"
//    override val food = "meat"
//    override val habitat = "forests"
//
//    override fun makeNoise() {
//        println("Howl")
//    }
//
//    override fun eat() {
//        println("The Wolf is eating $food")
//    }
//
//} // class Wolf
//
//class Cheetah(): Feline() {
//
//} // class Cheetah
//
//class Vet() {
//
//    // injection
//    fun giveShot(animal: Animal) {
//        // code to do something medical
//        animal.makeNoise()
//    }
//
//} // class Vet()