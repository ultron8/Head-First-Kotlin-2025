Intermediate Level
1. Grade Point Average Calculation
   Write a function calculateAverage that takes a list of integers (grades) as a parameter and calculates the average. Depending on the average, print a message:

If the average is >= 4.0, print “Passed”.

Otherwise, print “Failed”.

Hint: Use a for-loop and an if-else structure.

----

2. FizzBuzz with Functions
   Write a function fizzBuzz(n: Int) that prints the following for all numbers from 1 to n:

“Fizz” for numbers divisible by 3,

“Buzz” for numbers divisible by 5,

“FizzBuzz” for numbers divisible by both 3 and 5,

Otherwise, print the number itself.

Use a for-loop and if/when.

----

3. Filtering Numbers
   Write a function filterEvenNumbers(numbers: List<Int>): List<Int> that returns all even numbers from a list.
   Use a for-loop and an if-statement.

----

Advanced Level
4. Password Validation
   Write a function isValidPassword(password: String): Boolean that checks if a password meets the following criteria:

At least 8 characters

Contains at least one digit

Contains at least one uppercase letter

Print whether the password is valid or not. Use control structures and at least one helper function.

----

5. Mini Banking System
   Create a function transfer(from: Account, to: Account, amount: Double): Boolean that transfers money from one account to another.
   The class Account has the properties name: String and balance: Double.
   The function should check if there are sufficient funds and perform the transfer accordingly or print an error message.

----

6. Word Count in Texts
   Write a function countWords(text: String): Int that counts the number of words in a given text.
   Additionally, for texts with more than 100 words, print a special message (“Long text detected!”).

----

7. Grading System with when
   Write a function gradeToText(grade: Int): String that converts a grade to a text:

1 -> "Very good"
2 -> "Good"
3 -> "Satisfactory"
4 -> "Sufficient"
5 -> "Poor"

Otherwise -> "Invalid grade"

Use a when-structure.