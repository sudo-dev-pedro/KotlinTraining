package main

import model.run026.model.Mover
import model.run026.model.workers.CardboardBox

fun main() {
    /*
    Note que na declaração da interface MAP há o uso da palavra reservada: out
    interface Map<K, out V>
    As chaves precisam ser de um MESMO tipo genérico K (Key), mas os valores, graças ao uso
    da palavra out, não necessitam ser do mesmo tipo!

    É por isso que eu posso ter:
      Map<String, Any>
    */

    // Exemplo
    //Cheap = Inexpressive things
    val cheapThings = listOf(
        Mover.CheapThing("Cinder Block table"),
        Mover.CheapThing("Box of old books"),
        Mover.CheapThing("Ugly old couch")
    )

    // Nesse momento o tipo do meu Mover é: Mover<CheapThing>
    val cheapMover = Mover(cheapThings)

    cheapMover.moveEverythingToTruck(null)
    cheapMover.moveEverythingIntoNewPlace()
    cheapMover.finishMove()

    //Breakable Things
    val television = Mover.BreakableThing("Flat-Screen Television")
    val breakableThings = listOf(
        television,
        Mover.BreakableThing("Mirror"),
        Mover.BreakableThing("Guitar")
    )

    // Nesse objeto, o meu Mover é: Mover<BreakableThing>
    val expensiveMover = Mover(breakableThings)

    expensiveMover.moveEverythingToTruck(CardboardBox())
    television.smash()
    expensiveMover.moveEverythingIntoNewPlace()
    expensiveMover.finishMove()

}

// 1 - Essa é uma função que irá realizar alguma ação com um tipo genérico.
// 2 - O argumento a ser informado, precisa ser do tipo genérico pretendido.
// 3 - O retorno dessa fun é o tipo que foi dado.
// É o mesmo TIPO em todos os T
fun <T> printItemThree(item: T) : T {
    return item
}