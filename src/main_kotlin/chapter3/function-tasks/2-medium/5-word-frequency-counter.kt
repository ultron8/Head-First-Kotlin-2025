// Task 5: Word Frequency Counter
// Description:
// Write a function wordFrequency that takes a list of strings
// and returns a map where the keys are the words and
// the values are the number of times they appear.

fun main(){


    var listStrings = listOf("Ultron", "CR7", "Lamine Yamal", "iPhone", "iPhone", "Lamine Yamal", "Lamine Yamal", "Ultron", "Fidelity", "syly", "syly")

    var listOfWords = wordFrequency(listStrings)
    println(listOfWords)

}

fun wordFrequency(words: List<String>): Map<String, Int> {
    val frequencyMap = mutableMapOf<String, Int>()

    for (word in words) {
        // If the word is already in the map, we increase the frequency
        val currentCount = frequencyMap.get(word)  // gets the current value of the word, or zero
        // f.e. if Lamine Yamal is already in the map, f.e. the value could be -> 1
        // .get(word="Lamine Yamal") -> value: 1


        // if currentCount has a key from the.get() check before then
        // if not then

        if (currentCount != null) {
            // put the key in word into position of the key in the map + increment the value of this key
            frequencyMap.put(word, currentCount + 1)  // Wert um 1 erhöhen
        } else {
            // if key is not in the map
            // then add key to the map and give it the value of 1
            frequencyMap.put(word, 1)
        }
    }

    return frequencyMap
}
