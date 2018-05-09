package pl.corp.wyrwas.model

import pl.corp.wyrwas.actions.Exchangeable
import pl.corp.wyrwas.actions.Sellable
import java.math.BigDecimal
import javax.persistence.*

@Entity(name = "item")
open class Item (
        @Id @GeneratedValue open val id : Long = -1L,
        open val name : String,
        open val description : String,
        open val color : String,
        @ElementCollection open var opinions : List<String>,
        open val demandPrice : BigDecimal,
        @ManyToOne open val user : User) : Sellable, Exchangeable {

    override val price: BigDecimal
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.

    override fun sell(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun discount(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun takeCommision(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun exchange(offer: Offer): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun sendOffer(item: Exchangeable): Offer {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun reject(item: Offer): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}