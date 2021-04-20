package main

import model.run030.SpaceCraft
import model.run030.SpacePort

fun main(args: Array<String>) {
    val spaceCraft = SpaceCraft()
    SpacePort.investigateSpace(spaceCraft)
}