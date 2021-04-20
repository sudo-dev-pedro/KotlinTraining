package main

import model.run025.model.Curso

fun main() {
    val curso = Curso("Matemática")

    curso.setProfessor("Abraão")
    curso.sala = "Bloco A - 234"

    println("Descrição do curso ${curso.descricaoCurso}")
    println("Curso é: $curso")
}