fun main() {

    val m = arrayOf(
        Vampyre(),
        Dragon(),
        Monster()
    )

    for (i in m) {
        i.frighten()
    }

}


open class Monster(){

    open fun frighten(): Boolean {
        println("Aargh!")
        return true
    }

}


class Vampyre(): Monster() {

    override fun frighten(): Boolean {
        println("Fancy a bite?")
        return true
    }
}


class Dragon: Monster() {
    override fun frighten(): Boolean {
        println("Fire!")
        return true
    }

}


