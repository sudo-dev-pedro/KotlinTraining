package main

// Mais detalhes na Class
import model.run022.model.Employee

/**
 * Nesse exemplo, estou simulando o recebimento de dados de um empregado como um
 * JSON (vindo de uma API, por exemplo).
 * Esse dado estaria sendo transformado em um objeto da classe Empregado.
*/

fun main() {
    val employee = Employee.loadStudent("Teste 1")

}