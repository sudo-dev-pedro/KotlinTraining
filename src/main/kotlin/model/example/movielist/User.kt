package model.example.movielist

class User(
    val name : String,
    val movies : MutableList<MovieList>? = mutableListOf(),
    val moviesHashMap : HashMap<String, MovieList> = hashMapOf()) {

    fun addList(movieList: MovieList){
        movies?.let {
            movies.add(movieList)
            moviesHashMap.put(movieList.name, movieList)
        }
    }

    fun showList(movieListName : String) : MovieList? {
        return moviesHashMap[movieListName]
    }
}