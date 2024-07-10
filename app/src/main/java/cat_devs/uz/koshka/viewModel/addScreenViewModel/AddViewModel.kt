package cat_devs.uz.koshka.viewModel.addScreenViewModel

import androidx.lifecycle.ViewModel
import cat_devs.uz.koshka.viewModel.useCases.addScreenUseCase.SendPhotoUseCase
import dagger.hilt.android.lifecycle.HiltViewModel

import javax.inject.Inject

@HiltViewModel
class AddViewModel @Inject constructor(
    private val addSendPhotoUseCase: SendPhotoUseCase,


) : ViewModel() {

    fun sendPhoto(){
        addSendPhotoUseCase.sendPhoto()
    }

}