import java.io.File

fun main() {

}


// first hierarchy
open class Click()
class Clack(): Click()

// second hierarchy
abstract class Top()
class Tip(): Top()

// third hierarchy
abstract class Alpha()
abstract class Omega(): Alpha()

// forth hierarchy
interface Foo{}
open class Bar(): Foo
class Baz(): Bar()

// fifth hierarchy
interface Fi{}
interface Fee{}
open class Fo(): Fi
class Fum(): Fo(), Fee


