package main

fun main() {
    /*
    Generics: Permite definir tipos que possuem tipos como parâmetros.
    Collections usam isso toda hora!
    Mas como aplicar por conta própria?

    Exemplo:Uma collection não tem um tipo exatamente definido é o próprio dev que faz essa tipagem!
    Isso facilita muito na escrita de funções que podem ser realizadas em uma collection.
    */

    printItem(1)

    val itemReceived = printItemTwo("Abacate")
    println(itemReceived)

}

// Como definir uma função genérica?
// Unit
fun <T> printItem(item: T) {
    println(item)
}

// O retorno será o mesmo do que for passado como argumento!
fun <T> printItemTwo(item: T) : T {
    return item
}