package br.com.mobiletkbrazil.whitelabeltutorial.domain.model

data class Product(
    val id: String = "",
    val description: String = "",
    val price: Double = 0.0,
    val imageUrl: String = ""
)