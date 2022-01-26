package br.com.mobiletkbrazil.whitelabeltutorial.domain.usecase

import br.com.mobiletkbrazil.whitelabeltutorial.data.ProductRepository
import br.com.mobiletkbrazil.whitelabeltutorial.domain.model.Product

class GetProductsUseCaseImpl(
    private val repository: ProductRepository
) : GetProductsUseCase {

    override suspend fun invoke(): List<Product> {
        return repository.getProducts()
    }
}