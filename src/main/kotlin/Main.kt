fun main() {
    // simple print function
    println("Hello World!")

    println("\n## Variables and Types ##")
    // Declaring variable and printing, look how it is printing
    var x: Int = 3
    println("The value of x is $x")
    x = 4
    println("The value of x is $x")

    // Another way of declaring variable, but it can't be reassigned
    val y: Int = 3
    println("The value of y is $y")
    // y = 2
    // Val cannot be reassigned, use it more compared to var

    // Don't need to declare types, they are inferred
    val z = 2 // Int, 32-bit number 2^34
    val a = 2L // Long, 64-bit number 2^64
    val b = 3.33 // Double, double is more precise than float but takes more memory
    val c = 3.33f // Float, prefer float if precision not required
    val iLikeKotlin = true // Boolean
    val iAmLetter = 'a' // character

    println("\n## Arithmetic Operators ##")
    val d = 3 * 4
    println("The value of d is $d")
    val e = 3 + 4
    println("The value of e is $e")
    val f = 4 - 3
    println("The value of f is $f")
    val g = 3f / 4f
    // Need to make it float otherwise kotlin will throw the decimal and return only 0
    println("The value of g is $g")
    val h = 10 % 3
    println("The value of h is $h")

    println("\n## Logical and Comparison Operator ##")
    val amIAnAdult = true
    val amIAProgrammer = true
    val amIAnAdultProgrammer = amIAnAdult && amIAProgrammer
    println(amIAnAdultProgrammer)
    val doILikeOOP = true
    val doILikeDynamicTypes = false
    val doILikeOOPOrDynamicTypes = doILikeOOP || doILikeDynamicTypes
    println(doILikeOOPOrDynamicTypes)
    val isTrue = amIAnAdult == amIAProgrammer
    val isFalse = amIAProgrammer != amIAnAdult
    println("$isTrue $isFalse")
    val negate = !(amIAProgrammer != amIAnAdult)
    println(negate)

    println("\n## Strings ##")
    val string = "Kotlin is the best language"
    println(string)
    println(string.uppercase())

    println("\n## If Conditions ##")
    val temp = 1 + 1
    if(temp == 2){
        println("temp is 2")
    }
    else if(temp == 3){
        println("temp is 3")
    }
    else {
        println("temp is not 2 or 3")
    }

    // Can assign variables condition expressions
    val temp2 = if(temp == 2) 2 else 3
    println(temp2)

//    println("\n## Null Safety ##")
//    // Allows us to set the value to null, Java doesn't let us do this and throws the null pointer exception
//    val temp3: Int? = null;
//    val number1 = readLine()
//    val number2 = readLine()
////     Complains saying this could be null
////     Have to use this !! as number1?.toString() could be null + plus another value and doesn't know what to do
////     Here we are saying to kotlin that we know its never null
//    val result = number1!!.toInt() + number2!!.toInt()
//    println(result)
//
//    // A better approach
//    val number3 = readLine() ?: "0"
//    val number4 = readLine() ?: "0"

    println("\n## Lists ##")
    // Immutable Lists and don't need to add type
    val shoppingList = listOf<String>("Lamborghini", "Penthouse", "Rolex")
    println(shoppingList[0])
    // Mutable list -> looks similar to ArrayList
    val newShoppingList = mutableListOf("Ferrari","House", "Tesla")
    newShoppingList.add("Bentley")
    println(newShoppingList[3])

    println("\n## Loops ##")
    var counter = 0
    while(counter < newShoppingList.size) {
        println(newShoppingList[counter])
        counter++
    }

    // for each loop
    println()
    for(shoppingItem in shoppingList){
        println(shoppingItem)
    }

    println()
    //range option
    for(i in 1..10){
        println(i)
    }

    println("\n## When Expression ##")
    val x2 = 3
    when(x2) {
        in 1..2 -> println("x2 is between 1 and 2")
        in 3..10 -> println("x2 is between 3 and 10")
        else -> {
            println("x2 is not in range 1 to 10")
        }
    }

    println("\n## Functions ##")
    print5Numbers()
    val even = isEven(2)
    println(even)
    println(add())
    println(add(4, 4))
    // extension function
    println(3.isOdd())

    println("\n## Classes ##")
    val dog = Animal("Dog")

    val cat = Cat()
    println(cat.meow());
    // However we can still create an instance of animal, only want to create dogs and etc

    println("\n## Abstract Classes ##")
    val car = Car()
    println(car.makeSound())

    println("\n## Anonymous Class ##")
    // This class is something we can only use in this function and nowhere else
    val truck = object: Vehicle("truck"){
        override fun makeSound() {
            println("Honk")
        }
    }

    println("\n## Exceptions ##")
    val userInput = readLine() ?: "0"
    val parsedNumber = try {
        userInput.toInt()
    } catch(e: Exception){
        // Set number to 0 if exception is thrown
        0
    }
    println(parsedNumber)

    println("\n## Lambda Functions ##")
    val newList = listOf("Kotlin", "is", "fun")
    // counts only things with items with 3 characters, don't write return
    val count2 = newList.count { currentString ->
        currentString.length == 3
    }
    println(count2)
    val count3 = newList.customCount { currentString ->
        currentString.length == 2
    }
    println(count3)

    println("\n## Generics ##")
}
// Extension function on list which takes a parameter called function which is a function type that takes a string and returns a boolean.
// The extension function returns int.
fun List<String>.customCount(function: (String) -> Boolean): Int{
    var counter = 0
    for(string in this){
        if(function(string)){
            counter++
        }
    }
    return counter
}

// Call this on any type instead of just string using T
fun <T> List<T>.customCountTwo(function: (T) -> Boolean): Int{
    var counter = 0
    for(item in this){
        if(function(item)){
            counter++
        }
    }
    return counter
}


fun print5Numbers(){
    for(i in 1..5){
        println(i)
    }
}

// Parameter type is not optional
fun isEven(num: Int): Boolean {
    return num % 2 == 0
}

fun add(num1: Int = 0, num2: Int = 0): Int{
    return num1 + num2
}

// Extension Functions
// Extending on class Int
fun Int.isOdd(): Boolean {
    return this % 2 == 1
}
