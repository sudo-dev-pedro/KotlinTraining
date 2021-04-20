package main

import model.example.movielist.MovieList
import model.example.movielist.User

// Não foi feito o uso da fun print() da classe MovieList
fun main(){
    val jane = User("Jane")
    val janeList : MutableList<String> = mutableListOf("Avengers", "Frozen")

    val janeMovies = MovieList("Disney", janeList)

    jane.addList(janeMovies)
    /*
    * Ele não imprime os dois resultados que desejo, apenas o segundo.
    * Há como imprimir os dois?
    * */
    println(jane.showList("Disney")?.moviesList)

    val john = User("John")
    val johnList : MutableList<String> = mutableListOf("The Hobbit 1", "The Hobbit 2")

    val johnMovies = MovieList("Fantasy", johnList)

    john.addList(johnMovies)

    println(john.showList("Fantasy")?.moviesList)
}