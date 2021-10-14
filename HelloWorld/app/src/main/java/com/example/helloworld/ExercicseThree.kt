package com.example.helloworld

fun main() {
    val avarage : ArrayList<Double> = ArrayList<Double>(5)

    avarage.add(2.0)
    avarage.add(4.0)
    avarage.add(6.0)
    avarage.add(8.0)
    avarage.add(10.0)

    var total = 0.0
    for (value in avarage) {
        total += value
    }
    var avrg = total / avarage.size
    println("The average is: $avrg")
}