package br.com.mobiletkbrazil.whitelabeltutorial.domain.usecase

import android.net.Uri
import br.com.mobiletkbrazil.whitelabeltutorial.data.ProductRepository

class UploadProductImageUseCaseImpl(
    private val repository: ProductRepository
) : UploadProductImageUseCase {

    override suspend fun invoke(imageUri: Uri): String {
        return repository.uploadProductImage(imageUri)
    }
}