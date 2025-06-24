/**
 * 🔥 Task 1: Plugin System with Dynamic Behavior
 * Description:
 * Create an abstract class Plugin with a method execute(context: Context): Result.
 * Subclasses like AuthPlugin, AnalyticsPlugin, and PaymentPlugin should implement their own logic.
 * Use polymorphism to load and execute different plugins dynamically based on a configuration list.
 *
 * ✅ Extra challenge: Ensure type safety and extensibility using a sealed class or interface hierarchy.
 *
 * Extra hints:
 * AuthPlugin: Validate user credentials, update authentication status, or generate tokens.
 * AnalyticsPlugin: Collect event data, enrich it, and send it to analytics backend.
 * PaymentPlugin: Process payment transactions, validate payment info, or handle refunds.
 *
 * Return a Result indicating success, failure, or data:
 * The Result type should encapsulate the outcome of the execution, such as success status, error messages, or processed data.
 *
 */


/**
 * LLM recommendation:
 * Your code shows a good understanding of **abstraction**, **inheritance**, and **polymorphism**. You have an abstract base class, concrete subclasses, and you call `execute` on each plugin in a loop. However, to fully solve the task and make your plugin system robust and extensible, you are missing a few important programming concepts and details:
 *
 * ---
 *
 * ## **1. Context and Result Types**
 *
 * - **Missing:** You reference `Context` and `Result` in your method signatures, but you haven't defined what these are.
 * - **To Add:**
 *   - Define a `Context` class or interface that can carry data needed for plugins.
 *   - Define a `Result` class or interface to represent the outcome of plugin execution (success, failure, messages, etc.).
 *
 * ---
 *
 * ## **2. Implementing Return Values**
 *
 * - **Missing:** Your `execute` methods only print messages and do not return a `Result` as required by the abstract method signature.
 * - **To Add:**
 *   - Each `execute` method should return a `Result` object, not just print a message.
 *
 * ---
 *
 * ## **3. Using the Context Parameter**
 *
 * - **Missing:** You do not pass or use an actual `Context` object when calling `execute`.
 * - **To Add:**
 *   - Create and pass appropriate `Context` objects to each plugin, containing the data they need.
 *
 * ---
 *
 * ## **4. Type Safety and Extensibility (Extra Challenge)**
 *
 * - **Missing:** The task suggests using a **sealed class** or **interface hierarchy** for extra type safety and extensibility.
 * - **To Add:**
 *   - Consider making `Plugin` a `sealed class` or `sealed interface` for compile-time exhaustiveness and future extensibility.
 *
 * ---
 *
 * ## **5. Dynamic Loading Based on Configuration**
 *
 * - **Missing:** The task asks for dynamic loading of plugins based on a configuration list.
 * - **To Add:**
 *   - Simulate or implement loading plugin types from a configuration (e.g., a list of plugin names or IDs) and instantiate only those plugins.
 *
 * ---
 *
 * ## **Summary Table**
 *
 * | Concept/Requirement                  | Present in Code? | What to Add or Fix                                      |
 * |--------------------------------------|------------------|---------------------------------------------------------|
 * | Abstraction & Inheritance            | ✅               | Good                                                    |
 * | Polymorphism                         | ✅               | Good                                                    |
 * | Context class                        | ❌               | Define and use a `Context` class                        |
 * | Result class                         | ❌               | Define and return a `Result` from `execute`             |
 * | Use of context in execute            | ❌               | Pass and use context data in each plugin                |
 * | Sealed class/interface for Plugin    | ❌ (optional)    | Use sealed class/interface for type safety (extra)      |
 * | Dynamic loading from config          | ❌               | Instantiate plugins based on a configuration list       |
 *
 * ---
 *
 * ## **Example of What’s Missing**
 *
 * ```kotlin
 * // Define Result and Context
 * sealed class Result {
 *     data class Success(val message: String): Result()
 *     data class Failure(val error: String): Result()
 * }
 *
 * data class Context(val data: Map)
 *
 * // Use context and return Result in each plugin
 * class AuthPlugin: Plugin() {
 *     override fun execute(context: Context): Result {
 *         // Use context.data here
 *         return Result.Success("Auth executed")
 *     }
 * }
 * ```
 *
 * ---
 *
 * **In summary:**
 * You need to define and use `Context` and `Result`, actually pass context data, return results, and (optionally) use a sealed class/interface for Plugin and dynamic loading for a complete, extensible, and type-safe plugin system.
 */


/**
 * LLM solved the task
 * // Define the Result type for plugin execution outcomes
 * sealed interface Result {
 *     data class Success(val message: String) : Result
 *     data class Failure(val error: String) : Result
 * }
 *
 * // Define a flexible context for plugins
 * data class Context(val data: Map<String, Any>)
 *
 * // Sealed interface for plugins ensures all implementations are known at compile time
 * sealed interface Plugin {
 *     fun execute(context: Context): Result
 * }
 *
 * // AuthPlugin implementation
 * class AuthPlugin : Plugin {
 *     override fun execute(context: Context): Result {
 *         val username = context.data["username"] as? String ?: return Result.Failure("Username missing")
 *         val password = context.data["password"] as? String ?: return Result.Failure("Password missing")
 *         return if (username == "admin" && password == "secret") {
 *             Result.Success("Authentication successful")
 *         } else {
 *             Result.Failure("Authentication failed")
 *         }
 *     }
 * }
 *
 * // AnalyticsPlugin implementation
 * class AnalyticsPlugin : Plugin {
 *     override fun execute(context: Context): Result {
 *         val event = context.data["event"] as? String ?: return Result.Failure("Event missing")
 *         // Simulate event tracking
 *         return Result.Success("Analytics event '$event' tracked")
 *     }
 * }
 *
 * // PaymentPlugin implementation
 * class PaymentPlugin : Plugin {
 *     override fun execute(context: Context): Result {
 *         val amount = context.data["amount"] as? Double ?: return Result.Failure("Amount missing")
 *         return if (amount > 0) {
 *             Result.Success("Payment of $$amount processed")
 *         } else {
 *             Result.Failure("Invalid payment amount")
 *         }
 *     }
 * }
 *
 * // Example of loading plugins dynamically based on configuration
 * fun main() {
 *     // Simulate a configuration list (could be loaded from a file or elsewhere)
 *     val config = listOf("auth", "analytics", "payment")
 *
 *     // Plugin registry/factory
 *     val pluginRegistry: Map<String, Plugin> = mapOf(
 *         "auth" to AuthPlugin(),
 *         "analytics" to AnalyticsPlugin(),
 *         "payment" to PaymentPlugin()
 *     )
 *
 *     // Dynamically load plugins based on config
 *     val pluginsToRun = config.mapNotNull { pluginRegistry[it] }
 *
 *     // Example context for each plugin
 *     val contexts = listOf(
 *         Context(mapOf("username" to "admin", "password" to "secret")),
 *         Context(mapOf("event" to "user_signup")),
 *         Context(mapOf("amount" to 99.99))
 *     )
 *
 *     // Execute plugins polymorphically
 *     for ((plugin, ctx) in pluginsToRun.zip(contexts)) {
 *         val result = plugin.execute(ctx)
 *         println(result)
 *     }
 * }
 *
 */

// Iteration 1
//fun main() {
//
//    var list = mutableListOf(AuthPlugin(), AnalyticsPlugin(), PaymentPlugin())
//
//    for (i in list) {
//        i.execute(/*some context variable*/)
//    }
//
//} // main
//
//
//abstract class Plugin() {
//
//    abstract fun execute(context: Context): Result
//
//} // abstract class Plugin
//
//
//class AuthPlugin(): Plugin() {
//
//    override fun execute(context: Context): Result {
//        println("Auth is implemented")
//    }
//
//} // class AuthPlugin()
//
//class AnalyticsPlugin(): Plugin() {
//
//    override fun execute(context: Context): Result {
//        println("Analytics is implemented")
//    }
//
//}  // class AnalyticsPlugin()
//
//class PaymentPlugin(): Plugin() {
//
//    override fun execute(context: Context): Result {
//        println("Payment gateway is implemented")
//    }
//
//}  // class PaymentPlugin()


