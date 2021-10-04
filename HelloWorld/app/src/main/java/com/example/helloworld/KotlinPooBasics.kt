package com.example.helloworld

fun main() {
    val people = Person("Vinicius", "Rodrigues")

    /* Here I can call myFunction2() and reassign a value for the parameter */
    myFunction2(5)
}

fun myFunction2(a : Int) {
    /* I can't call my parameter inside my function, only outside that */
    //a = 5
    /* Instead I want to call a number here, I have to create a variable */
    val b = 5
    var c = a /* <- I'm calling my parameter here */

    println("Parameter a, actually now is: $c")

    /* assign a variable with the same name as the parameter is possible only because shadowing
    * from the kotlin enables that
    * ex: val a = 4 */
}

class Person constructor(firstName : String, lastName : String) {
    /* Initializer block */
    init {
        println("Person created: $firstName $lastName")
    }
}