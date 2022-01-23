package br.com.mobiletkbrazil.whitelabeltutorial.domain.usecase

import br.com.mobiletkbrazil.whitelabeltutorial.domain.model.Product

interface GetProductsUseCase {

    suspend operator fun invoke(): List<Product>
}