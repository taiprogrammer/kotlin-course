package com.example.helloworld

fun main() {
    val people = Person("Vinicius", "Rodrigues")
}

class Person constructor(firstName : String, lastName : String) {
    /* Initializer block */
    init {
        println("Person created: $firstName $lastName")
    }
}