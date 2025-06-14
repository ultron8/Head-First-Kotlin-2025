/*
* Task 1: Lazy Initialization with Conditional Setter
* Goal: Create a class Configuration with a property settings: Map<String, String>?.
* The getter should initialize the map only once when accessed (simulate lazy behavior).
* The setter should prevent overwriting the map if it's already initialized.
*   Example: If settings is accessed before being set, it initializes with default values. Once set explicitly, further attempts to overwrite it should be ignored.
* */

// COMMMENT: still to hard to do by my own

class Configuration(){

    // Private backing field to store the settings map
        // cause the default backing field could not initialized with map
    private var _settings: Map<String, String>? = null

    // Public property with custom getter and setter
    var settings: Map<String, String>?
        get() {
            // If not initialized, initialize with default values
            if (_settings == null) {
                _settings = mapOf("defaultKey" to "defaultValue")
            }
            return _settings
        } // getter
        set(value) {
            // Only allow setting if not already initialized
            if (_settings == null && value != null) {
                _settings = value
            } // if
            // Ignore further attempts to overwrite
        } // setter

} // class Configuration

fun main() {

    val config = Configuration()

    // test 1 - accessing the property to get the default key and value
    var test1 = config.settings
    println(test1) // Output: {defaultKey=defaultValue}


    // test 2&3 should be ignored in as output in the console
    // test 2 - accessing the property to get the first setting
    config.settings = mapOf("Ultron" to "Jarvis",
                            "Saitama" to "",
                            "Bruce Lee" to "Jackie Chan")
    var test2 = config.settings
    println(test2) // Output: {defaultKey=defaultValue} unchanged

    // test 3 - accessing the property to see if the values changing
    config.settings = mapOf("VC" to "PE",
                            "Angel" to "",
                            "Hedge Fund" to "Public Market Bets")
    var test3 = config.settings
    println(test3) // Output: {defaultKey=defaultValue} unchanged


} // main