package com.example.helloworld

import kotlin.math.floor

fun main() {
    val stringList : List<String> = listOf(
        "Taiza", "Vinicius", "Cachorro", "Gato"
    )

    val mixedTypeList : List<Any> = listOf(
        "Taiza", 21, "Vinicius", 200.0, "Cachorro", 45.0, "Gato", 2
    )

    for (value in mixedTypeList) {
        when {
            value is Int -> println("Integer: $value")
            value is Double -> println("Double: $value with floor value ${floor(value)}")
            value is String -> println("String: $value with length: ${value.length}")
            else -> println("None of above")
        }
    }

    /* SMART CAST */
    val obj1 : Any = "I have a dream"

    when (obj1) {
        !is String -> println("Not a String")
        else -> println("Found a String with length: ${obj1.length}")
    }

    /* EXPLICIT (UNSAFE) CASTING USING THE AS KEYWORD */
    val str1 : String = obj1 as String
    println(str1.length)

    //val obj2 : Any = 1337
    //val str2 : String = obj2 as String
    //println(str2) /* Integer cannot be cast to class String */

    /* EXPLICIT (SAFE) CASTING USING THE AS? KEYWORD */
    val obj3 : Any = 200
    val str3 : String? = obj3 as? String //it works
    println(str3) //prints null
}