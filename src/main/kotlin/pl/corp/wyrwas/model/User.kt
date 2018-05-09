package pl.corp.wyrwas.model

import org.springframework.data.annotation.Persistent
import org.springframework.data.jpa.repository.EntityGraph
import pl.corp.wyrwas.filters.ItemFilter
import javax.persistence.*

@Entity
data class User (
        @Id val id : Long = -1L,
        @OneToOne(cascade = [(CascadeType.ALL)]) val personalData : PersonalData = PersonalData(),
        @OneToMany(cascade = [(CascadeType.ALL)])
        @JoinColumn(name = "item_dp")
        val items : List<Item> = ArrayList<Book>()
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