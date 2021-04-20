package main

import model.example.methods.Student

fun main(){
    val jane = Student(firstName = "Jane", lastName = "Appleseed")

    // copy é uma função já definida em uma data class
    val janeCopy = jane.copy()

    println(jane == janeCopy) // True
    println(jane === janeCopy) // False
}