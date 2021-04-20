package main

// Exemplo de algo que é bem usado com DSL
class MakeText {
    fun a() {
        println("A")
    }
    fun b() {
        println("B")
    }
    fun c() {
        println("C")
    }
}

fun MakeText.chain(block: MakeText.() -> Unit): MakeText {
    block()
    return this
}

fun main() {
    val makeText = MakeText()

    makeText.chain {
        a()
        b()
        c()
    }
}