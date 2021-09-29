package com.example.helloworld

fun main() {
    println("Hello, world!!!")
    // This is a comment. Comments start with //
    // val is used for variables which are immutable (not changable)
    val myName = "Denis"
    // myName = "Michael" // ERROR: Val cannot be reassigned

    /* This is a multi line comment starts with /* and ends with *'/ without the '
     var is used for variables which are mutable/changeable.
     kotlin is a strongly typed language that supports Type Inference.
     The compiler will directly assume the size and type to a variable by that.
     For example, if you assign any whole number to a variable,
     the compiler will directly assume that the variable is of type Int
    */ */
    var myAge = 31

    // Integer TYPES: Byte (8 bit), Short (16 bit), Int (32 bit), Long (64 bit)
    val myByte: Byte = 13
    val myShort: Short = 125
    val myInt: Int = 123123123
    val myLong: Long = 12_039_812_309_487_120

    // Floating Point number Types: Float (32 bit), Double (64 bit)
    val myFloat: Float = 13.37F
    val myDouble: Double = 3.14159265358979323846

    // Booleans the type Boolean is used to represent logical values.
    // It can have two possible values true and false.
    var isSunny: Boolean = true
    // not sunny anymore...
    isSunny = false

    // Characters
    val letterChar = 'A'
    val digitChar = '1'

    // Strings
    val myStr = "Hello World"
    var firCharInStr = myStr[0]
    var lastCharInStr = myStr[myStr.length - 1]

    //Arithmetic operators (+, -, *, /, %)
    var result = 5+3
    result = result / 2
    // alternatively
    // result /= 2
    result = result * 5
    result = result - 1
    var moduloResult = 5%2
    println( moduloResult)

    //Comparison operators (==, !=, <, >, <=, >=)
    val isEqual = 5==3
    // Concatenation - adding of "Strings"
    println("isEqual is " + isEqual)
    val isNotEqual = 5!=5
    // Kotlin has a feature called String Interpolation.
    // This feature allows you to directly insert a template expression inside a String.
    // Template expressions are tiny pieces of code that are evaluated and
    // their results are concatenated with the original String.
    // A template expression is prefixed with $ symbol.
    // Following are examples of String interpolation
    println("isNotEqual is $isNotEqual")

    println("is5Greater3 ${5 > 3}")
    println("is5LowerEqual3 ${5 >= 3}")
    println("is5LowerEqual5 ${5 >= 5}")

    //Assignment operators (+=, -=, *=, /=, %=)
    var myNum = 5
    myNum += 3
    println("myNum is $myNum")
    myNum *= 4
    println("myNum is $myNum")


    //Increment & Decrement operators (++, --)
    myNum++
    println("myNum is $myNum")
    // increments after use
    println("myNum is ${myNum++}")
    // increments before use
    println("myNum is ${++myNum}")
    println("myNum is ${--myNum}")

    //create a variable for testing all condition
    val age = 16
    //create a variable for drinkingAge
    val drinkingAge = 21
    //create a variable for votingAge
    val votingAge = 18
    //create a variable for drivingAge
    val drivingAge = 16

    //Assign the if statement to a variable
    val currentAge =  if (age >=drinkingAge){
        println("Now you may drink in the US")
    //return the value for this block
        drinkingAge
    }else if(age >=votingAge){
        println("You may vote now")
    //return the value for this block
        votingAge
    }else if (age>=drivingAge){
        println("You may drive now")
    //return the value for this block
        drivingAge
    }else{
        println("You are too young")
    //return the value for this block
        age
    }
    //print the age for the passing condition
    print("current age is $currentAge")

    // Control Flows
    // If Statements
    var age2 = 17
    if(age2 >= 21){
        print("now you may drink in the US")
    }
    // Else If Statement - only executed if the if statement is not true
    else if(age2 >= 18){
        print("now you may vote")
    }
    // Else If Statement - only executed if the foregoing else if statement is not true
    else if (age2 >= 16){
        print("you now may drive")
    }
    // else is only executed if all of the foregoing statements weren't true
    else{
        print("you're too young")
    }

    // Kotlin’s "when" expression is the replacement of the switch statement
    // from other languages like C, C++, and Java.
    // It is compact and more powerful than switch statements.
    var season = 3
    when(season) {
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> println("Fall")
        4 -> println("Winter")
        else -> println("Invalid Season")
    }
    var month = 3
    when(month) {
        1,2,3 -> println("Spring")
        in 4..6 -> println("Summer")
        in 7..9 -> println("Fall")
        in 10..12 -> println("Winter")
        else -> println("Invalid Season")
    }

    // challenge - translate the if statement with the age to a when expression
    when(age2){
        // with the !in it's the same as saying not in ...
        !in 0..20  -> print("now you may drink in the US")
        in 18..20  -> print("now you may vote")
        16,17 -> print("you now may drive")
        else -> print("you're too young")
    }

    var x : Any = 13.37
    when(x) {
        is Int -> println("$x is an Int")
        !is Double -> println("$x is not Double")
        is String -> println("$x is a String")
        else -> println("$x is none of the above")
    }

    /**
    var x : Any = 13.37
    when(x) {
    is Int -> println("$x is an Int")
    !is Double -> println("$x is not Double")
    is String -> println("$x is a String")
    else -> println("$x is none of the above")
    }
     **/

    val x2 : Any = 13.37
//assign when to a variable
    val result2 =  when(x2) {
//let condition for each block be only a string
        is Int -> "is an Int"
        !is Double -> "is not Double"
        is String -> "is a String"
        else -> "is none of the above"
    }
//then print x with the result
    print("$x2 $result2")

    var condition = true
    // Loops
    // While Loop
    // While loop executes a block of code repeatedly as long as a given condition is true
    while(condition) {
        // code to be executed
    }

    var y = 1
    while(y <= 10) {
        println("$y ")
        y++
    }

    // Do while loop
    // The do-while loop is similar to while loop except that it
    // tests the condition at the end of the loop.
    // This means that it will at least execute the body once
    var z = 1
    do {
        print("$z ")
        z++
    } while(z <= 10)

    var feltTemp = "cold"
    var roomTemp = 10
    while (feltTemp == "cold"){
        roomTemp++
        if(roomTemp == 20){
            feltTemp = "comfy"
            println("it's comfy now")
        }
    }


    // For Loop
    // A for-loop is used to iterate through ranges, arrays, collections, or anything
    // that provides an iterator (You’ll learn about iterator, arrays, ranges and collections in a future lectur    e).
    for(num in 1..10) {
        print("$num ")
    }

    // infix notation
    for(i in 1 until 10) { // Same as - for(i in 1.until(10))
        print("$i ")
    }

    for(i in 10 downTo 1) {     // Same as - for(i in 10.downTo(1))
        print("$i ")
    }

    for(i in 1 until 10 step 2) { // Same as - for(i in 1.until(10).step(2))
        print("$i ")
    }


}

// The syntax of a function - fun stands for function
fun myOverload(){
    // The body of a function
    println("myFunction was called")
}

// This function has two parameters and returns a value of type Int
fun addUp(a: Int, b: Int): Int{
    // the return keyword indicates that this function will return the following value
    // once this function is called and executed
    return (a+b)
}
// Article on Kotlin words https://blog.kotlin-academy.com/kotlin-programmer-dictionary-function-vs-method-vs-procedure-c0216642ee87
// CHALLENGE: create a function that calculates the average and call it
fun avg(a: Double, b: Double): Double {
    return  (a + b)/2
}