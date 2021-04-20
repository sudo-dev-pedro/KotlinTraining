package main

// Propriedades em Interfaces

    interface VehicleProperties {
        val weight: Int // abstract
        val name: String
            // Lembre-se: Isso aqui é um get customizado!
            get() = "Vehicle"
    }

    class Car: VehicleProperties {
        override val weight: Int = 1000
    }

    class Tank: VehicleProperties {
        override val weight: Int
            get() = 10000
    }

fun main(){
    val tank = Tank()

    println(tank.name)
    println(tank.weight)
}
