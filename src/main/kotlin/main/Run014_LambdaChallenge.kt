package main

fun main() {

    // Sum values greater than 5
    val values = listOf(24, 5, 10, 4)

    // Soma dos valores acima de 5
    val sum = values.filter {
        it > 5
    }.sum()

    println(sum)

    // Descontruct the object below
    data class Person(val name: String, val age: Int)

    val sam = Person("Sam", 30)

    // Desconstruct #1
    sam.apply {
        println("$name is $age years old.")
    }

    // Descontruct #2
    val (name, age) = sam
    println("$name is $age years old!")

    // Print out the index and value of the map below
    val names = mapOf("John" to 34, "Fred" to 24, "Sam" to 30, "Suzzy" to 29)
    names.map {
        println("${it.key} is ${it.value}")
    }
}