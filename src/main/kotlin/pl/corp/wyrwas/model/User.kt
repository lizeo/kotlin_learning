package pl.corp.wyrwas.model

import pl.corp.wyrwas.filters.ItemFilter
import javax.persistence.*

@Entity(name = "nieuser")
data class User (
        @Id val id : Long = -1L,
        @OneToOne(cascade = [(CascadeType.ALL)]) val personalData : PersonalData = PersonalData(),
        @OneToMany(cascade = [(CascadeType.ALL)])
        @JoinColumn(name = "item_dp")
        val books : List<Book> = ArrayList<Book>(),
        @Transient val items : List<Item> = ArrayList<Item>()
){

    fun addItem(item : Item) : String {

        return "OK"
    }

    fun removeItem(item : Item) : String {

        return "OK"
    }

    fun findItem(itemFilter : ItemFilter) : Item {
        throw UnsupportedOperationException()
    }
}