package main

// Exemplo de fun com PARÂMETRO default definido.
    enum class Direction {
        LEFT, RIGHT
    }

    interface OptionalDirectionalVehicle {

        fun turn(direction: Direction = Direction.LEFT)
    }

// Exemplo de uma fun dentro de uma Interface com implementação default
    interface SpaceVehicle {
        fun accelerate()
        /*
        Exemplo de uma fun pertencente a uma interface com uma IMPLEMENTAÇÃO default. SIM, isso é permitido!
        E sim, você ainda pode fazer o Override normalmente!
        */
        fun stop() {
            println("Whoa, slow down!")
        }
    }

// Exemplo de Interface com implementação default de uma fun e o Override da fun

    /*
        Quando vou realizar a implementação da fun, eu posso fazer o uso da palavra resevada SUPER.
        Fazendo o seu uso eu posso realizar o Override e ainda usar a implementação default daquela fun.
    */
    class Starship: SpaceVehicle {
        override fun accelerate() {
            println("Warp factor 9 please!")
        }

        override fun stop() {
            super.stop()
            println("That kind of hurt!")
        }
    }

