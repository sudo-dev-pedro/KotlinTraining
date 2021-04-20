package main

import model.run021.model.Student
import model.run021.model.StudentRegistry

fun main() {
    /**
     * Given the Student data class below, create a Student
     * singleton that has a list of students and can add
     * student from that list.
     */

    val Steve = Student("Steve", "Rogers")
    val Marie = Student("Marie", "Curie")
    val Blake = Student("Blake", "Crouch")

    StudentRegistry.addStudent(Steve)
    StudentRegistry.addStudent(Marie)
    StudentRegistry.addStudent(Blake)

    StudentRegistry.allStudents.forEach {
        println(it.firstName + " " + it.lastName)
    }
}