package main

fun main(){
    soma(10, 20)
    println("O resultado da soma é: ${soma(10, 20)}")
}

fun soma(a: Int, b : Int) : Int {
    return a + b
}
