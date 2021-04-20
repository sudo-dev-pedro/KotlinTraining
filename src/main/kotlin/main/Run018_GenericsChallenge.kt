package main

fun main() {
    /**
     * Create a function named printItem that prints out a generic parameter.
     * Call the parameter "item".
     */

    fun <T> printItem(item: T) {
        println("My item is: $item")
    }

    printItem("Abc")

    /**
     * Create a function named printList that takes a generic list as a parameter.
     * and prints out each item
     */

    fun <T> printList(list: List<T>) {
        for (item in list) {
            println(item)
        }
    }

    val list = listOf(1, 2, 3, 5, 8, 13, 21, 34)
    printList(list)
}