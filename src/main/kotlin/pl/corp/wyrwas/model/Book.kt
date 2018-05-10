package pl.corp.wyrwas.model

import java.math.BigDecimal
import javax.persistence.*

@Entity
data class Book (
        val year : Int = 2018,
        @Id @GeneratedValue override val id : Long = -1L,
        override val name: String = "",
        override val description: String = "",
        override val color: String = "",
        @ElementCollection override var opinions: List<String> = ArrayList(),
        override val demandPrice: BigDecimal = BigDecimal.ZERO,
        @ManyToOne override val user: User = User()
) : Item(id, name, description, color, opinions, demandPrice, user)