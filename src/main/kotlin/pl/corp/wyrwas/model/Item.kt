package pl.corp.wyrwas.model

import pl.corp.wyrwas.actions.Exchangeable
import pl.corp.wyrwas.actions.Sellable
import java.math.BigDecimal


abstract class Item (
        val name : String,
        val description : String,
        val color : String,
        var opinions : List<String>,
        val demandPrice : BigDecimal) : Sellable, Exchangeable {

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