package model.example.movielist

class MovieList(
    val name : String,
    val moviesList : MutableList<String> = mutableListOf()) {

    fun print(){
        for (movie in moviesList) {
            println(movie)
        }
    }
}