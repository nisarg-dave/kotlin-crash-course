abstract class Vehicle(val name: String) {
    init {
        println("Vehicle name $name")
    }

    // Don't give implementation
    abstract fun makeSound()
}