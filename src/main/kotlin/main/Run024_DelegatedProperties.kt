package main

import kotlin.properties.Delegates

data class Course(var className: String)

/* Observable:
     Uma variável é observado e seu valor pode ser alterado.
     É preciso saber o valor inicial e há 3 parametros para a lambda:
     property, oldValue, newValue
*/

var room : String by Delegates.observable("No room") {
    property, oldValue, newValue ->
    println("O antigo valor é: $oldValue")
    println("O novo valor é: $newValue")
}

/* Lazy:
    Será criada assim que eu fizer o primeiro uso dela!
    Fica cacheado.
*/

val scienceCourse: Course by lazy {
    Course("Science")
}

/* Mapped
    Os dados são recebidos em Map
 */
data class Room(val map: Map<String, Any?>) {
    val number: String by map
    val beds: String by map
}

fun main() {
    val place = Room(mapOf("room" to 123, "Andar" to "Ms. Price"))
}