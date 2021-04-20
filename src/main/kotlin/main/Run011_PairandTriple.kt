package main

/**
 * Entrada: Um id do tipo INT
 * Saída: Dados correspondentes a este ID
 *
 * Síntese:
 *
 * Create a function to receive a int id
 * Use the id to acess the index on the map and get the userName and the userLocation
 * Return a Pair of String?
 * Get the data passing the id to the function
 *
 * Pair: O pair é usado para retornar vário valores de uma função.
 * Ele aceita qualquer TIPO primitivo e os tipos NÂO precisam ser IGUAIS.
 */

fun main(){
    println("=======PAIR 1 ========")

    // Primeira forma de apresentação:
    val (userName, userLocation) = getToMeTwoValues(1)
    println("Username: $userName \nLocation: $userLocation\n")

    println("=======PAIR 2 ========")

    // Segunda forma de apresentação:
    val userData = getToMeTwoValues(2)
    println("Username: ${userData.first} \nLocation: ${userData.second}\n" )

    println("=======TRIPLE========")
    // Primeira forma de apresentação:
    val (userNameTriple, userLocationTriple, userIP) = getToMeThreeValues(0)
    println("Username: $userName \nLocation: $userLocation \nIP: $userIP")
}

fun getToMeTwoValues(id : Int) : Pair<String?, String?> {

    val userNames : Map<Int, String> = mapOf(1 to "Pedro", 2 to "Henrique", 3 to "Rodrigues")
    val userLocations : Map<Int, String> = mapOf(1 to "DF", 2 to "Brasilia", 3 to "GO")

    val userName = userNames[id]
    val userLocation = userLocations[id]

    return Pair(userName, userLocation)
}

fun getToMeThreeValues(id : Int) : Triple<String?, String?, String?> {
    val userNames : Map<Int, String> = mapOf(0 to "Pedro", 1 to "Henrique", 2 to "Rodrigues")
    val userLocations : Map<Int, String> = mapOf(0 to "DF", 1 to "Brasilia", 2 to "GO")
    val userIPs : Array<String> = arrayOf("192.168.0.1", "100.2.5.60", "200.452.1.1")

    val userName = userNames[id]
    val userLocation = userLocations[id]
    val userIP = userIPs[id]

    return Triple(userName, userLocation, userIP)
}