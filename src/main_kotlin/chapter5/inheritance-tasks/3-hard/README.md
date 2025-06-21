# 5 hard-lvl Kotlin tasks in area of classes, focusing on advanced class usage, inheritance, encapsulation, abstraction, and internal logic handling:

✅ Task 2: Custom Stack with Max Element Tracking
Description:
Create a class CustomStack<T> with the following methods:

push(element: T)

pop(): T

peek(): T

getMax(): T (Returns the maximum element in the stack)

Requirements:

Must work with Ints and use generics.

Track max in constant time (O(1)) without traversing the stack.

✅ Task 3: Event Scheduler
Description:
Create a class Event with properties: name, startTime, endTime.

Create a class Schedule that manages a list of events.

Requirements:

Add an event only if it does not overlap with existing ones.

Provide a method to list all scheduled events sorted by startTime.

✅ Task 4: Custom Matrix Class
Description:
Implement a class Matrix(rows: Int, cols: Int) with:

Method set(row, col, value)

Method get(row, col)

Method transpose(): Returns a new transposed matrix

Method multiply(other: Matrix): Matrix

Requirements:

Validate matrix multiplication rules.

Do not use external libraries or pre-built matrix operations.

✅ Task 5: Bank System with Transaction History
Description:
Create a BankAccount class with:

Properties: owner, balance, transactionHistory (a list of transaction strings)

Methods:

deposit(amount)

withdraw(amount)

printStatement(): Prints a readable history of all transactions with running balance.

Requirements:

Maintain history with date/time and type (Deposit/Withdraw).

Use encapsulation to ensure balance can’t be directly modified outside the class.