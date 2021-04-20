package main

fun main() {
    // Higher-Order Function

    // Example I
    /**
        * Essa é uma função que tem uma função como parâmetro e que lida com número inteiro.

        * Ela recebe um número do tipo inteiro e realiza determinada operação.

        * O seu retorno é void e é o dev que precisa realizar a definição do retorno.
     */
    fun handleInteger(myInt: Int, operation: (Int) -> Unit) {
        operation(myInt)
    }

    /*
    Lembre-se que você pode alterar a referência para a lambda.
    Por padrão é usado o it!
     */
    handleInteger(5) { myInt ->
        println(myInt * 2)
    }

    // Example II
    /*
    Posso definir uma função e passar como argumento.
     */
    fun printResult(myInt: Int) {
        println("My int is: $myInt")
    }

    // Aqui eu atendi aos parâmetros e tudo será executado!
    handleInteger(5, ::printResult)

    // Example III
    val square: (Int) -> Int = {
        10
    }

    println(square(10))
    println(square.invoke(10))

    // Example IV - Lambda



    // Example V
    val celsiusToFahrenheit = { celsius: Float ->
        (celsius * 9 / 5) + 32
    }

    println(celsiusToFahrenheit.invoke(10f))

    // Example VI - High Order Fun
    encodeMsg("hello!") {
        it.capitalize()
    }

}

inline fun encodeMsg(msg: String, method: (String) -> String) {
    println("My text is: ${method(msg)}")
}