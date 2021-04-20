package main

import model.run027.worker.Comparable

fun main() {

    //TIPOS COVARIANTES

    // Passo uma lista de INTS para uma variavél imutável
    val ints = listOf(1,2,3,4)
    /*
    Essa lista de INTS coloco dentro de uma Lista do tipo NUMBER.
    Na definição de List eu tenho a palavra reservada OUT, ou seja,
    o meu tipo genérico definido será o mesmo a ser retornado na minha lista.

    Em List<T> eu tenho o uso do OUT.

    Nesse caso o Number é aceitado, pois tudo aquilo que é INT é também um Number.

    Int (+ específico) está dentro de Number (+ generalista)
    */

    val numbers: List<Number> = ints

    /*
    O contrário não ocorre abaixo, pois o que há dentro da variável numbers pode ser outro tipo
    além de Int.
    Você estaria a receber algo generalista em algo específico.
    */

    //val moreInts: List<Int> = numbers

    /*
    Em MutableList<T> não tenho IN e nem OUT sendo usado.

    Nesse caso, o tipo de entrada e o tipo de retorno, precisam ser o MESMO!
    */
    //val mutableInts = mutableListOf(1, 2, 3)
    // Pede um Number e acha um INT
    //val mutableNumbers: MutableList<Number> = mutableInts

    // O tipo genérico definido é Number, então ele vai aceitar Int, Double, Float e outros sub.
    fun compare(comparator: Comparable<Number>) {
        val int: Int = 1
        comparator.compareTo(int)

        val float: Float = 1.0f
        comparator.compareTo(float)

        /*
            Ele aceita, mas é contraintuitivo, tendo em vista que comparator é um NUMBER
            e intComparable é do tipo Comparable<Int>, ou seja,
            é um Number sendo colocado dentro de um Int.
        */
        val intComparable: Comparable<Int> = comparator

        // Compila.
        intComparable.compareTo(int)
        // Não compila, pois você deixou específico o tipo do Comparable
        //intComparable.compareTo(float)

    }
}