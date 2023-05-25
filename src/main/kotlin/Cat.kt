// Inheritance use colon
class Cat: Animal("Cat") {
    // has access to fields from Animal such as leg count
    // Only cats can call this function
  fun meow() {
      println("Meow!!!")
  }
}