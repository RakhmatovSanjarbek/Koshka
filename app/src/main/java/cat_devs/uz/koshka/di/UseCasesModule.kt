package cat_devs.uz.koshka.di

import cat_devs.uz.koshka.model.repository.addRepository.AddRepository
import cat_devs.uz.koshka.viewModel.useCases.addScreenUseCase.SendPhotoUseCase
import cat_devs.uz.koshka.viewModel.useCases.addScreenUseCase.SendPhotoUseCaseImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
object UseCasesModule {

    @Provides
    fun provideSendPhotoUseCase(
        addRepository: AddRepository
    ): SendPhotoUseCase = SendPhotoUseCaseImpl(addRepository)


}