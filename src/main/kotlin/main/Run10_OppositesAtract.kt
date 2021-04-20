package main

fun main(){
    val resultCheckFlowerA = isOddNumber(2)
    val resultCheckFlowerB = isOddNumber(2)

    val resultOfLove = resultCheckFlowerA != resultCheckFlowerB

    println(resultOfLove)
}

fun isOddNumber(petals : Int) : Boolean = petals % 2 == 0