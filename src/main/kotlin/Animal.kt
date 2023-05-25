
// Constructor like a parameter
// Kotlin classes are final by default and so they can't be inherited. Open makes them inheritable.
open class Animal(val name: String, val legCount: Int = 4) {
    init {
        println("Hello, my name is $name")
    }
}