package com.example.helloworld

fun main() {
    val mobileOne = MobilePhone("Android", "Xiaomi", "Redmi Note 8")
}

class MobilePhone(osName : String, brand : String, model : String) {
    init {
        println("Cellphone: $osName, $brand and $model")
    }
}