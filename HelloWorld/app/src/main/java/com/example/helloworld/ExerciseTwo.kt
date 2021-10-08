package com.example.helloworld

fun main() {
    val mobileOne = MobilePhone("Android", "Xiaomi", "Redmi Note 8")
    mobileOne.chargeBattery()
    mobileOne.chargeBatteryFrom(30)
}

class MobilePhone(osName : String, brand : String, model : String) {
    /* My solution */
    var battery : Int = 50
    var charged : Int = 10
    var actualBattery : Int = battery + charged
    /* Professor solution */
    private var batteryFrom : Int = 30

    init {
        println("Cellphone: $osName, $brand and $model")
    }

    /* Professor solution */
    fun chargeBatteryFrom(chargedBy:Int) {
        println("Battery was $batteryFrom and is at ${batteryFrom + chargedBy} now")
        batteryFrom += chargedBy
    }

    /* My solution */
    fun chargeBattery() {
        println("Battery before: $battery \n" +
                "How much was charged: $charged \n" +
                "My actual battery is: $actualBattery")
    }
}