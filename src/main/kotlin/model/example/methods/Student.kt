package model.example.methods

data class Student(
    val firstName: String,
    val lastName: String,
    val grades: MutableList<Grade> = mutableListOf(),
    var credits: Double = 0.0) {

    fun recordGrade(grade: Grade) {
        grades.add(grade)
        credits += grade.credits
    }
}