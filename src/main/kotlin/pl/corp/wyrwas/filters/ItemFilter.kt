package pl.corp.wyrwas.filters

import java.math.BigDecimal

data class ItemFilter (
        val name : String?,
        val description : String?,
        val minPrice : BigDecimal?,
        val maxPrice : BigDecimal?
)