package pl.corp.wyrwas.actions

import java.math.BigDecimal

interface Sellable {

    val price : BigDecimal

    fun sell() : String
    fun discount() : String
    fun takeCommision() : String

}
