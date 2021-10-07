package com.example.helloworld

fun main() {
    val people = Person("Vinicius", "Rodrigues")
    people.hobby = "watch films"
    people.stateHobby()
    val peopleTwo = Person("Taiza", "Marques")
    peopleTwo.hobby = "drawing and code"
    peopleTwo.stateHobby()
    val peopleThree = Person("Gabriel", "Santos", 20)
    peopleThree.hobby = "Code microsservices"
    peopleThree.stateHobby()

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

    /* Member variables, prop,0  */
    var age : Int? = null
    var hobby : String? = "watch Netflix"
    var name: String? = null
    /* Initializer block */
    init {
        this.name = firstName
        println("Person created: $firstName $lastName")
    }

    /* Creating a second constructor */
    constructor(firstName: String, lastName: String, age: Int): this(firstName, lastName) {
        this.age = age
        println("Person created: $firstName $lastName with $age years old")

    }

    /* Methods */

    fun stateHobby() {
        println("$name\'s hobby is: $hobby")
    }
}