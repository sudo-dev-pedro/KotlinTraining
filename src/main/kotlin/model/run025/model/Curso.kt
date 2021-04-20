package model.run025.model

import kotlin.properties.Delegates

data class Curso(var nomeCurso: String) {
    val descricaoCurso by lazy {
        "Curso de ${nomeCurso} ministrado por $nomeProfessor"
    }

    private lateinit var nomeProfessor: String

    var sala: String by Delegates.observable("Sem sala") {
            _, _, newValue ->
        println("Novo valor é $newValue")
    }

    fun setProfessor(professor: String) {
        nomeProfessor = professor
    }
}