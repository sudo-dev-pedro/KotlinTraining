package main

fun main() {
    // Atribuindo uma função a uma váriavel (Forma 1)
    val soma : (Int, Int, Int) -> Int = ::soma

    // Forma 2
    val subtracao = ::subtrair

    println(subtracao(1,2,3))

}

fun soma(a: Int, b : Int, c: Int) : Int {
    return a + b + c
}

fun subtrair(a: Int, b : Int, c: Int) : Int {
    return a - b - c
}