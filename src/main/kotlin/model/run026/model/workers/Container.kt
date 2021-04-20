package model.run026.model.workers

import model.run026.model.Mover
import model.run026.model.Mover.BreakableThing

//
interface Container<T> {
    //
    fun canAddAnotherItem(): Boolean
    /*
        O meu tipo genérico só pode ser usado agora APENAS como o retorno de uma fun!
    */
    fun addItem(item: T)
    //
    fun canRemoveAnotherItem(): Boolean
    fun removeItem(): T
    /*
        Fazendo o uso do IN ou OUT, aqui não é apontado nenhum erro.
    */
    fun getAnother(): Container<T>
    //
    fun contents(): List<T>
}

// Uma nova classe com um tipo genérico já definido!
class CardboardBox: Container<BreakableThing> {
    // Lista de items privada
    private var items = mutableListOf<BreakableThing>()

    override fun contents(): List<BreakableThing> {
        /*
          Por padrão essa fun quando implementada, precisa retorna uma Lista do tipo generico <T>,
          mas nesse caso, o meu tipo genérico já é conhecido: BreakableThing. Por isso o override da fun
        */
        return items.toList()
    }

    // Só posso ter duas coisas em cada caixa
    override fun canAddAnotherItem(): Boolean {
        return items.count() < 2
    }

    override fun addItem(item: BreakableThing) {
        // Adição de itens na minha lista privada
        items.add(item)
    }

    override fun canRemoveAnotherItem(): Boolean {
        // Checa se itens podem ser removidos.
        return items.count() > 0
    }

    override fun removeItem(): BreakableThing {
        // Remoçao do último item
        val lastItem = items.last()
        items.remove(lastItem)
        return lastItem
    }

    override fun getAnother(): Container<BreakableThing> {
        // Factory para gerar um novo CardboardBox
        return CardboardBox()
    }
}
