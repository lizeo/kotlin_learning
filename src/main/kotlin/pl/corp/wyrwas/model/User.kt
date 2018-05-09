package pl.corp.wyrwas.model

import org.springframework.data.annotation.Persistent
import org.springframework.data.jpa.repository.EntityGraph
import pl.corp.wyrwas.filters.ItemFilter
import javax.persistence.Embedded
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class User (@Id val id : Long, @Embedded val personalData : PersonalData, @Embedded val items : List<Item>){
    constructor() : this(1L, PersonalData("", "", ""), ArrayList())

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