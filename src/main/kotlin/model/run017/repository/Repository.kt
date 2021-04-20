package model.run017.repository

/*
Essa é uma definição de interface em que preciso receber um TIPO, pode ser qualquer um!
O uso da palavra T é apenas uma convenção!
 */
interface Repository<T> {
    fun addItem(item: T)
    fun deleteItem(item: T)
}