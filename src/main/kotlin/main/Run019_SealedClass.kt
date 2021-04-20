package main

import model.run019.model.Expression
import model.run019.model.NotANumber
import model.run019.model.Num
import model.run019.model.Sum

fun main() {
    val num1 = Num(5.5)
    val num2 = Num(10.4)

    println("A soma de $num1 e $num2 é ${eval(Sum(num1, num2))}")
}

fun eval(expression: Expression) : Double = when(expression) {
    is Num -> expression.number
    is Sum -> eval(expression.exp1) + eval(expression.exp2)
    NotANumber -> Double.NaN
}