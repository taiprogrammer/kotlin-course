package com.example.helloworld

fun main() {
    myFunction()
    println("\n ${addUp()}")
    /* Argument */
    println("\n ${lessUp(5, 3)}")
    var result = averageBiggerDicks(12.0, 15.5)
    println("The result of the average of the biggest dick in the world is: $result")
}

fun myFunction() {
    print("Chama o Vinicius de gostoso")
}
/* Parameter */
/* Method - Method is a function within a class */
fun lessUp(a: Int, b: Int) : Int {
    return a - b
}

fun averageBiggerDicks(japan: Double, brazil: Double) : Double {
    return  (japan + brazil) / 2
}

fun addUp() : Int {
    val ab = 10
    val bc = 15
    return ab + bc
}