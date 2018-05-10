package pl.corp.wyrwas.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
data class PersonalData (
        @Id @GeneratedValue val id : Long = -1L,
        var login : String = "",
        var email : String = "",
        var passwordHash : String = ""
)