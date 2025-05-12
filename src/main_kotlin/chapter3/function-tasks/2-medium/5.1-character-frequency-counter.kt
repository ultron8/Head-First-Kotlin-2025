/* NOCHMALS GEMACHT UM ZU SEHEN DAS ICH DIE AUFGABE MIT word-frequency-counter verstanden habe
* 🟣 Neue Aufgabe: Character Frequency Counter (mit Einschränkung)
* Beschreibung:
* Schreibe eine Funktion charFrequency, die einen einzelnen String als Eingabe erhält
* und eine Map (Dictionary) zurückgibt, bei der die Buchstaben (Characters) die Schlüssel
* sind und die Werte die Anzahl ihres Vorkommens im String darstellen.
* Ignoriere Leerzeichen und berücksichtige nur Buchstaben (keine Zahlen oder Sonderzeichen).
* Groß- und Kleinschreibung sollen gleich behandelt werden (z. B. 'A' == 'a').
*
* */


fun main() {

    var letterList = mutableListOf("a", "b", "c", "a", "b", "c", "a", "b", "a", "z", "t", "a", "b", "a", "b", "z", "y")

    var outputMap = charFrequency(letterList)

    println(outputMap)


} // fun main



fun charFrequency(chars: List<String>) : Map<String, Int> {

    // map: letters -> keys: Char, counts -> values: Int
    var frequencyMap = mutableMapOf<String, Int>()

    for (char in chars) {
        // check if the char is already in the map?
        var currentCount = frequencyMap.get(char)

        if (currentCount != null) {
            frequencyMap.put(char, currentCount + 1)
        } else {
            frequencyMap.put(char, 1)
        }

    } // for loop


    return frequencyMap

} // fun charFrequency