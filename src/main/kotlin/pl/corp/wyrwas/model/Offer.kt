package pl.corp.wyrwas.model

import java.math.BigDecimal

data class Offer (val item : Item, val owner : User, val client : User, val offer : BigDecimal)