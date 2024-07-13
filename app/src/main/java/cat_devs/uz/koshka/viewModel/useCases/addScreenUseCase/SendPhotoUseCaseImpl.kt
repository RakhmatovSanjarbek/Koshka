package cat_devs.uz.koshka.viewModel.useCases.addScreenUseCase

import cat_devs.uz.koshka.model.repository.addRepository.AddRepository
import javax.inject.Inject

class SendPhotoUseCaseImpl @Inject constructor(
    private val addRepository: AddRepository
) : SendPhotoUseCase {
    override fun sendPhoto() {
        addRepository.sendPhoto()
        return // not impl
    }
}