package com.example.helloworld

/* ArrayLists -> are used tp create dynamic arrays:

* ArrayList<E> -> is used to create an empty ArrayList
* ArrayList(capacity: Int) -> is used to create an ArrayList of specified capacity
* ArrayList(elements: Collection<E>) -> is used to create an ArrayList with the
* elements of a collection

* open fun add(element: E):Boolean -> used to add the specific element into the collection
* open fun clear() -> used to remove all elements from the collection
* open fun get(index: Int):E -> used t5o return the element at specific index in the list
* open fun remove(element: E):Boolean -> used to remove a single instance of the specific element
* from current collection, if it is available

* Lambda Expressions

* Lambda is a function which has no name
* Lambda expressions and anonymous functions are 'functions literals', i.e functions that are not
* declared, but passed immediately as an expression
* Lambda is defined with curly braces {} which takes variables as a parameter (is any) and a body
* function
* The body of a function is written after variable (if any) followed by -> operator
* Syntax: { variable(s) -> body_of_lambda }

* Example:
    val sum: (Int, Int) -> Int = { a: Int, b: Int -> a + b }
    println(sum(10,5))

    even shorter
    val sum = { a : Int, b : Int -> println(a + b) }
    sum(10,5)

* Visibility Modifiers -> are the keywords which are used to restrict the use of classes,
* interfaces, methods, and properties in Kotlin
* Have four different types:
* - public
* - private
* - protected
* - internal
*  */

fun main() {
    val sum = {a : Int, b : Int -> a + b}
    println(sum(5,20))
}