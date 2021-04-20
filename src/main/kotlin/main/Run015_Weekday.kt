package main

import java.time.LocalDateTime

fun main() {
    println(String.format("It's still {0}", LocalDateTime.now().dayOfWeek.name))

}