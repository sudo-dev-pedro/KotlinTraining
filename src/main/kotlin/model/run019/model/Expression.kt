package model.run019.model

sealed class Expression

data class Num(
    val number: Double
) : Expression()

data class Sum(
    val exp1: Expression,
    val exp2: Expression
) : Expression()

object NotANumber: Expression()