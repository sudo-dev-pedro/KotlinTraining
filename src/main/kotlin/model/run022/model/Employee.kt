package model.run022.model

class Employee private constructor() {
    var firstName: String? = null
    var lastName: String? = null

    // O nome não é obrigatório.
    // Posso fazer uso do companion object para construir uma Factory.
    companion object Loader {
        fun loadStudent(jsonText: String): Employee {
            val employee = Employee()
            employee.firstName = "Teste"
            employee.lastName = "1"
            return employee
        }
    }
}