package main

fun main(){
    println("===Meu MutableMap===")
    var myMutableMapData : MutableMap<Int, String> = mutableMapOf()

    addElementsToMutableMap(96, "Pedro", myMutableMapData)
    addElementsToMutableMap(10, "Henrique", myMutableMapData)

    println(myMutableMapData)

    //Criando um simples array de Strings
    val meuArrayTeste : Array<String> = arrayOf("Atraso", "Bombom", "Caraca", "Doidera", "Estrondo")

    println("\n")
    println("===Meu Array===")
    for (i in meuArrayTeste.indices){
        println(meuArrayTeste[i])
    }

    println("\n")
    println("===Meu Array de Valores Default===")

    // Posso fazer uso de um lambda para criar arrays com valores default!
    val meuArrayValoresDefault: Array<Int> = Array(5) { 12 }
    for (i in meuArrayValoresDefault.indices){
        println(meuArrayValoresDefault[i])
    }
}

// Qual a diferença de um MutableMap para um HashMap?
fun addElementsToMutableMap(key : Int, value : String, mutableMap : MutableMap<Int,String>){
    mutableMap.put(key, value)
}