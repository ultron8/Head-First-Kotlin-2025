

### 🔥 Task 1: Plugin System with Dynamic Behavior
Description:
Create an abstract class Plugin with a method execute(context: Context): Result.
Subclasses like AuthPlugin, AnalyticsPlugin, and PaymentPlugin should implement their own logic.
Use polymorphism to load and execute different plugins dynamically based on a configuration list.

✅ Extra challenge: Ensure type safety and extensibility using a sealed class or interface hierarchy.

### 🔥 Task 2: File System Simulation
Description:
Create an abstract class FileSystemItem with subclasses File and Directory.
A Directory can contain multiple FileSystemItem objects.
Implement methods like getSize(), printStructure(), and search(name: String).
Use recursion and polymorphism to handle nested structures.

### 🔥 Task 3: Game Character Strategy System
Description:
Create an abstract class Character with properties like name, health, and an abstract method attack(target: Character).
Create classes like Warrior, Mage, and Archer, each with different attack behaviors.
Add support for temporary status effects (e.g., Poisoned, Shielded) using polymorphism or a decorator-style pattern.

✅ Bonus challenge: Implement damage modifiers based on character type.

### 🔥 Task 4: Expression Evaluator
Description:
Design a class hierarchy to represent arithmetic expressions:

Expression (abstract base class)

Constant, Variable, Addition, Multiplication, etc. as subclasses

Implement evaluate(variableValues: Map<String, Double>): Double for all expression types using polymorphism.

✅ Bonus: Add a toString() method that returns the algebraic representation of the expression tree.

### 🔥 Task 5: Event-Driven Simulation System
Description:
Create an abstract class Event with subclasses like LoginEvent, PurchaseEvent, and LogoutEvent.
Create an EventProcessor that processes a list of events.
Use polymorphism to define how each event type affects user state or logs messages.

✅ Bonus: Track event statistics using a polymorphic visitor pattern.