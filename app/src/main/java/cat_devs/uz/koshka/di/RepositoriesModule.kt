package cat_devs.uz.koshka.di

import cat_devs.uz.koshka.model.repository.addRepository.AddRepository
import cat_devs.uz.koshka.model.repository.addRepository.AddRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoriesModule {

    // it is add repository obj.
    @Provides
    @Singleton
    fun provideAddContentRepository(
        //not impl
    ): AddRepository = AddRepositoryImpl()




}