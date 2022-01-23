package br.com.mobiletkbrazil.whitelabeltutorial.data

import android.net.Uri
import br.com.mobiletkbrazil.whitelabeltutorial.domain.model.Product

interface ProductDataSource {

    suspend fun getProducts(): List<Product>

    suspend fun uploadProductImage(imageUri: Uri): String

    suspend fun createProduct(product: Product): Product
}