package main

import model.example.methods.Grade
import model.example.methods.Student

fun main() {

    val jane = Student(firstName = "Jane", lastName = "Appleseed")

    val history = Grade(letter = "B", points = 9.0, credits = 3.0)
    var math = Grade(letter = "A", points = 16.0, credits = 4.0)

    jane.recordGrade(history)
    jane.recordGrade(math)
    /*
        jane.grades.map { grade ->
            println("Jane's grade: ${grade.letter}")
            //println("Jane's credits: ${grade.credits}")
        }
     */

    /*
        Faz o map e o Pair
        Nesse caso o letter será meu key e o point meu value?
    */
    jane.grades.map {
        println(it.letter to it.points)
    }

    //math = Grade(letter = "A", points = 20.0, credits = 5.0)
    //jane.recordGrade(math)

    //println("Jane's has: ${jane.credits} credits")
}