package main

fun main(){
    println(makeComplement("ATTGC"))
}

fun makeComplement(dna : String) : String {
    var baseComplementar = StringBuilder()
    val bases = turnStringToAraay(dna)

    for (base in bases){
        when(base){
            'A' -> baseComplementar.append('T')
            'T' -> baseComplementar.append('A')
            'C' -> baseComplementar.append('G')
            'G' -> baseComplementar.append('C')
        }
    }

    return baseComplementar.toString()
}

fun turnStringToAraay(dna : String) : CharArray {
    val bases : CharArray = dna.toCharArray()
    return bases
}

// Outra solução proposta fazendo o uso do map

fun makeComplementAnotherOne(dna : String) =
    dna.toCharArray().map { molecule ->
        when (molecule) {
            'A' -> 'T'
            'T' -> 'A'
            'C' -> 'G'
            'G' -> 'C'
            else -> ' '
        }
    }.joinToString(separator = "")