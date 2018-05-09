package pl.corp.wyrwas.actions

import pl.corp.wyrwas.model.Offer

interface Exchangeable {

    fun exchange(offer : Offer) : String
    fun sendOffer(item : Exchangeable) : Offer
    fun reject(item : Offer) : String

}