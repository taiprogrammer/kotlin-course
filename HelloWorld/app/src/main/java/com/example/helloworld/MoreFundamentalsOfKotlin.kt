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

* Nested class and Inner class -> a class which is created inside another class and a class which
* is created inside another class with keyword inner

* Nested class -> is such class which is created inside another class
* -> In Kotlin, a nested class is by default static, so its data members and member functions ban
* be accessed without creating an object of the class
* -> Nested classes cannot access the data members of outer classes

* Example:
    class OuterClass {
        outer class code

            class NestedClass {
                nested class code
            }
    }

*   class OuterClass {
        private val name : String = "Mr X"
        class NestedClass {
            val description : String = "code in nested class"
            private val id : Int = 101
            fun foo() {
                println("name is: $name") -> cannot access the outer class members
                println("Id is: $id")
            }
        }
*   }

*   fun main() {
        println(OuterClass.NestedClass().description) -> accessing property

        val obj = OuterClass.NestedClass() -> Object created
        obj.foo() -> access member function
    }

    Output: code inside nested class
        Id is: 101

* Inner class -> is a class which is created inside another class with keyword inner
* -> In other words, we can say that a nested class which is marked as "inner" is called inner class
* -> Inner class cannot be declared inside interfaces on non-inner nested class
* -> The advantage of inner class over nested class is that, it is able to access members of its
* outer class even if it is private
* -> The inner class keeps a reference to an object of its outer class

* Example
*   class OuterClass {
        outer class code

        inner class InnerClass {
            inner class code
        }
    }

    class OuterClass {
        private val name : String = "Mr X"

        inner class InnerClass {
            val description : String = "code inside inner class"
            private val id : Int = 101
            fun foo() {
                println("name is: $name") -> access the private variable outer class member
                println("Id is: $id")
            }
        }
    }

* Unsafe and safe cast operator
* Unsafe cast operator: as
* -> Sometimes it is not possible to cast a variable and it throws an exception, this is called
* an unsafe cast
* -> The unsafe cast is performed bt the infix operator as
* -> A nullable string (String?) cannot be cast to non nullable string (String), this throws
* an exception

* Example:
    fun main() {
        val obj : Any? = null
        val st : String = obj as String
        println(str)
    }

    Output: Exception ....

* -> Trying to cast an integer value of Any type into a string type leads to a ClassCastException

* Example:
    val obj : Any = 123
    val str : String = obj as String

* -> Throws java.langClassCastException: java.lang.Integer cannot be cast to java.lang.String

* -> Nullable for Casting to work:
* -> source and target variable needs to be a nullable for casting to work:

* Example:
    fun main() {
        val obj : Any? = "String unsafe casting"
        val str : String? = obj as String? -> it works
        println(str)
    }

    Output: String unsafe cast

* Safe cast operator: as?
* -> as? provides a safe cast operation to safely cast to a type
* -> It returns a null if casting is not possible rather than throwing an ClassCastException
* exception

* Example:
    fun main() {
        val location : Any = "Kotlin"
        val safeString : String? = location as? String
        val safeInt : Int? = location as? Int
        println(safeString)
        println(safeInt)
    }

    Output: Kotlin
            null

* Exception handling -> Handling runtime problems which occur in the program and would otherwise
* lead to program termination

* Throwable class
* throw MyException("this throws an exception")

* -> There as four different keywords used in exception handling:
*   try: contains a set of statements which might generate an exception. It must be followed by
* either catch or finally or both
*   catch: is used to catch the exception thrown from the try block
*   finally: always execute whether exception is handled or not. So it is used to execute important
* code statement. (like closing buffers)
*   throw: is used to throw an exception explicitly

*  */

class OuterClass {
    private val name : String = "Mr Franks"

    class NestedClass {
        val description : String = "code in nested class"
        private val id : Int = 101
        fun foo() {
            println("Id is: $id")
        }
    }
}

class SecondOuterClass {
    private val name : String = "Mr Franks"

    inner class InnerClass {
        val description : String = "code in inner class"
        private val id : Int = 101
        fun foo() {
            println("name is: $name")
            println("id is: $id")
        }
    }
}

fun main() {
    val sum = {a : Int, b : Int -> a + b}
    println(sum(5,20))

    println(OuterClass.NestedClass().description)
    val obj = OuterClass.NestedClass()
    obj.foo()

    println(SecondOuterClass().InnerClass().description)
    val objInner = SecondOuterClass().InnerClass()
    objInner.foo()
}