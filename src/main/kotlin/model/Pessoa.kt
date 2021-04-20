package model

class Pessoa (val nome : String, val idade : Int) {
    // Propriedade dados
    val dados
        // Getter customizado
        get() = "$nome $idade"
}