package main

object MySingleton {
    fun doMyStuff(data: String) {
        println("Esse são meu dados $data")
    }

    val myConstant = "Essa é a minha constante!"
}

fun main() {
    MySingleton.doMyStuff("Hi!" + MySingleton.myConstant)
}