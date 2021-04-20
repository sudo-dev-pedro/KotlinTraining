package main

fun main() {

    // Example I
    val multiply = {
        a: Int, b: Int -> Int
        a * b
    }

    val result = multiply(2, 2)

    println(result)

    // Example II - Function Type
    /**
     * Uma variável que segura uma função.
    */
    val sumFunctionType: (Int, Int) -> Int

    // Example III - Usando function type com Lambda - Modo A
    val sumLambdaA: (Int, Int) -> Int = { a, b ->
        a + b
    }

    // Example III - Usando function type com Lambda - Modo B
    val sumLambdaB = { a: Int, b: Int ->
        a + b
    }

    // Example IV - Usando function type com Anonymous Fun - Modo A
    val sumAnonymous: (Int, Int) -> Int = fun(a: Int, b: Int): Int {
        return a + b
    }

    // Example IV - Usando function type com Anonymous Fun e exporessão lambda - Modo B
    val sumAnonymus: (Int, Int) -> Int = { a, b ->
        a + b
    }

    // Example V
    println(checkCondition(20) {
        it > 10
    }.translateCondition {
        it > 10
    })
}

fun checkCondition(number: Int, condition: (Int) -> Boolean): Boolean {
    return condition(number)
}

fun Boolean.translateCondition(condition: (Int) -> Boolean): String {
    return if (true) "Sim" else "Não"
}