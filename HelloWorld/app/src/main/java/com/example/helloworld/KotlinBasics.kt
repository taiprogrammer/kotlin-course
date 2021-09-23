package com.example.helloworld

fun main() {
    // immutable variable
    val myName:String = "Taiza"

    // mutable variable
    var city:String = "Washington"
    // new data
    city = "São Paulo"
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
    println("is5greater3 ${5>3}")
    println("is5lowerEqual3 ${5<=3}")
    println("is5greaterEqual3 ${5>=3}")

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

    if (heightPerson1 > heightPerson2) {
        println("use raw force")
    }
    else if (heightPerson1 == heightPerson2) {
        println("use your power technique 1337")
    }
    else {
        println("use technique")
    }

    val age = 17

    if (age >= 21) {
        println("Now you can drink in the US")
    }
    else {
        println("You can't drink in the US yet")
    }

    print("Hello $myName! You live in $city")
}