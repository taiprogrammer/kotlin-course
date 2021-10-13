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

    /* Late init */
    var myCar = Car()
    myCar.owner = "Taiza"
    println(myCar.owner + myCar.myBrand)

    /* Data class object */

    val user1 = User(20, "Gisele")
    val userId = user1.id
    val userName = user1.name
    println("User created on Facebook, name: $userName with an id: $userId")

    val user2 = User(19, "Gabriel")
    println(user1 == user2)

    val updateUser = user1.copy(name = "Taiza Marques")

    println(updateUser.component1())
    println(updateUser.component2())

    /*
        val (id, name) = updateUser
    */

    val myMotorcycle = Motorcycle("Fazer 250 ABS", "Yamaha", 50.0)
    val myElectricMotorcycle = ElectricMotorcycle(myMotorcycle.nameMotorcycle, myMotorcycle.brand,
        100.0, 20.0)

    myMotorcycle.drive(500.0)
    myMotorcycle.showSpecs()
    myMotorcycle.extendRange(200.0)
    myMotorcycle.brake()
    myElectricMotorcycle.showSpecs()
    myElectricMotorcycle.drive()
    //Polymorphism
    myElectricMotorcycle.drive(500.0)

    val elephant = Elephant("Spyke", "India", 5400.0, 25.0)
    val human = Human("Taiza", "Brasil", 42.0, 10.0)

    elephant.run()
    elephant.breath()
    elephant.displayDetails()
    human.run()
    human.breath()
    human.displayDetails()
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

class Car() {
    var owner : String

    /* Custom getter */
    get() {
        return field.uppercase()
    }
    val myBrand : String = "BMW"

    /* Custom getter */
    get() {
        return field.lowercase()
    }

    var maxSpeed : Int = 250
    /* get() = field */ /* <- default getter from Kotlin */

    /* default setter from Kotlin */
        /* set(value) {
        field = value
    } */

        /*
    set(value) {
        field = if (value < 2) {
            value
        } else {
            value
        }
    } */

    var myModel : String = "M5"
    private set


    init {
        this.myModel = "M3"
        this.owner = "Vinicius"
    }
}

/* Creating a data class */
/* Data class already have a toString() method */
data class User(val id : Long, val name : String)

/* Inheritance */
/* Super class/Parent class/Base class */
//open class Vehicle() {
//    //properties
//    //methods
//}

/* Sub class/Child class/ Derived class of Parent class Vehicle */
open class Motorcycle(val nameMotorcycle : String, val brand : String,
                      override val maxSpeed: Double) : Drivable {
    open var range : Double = 0.0

    fun extendRange(amount : Double) {
        if (amount > 0) {
            range += amount
        }
    }

    override fun drive(): String {
        return "The motorcycle is driving by the interface implementation"
    }

    override fun brake() {
        super.brake()
        println("brake inside the motorcycle")
    }

    open fun drive(distance : Double) {
        println("Drove for $distance KM")
    }

    open fun showSpecs() {
        println("Name: $nameMotorcycle, Brand: $brand")
    }
}

class ElectricMotorcycle(nameMotorcycle: String, brand: String, val batteryLife : Double,
                         maxSpeed: Double
)
    : Motorcycle(nameMotorcycle, brand, maxSpeed) {

    override var range = batteryLife * 6

    override fun drive(distance: Double) {
        println("Drove for $distance KM on electricity")
    }


    override fun drive() : String {
        return "Drove for $range KM on electricity"
    }

    override fun showSpecs() {
        println("Battery life: $batteryLife")
        super.showSpecs()
        }
    }

    /* Interfaces */

interface Drivable {
    val maxSpeed : Double
    fun drive(): String
    fun brake() {
        println("The drivable is breaking")
    }
}

    /* Abstract Class */
abstract class Mammal(private val name : String, private val origin : String,
    private val weight : Double) {

        /* Abstract Property (Must be overridden by subclasses) */
    abstract var maxSpeed : Double

    /* Abstract Methods (Must be overridden by subclasses) */
    abstract fun run()
    abstract fun breath()

    /* Concrete (Nun Abstract) method */
    fun displayDetails() {
        println("Name: $name, Origin: $origin, Weight: $weight, Max Speed: $maxSpeed")
    }
}

class Human(name: String, origin: String, weight: Double,
            override var maxSpeed: Double):Mammal(name, origin, weight) {
    override fun breath() {
        println("Breath with nose, mouth and lungs")
        }

    override fun run() {
        println("Run with two legs")
        }
}

class Elephant(name: String, origin: String, weight: Double,
                override var maxSpeed: Double) : Mammal(name, origin, weight) {
    override fun breath() {
        println("Breath through the trunk")
    }

    override fun run() {
        println("Runs with four legs")
    }
}

