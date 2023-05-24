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
    // Need to make it float otherwise kotlin will throw the decimal and return onlu 0
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

    println("\n## Null Safety ##")
    // Allows us to set the value to null, Java doesn't let us do this and throws the null pointer exception
    val temp3: Int? = null;
    val number1 = readLine()
    val number2 = readLine()
    // Complains saying this could be null
    // Have to use this !! as number1?.toString() could be null + plus another value and doesn't know what to do
    // Here we are saying to kotlin that we know its never null
    val result = number1!!.toInt() + number2!!.toInt()
    println(result)

    // A better approach
    val number3 = readLine() ?: "0"
    val number4 = readLine() ?: "0"




}