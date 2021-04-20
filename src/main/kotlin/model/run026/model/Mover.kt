package model.run026.model

import model.run026.model.workers.Checkable
import model.run026.model.workers.Container

// Quando eu criar uma instância dessa classe o tipo será preenchido nas "lacunas" (<T>)

// Se eu tiro o <T> eu perco a referência para os meus demais <T>

// Agora a classe só aceita tipos que estão conforme meu contrato Checkable!
class Mover<T : Checkable>(
    // Essa lista terá o mesmo tipo que for informado na instância!
    thingsToMove: List<T>,
    val truckHeightInInches: Int = (12 * 12)
) {

    private var thingsLeftInOldPlace = mutableListOf<T>()
    private var thingsInTruck = mutableListOf<Any>()
    private var thingsInNewPlace = mutableListOf<T>()
    private var thingsWhichFailedCheck = mutableListOf<T>()

    init {
        thingsLeftInOldPlace.addAll(thingsToMove)
    }

    //Nested class
    class CheapThing(val name: String) : Checkable {
        override fun checkIsOK(): Boolean = true

        override fun toString(): String {
            return name
        }
    }

    // Posso criar quantas sub classes eu desejar dentro de um mesmo arquivo?
    class BreakableThing(
        val name: String,
        var isBroken: Boolean = false
    ) : Checkable {
        fun smash() {
            isBroken = true
        }

        override fun checkIsOK(): Boolean {
            return !this.isBroken
        }

        override fun toString(): String {
            return name
        }
    }

    /* OLD
    fun moveEverythingToTruck() {
        while (thingsLeftInOldPlace.count() > 0) {
            // O indice não deveria mudar?
            /*
                R: Não, pois quando eu removo item de uma lista e passo para outra, os indices
                são atualizados (refeitos).
             */
            val item = thingsLeftInOldPlace.removeAt(0)
            thingsInTruck.add(item)
            println("Moved your $item to the truck!")
        }
    }
    */

    // NEW
    // Posso ter um container vazio!
    fun moveEverythingToTruck(startingContainer: Container<T>?) {
        var currentContainer = startingContainer

        while (thingsLeftInOldPlace.count() > 0) {
            val item = thingsLeftInOldPlace.removeAt(0)

            if (currentContainer != null) {

                //Checando se o container está cheio
                if (!currentContainer.canAddAnotherItem()) {
                    moveContainerToTruck(currentContainer)
                    currentContainer = currentContainer.getAnother()
                }

                currentContainer.addItem(item)
                println("Packed your $item!")
            } else {

                thingsInTruck.add(item)
                println("Moved your $item to the truck!")
            }
        }

        currentContainer?.let {
            moveContainerToTruck(it)
        }
    }

    /*
        Aqui é onde adiciono o container no meu caminhão
        sendo do tipo container
    */

    private fun moveContainerToTruck(container: Container<T>) {
        thingsInTruck.add(container)
        println("Moved a container with your ${container.contents().toBulletedList()} to the truck!")
    }

    fun moveEverythingIntoNewPlace() {
        val breakableThings = thingsInTruck.filterIsInstance<BreakableThing>()
        // Filtrando todas as instâncias que são Container<T>
        /*
            Lembre-se: O tipo é definido quando você cria uma instância da Classe Mover!
        */
        val containers = thingsInTruck.filterIsInstance<Container<T>>()

        for (container in containers) {
            thingsInTruck.remove(container)

            while (container.canRemoveAnotherItem()) {
                val itemInContainer = container.removeItem()
                println("Unpacked your $itemInContainer!")
                tryToMoveItemIntoNewPlace(itemInContainer)
            }
        }

        // Caso eu não tenha containers
        while (thingsInTruck.count() > 0) {
            val item = thingsInTruck.removeAt(0) as? T

            if (item != null) {
                tryToMoveItemIntoNewPlace(item)
            } else {
                println("Something in the truck was not of the expected generic type: $item")
            }
        }

        /*
        while (thingsInTruck.count() > 0) {
            val item = thingsInTruck.removeAt(0)

            if (item is Container<*>) {
                /*
                  Ele está assumindo que meu item em ThingsInTruck
                  pode ser ANY, inclusive um ANY? Nullable
                */
                val itemInContainer = item.removeItem()
            }
        }
        */
    }

    private fun tryToMoveItemIntoNewPlace(item: T) {
        if (item.checkIsOK()) {
            thingsInNewPlace.add(item)
            println("Moved your $item into your new place!")
        } else {
            thingsWhichFailedCheck.add(item)
            println("Could not move your $item into your new place :[")
        }
    }

    fun finishMove() {
        println("OK, we finished! We were able to move your:${thingsInNewPlace.toBulletedList()}")
        if (thingsWhichFailedCheck.isNotEmpty()) {
            println("But we need to talk about your:${thingsWhichFailedCheck.toBulletedList()}")
        }
    }

    fun <T> List<T>.toBulletedList(): String {
        val separator = "\n - "
        return this.map { "$it" }.joinToString(separator, prefix = separator, postfix = "\n")
    }

}
