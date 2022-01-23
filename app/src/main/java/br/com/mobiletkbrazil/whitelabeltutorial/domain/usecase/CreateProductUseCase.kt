package br.com.mobiletkbrazil.whitelabeltutorial.domain.usecase

import android.net.Uri
import br.com.mobiletkbrazil.whitelabeltutorial.domain.model.Product

interface CreateProductUseCase {

    suspend operator fun invoke(
        description: String,
        price: Double,
        imageUri: Uri
    ): Product
}