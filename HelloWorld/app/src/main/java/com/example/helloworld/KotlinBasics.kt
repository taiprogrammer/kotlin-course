package com.example.helloworld

import androidx.annotation.Nullable

fun main() {
    // immutable variable
    val myName:String = "Taiza"

    // mutable variable
    var city:String = "Washington"
    // new data
    city = "São Paulo"
    print("Hello $myName! You live in $city")
    // TODO: add new functionality

    /*
        Integer types:
            Byte (8 bit)
            Short (16 bit)
            Int (32 bit)
            Long (64 bit)
    */

    val myByte:Byte = 13
    val myShort:Short = 123
    val myInt:Int = 32
    val myLong:Long = 1_2_3_2_3

    /*
        Floating Point number types:
            Float (32 bit)
            Double (64 bit)
    */

    val myFloat:Float = 0.0F
    val myDouble:Double = 0.0

    /*
        Boolean is used to represent logical values.
        It can have two possible values: true or false
    */

    var isFunny:Boolean = true
    isFunny = false

    /* Characters
        It can't have more of one character in the value*/

    val letterChar:Char = 'A'
    val digitChar:Char = '1'

    /* Strings
        It can contains more than one character */

    val myStr:String = "Hello World"

    /* Looking for a character of the string by position */
    var firstCharInString = myStr[4]

    /* Looking for a character of the string by position,
       in this case, will be the last letter */
    var lastCharInString = myStr[myStr.length - 1]

    println(firstCharInString)

    println(lastCharInString)

    /* Arithmetic operators:
        (+, -, *, /, %
    */

    var result:Int = 5 + 3

//    result = result / 2 ->
    result /= 2
    /*
        result += 2
        result -= 2
        result *= 2
        result /= 2
        result %= 2
    */
    println("Resultado: $result")

    /*
        Comparison operators:
            ==
            !=
            <
            >
            <=
            >=
    */

    val isEqual = 5==3
    val isNotEqual = 5!=5

    /* String interpolation */
    //println("is5greater3 ${5>3}")
    //println("is5lowerEqual3 ${5<=3}")
    //println("is5greaterEqual3 ${5>=3}")

    /*
        Assignments operators:
            +=
            -=
            *=
            /=
            %=
    * */
    var myNum = 5
    myNum += 3
    println("myNum is: $myNum")

    /*
        Increment and Decrement operators:
            ++
            --
    * */
    myNum++
    println("myNum is: $myNum")
    println("myNum is: ${myNum++}")
//    println(myNum)
    println("myNum is: ${++myNum}")
    println("myNum is: ${--myNum}")

    /* If statements */

    var heightPerson1 = 170
    var heightPerson2 = 189

    /* Using if - else if - else */

    /*if (heightPerson1 > heightPerson2) {
        println("use raw force")
    }
    else if (heightPerson1 == heightPerson2) {
        println("use your power technique 1337")
    }
    else {
        println("use technique")
    } */

    /* Replacing if - else if - else to when */

    when {
        heightPerson1 > heightPerson2 -> {
            println("use raw force")
        }
        heightPerson1 == heightPerson2 -> {
            println("use your power technique 1337")
        }
        else -> {
            println("use technique")
        }
    }

    val age = 17

//    if (age >= 21) {
//        println("Now you can drink in the US")
//    }
//    else {
//        println("You can't drink in the US yet")
//    }

    when {
        age >= 21 -> {
            println("Now you can drink in the US")
        }
        age >= 18 -> {
            println("You may vote now")
        }
        age >= 16 -> {
            println("You may drive now")
        }
        else -> {
            println("You're too young")
        }
    }

    var season = 3

    when(season) {
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> {
            println("Fall")
            println("Autumn")
        }
        4 -> println("Winter")
        else -> println("Invalid season")
    }

    var month = 3

    when(month) {
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
//        in 12 downTo 2 -> println("Winter")
        12, 1, 2 -> println("Winter")

        else -> println("Invalid month")
    }

    var x : Any = 13.37

    when (x) {
        is Int -> println("$x is an Integer")
        is String -> println("$x is a String")
        is Double -> println("$x is a Double")
        else -> println("Neither one neither nothing!")
    }

    /* While loop executes a block of code repeatedly as long as a given condition
    * is true */
    var y = 1
    while (y <= 10) {
        //code to be executed
        println("$y you are amazing")
        y++
    }
    println("_________________________")

    var z = 100
    while (z >= 0) {
        println("$z")
        z--
    }
    println("Over")
    println("_________________________")

    var a = 100
    while (a >= 0) {
        println(a)
        a -= 2
    }
    println("Over again")
    println("_________________________")

    var b = 1
    do {
        println(b)
        b++
    } while (b < 15)
    println("_________________________")

    var feltTemperature = "cold"
    var roomTemperature = 10
    while (feltTemperature == "cold") {
        roomTemperature++
        if (roomTemperature >= 20) {
            feltTemperature = "comfy"
            println("it's $feltTemperature now")
        }
    }
    println("Over temperature")
    println("_________________________")
    /* For Loops */
    for (num in 1..10) {
        println(num)
    }
    println("_________________________")
    for (num in 1 until 10) {
        print("$num \n")
    }
    println("_________________________")

    for (number in 10 downTo 1) {
        println(number)
    }
    println("_________________________")

    for (number in 10 downTo 1 step 2) { //same as - (number in 10.downTp(1).step(2))
        println(number)
    }
    println("_________________________")
    var number = 0
    while (number <= 10000) {
        println(number)
        number++
        if (number == 9001) {
            println("It's over 9000!!!")
        }
    }
    println("_________________________")
    for (num in 10000 downTo 0) {
        println(num)
        if (num == 9001) {
            println("It's over 9000!!!")
        }
    }
    /*
    * for(num in 1..10000) {
            if(num == 9001)
        print("IT'S OVER 9000!!!")
    }
    * */
    println("_________________________")

    var humidityLevel = 80
    var humidity = "humid"
    while (humidity == "humid") {
        humidityLevel -= 5
        println("humidity decreased")
        if (humidityLevel < 60) {
            humidity = "comfy"
            println("it's $humidity now")
        }
    }
    println("_________________________")

    var ex = 0
    for (y in 0..9) {
        ex += y
    }
    println(y)
    println("_________________________")
    var name:String = "Vinicius"
    //name = null //COMPILATION -> Error
    var nullable:String? = "will be right"
    nullable = null
    var nullableTwo : String? = "fuck"
    //nullableTwo = null

    nullableTwo?.length
    println(nullableTwo?.length)

    nullableTwo?.let { println(it.length) }

    /*
    if (nullableTwo != null) {
        nullableTwo.length
    }
    else {
        null
    }
     */
    println("_________________________")
    val route = nullableTwo ?: "Guest"
}