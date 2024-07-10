package cat_devs.uz.koshka.view.add

import androidx.fragment.app.viewModels
import cat_devs.uz.koshka.databinding.FragmentAddBinding
import cat_devs.uz.koshka.view.CommonFragment
import cat_devs.uz.koshka.viewModel.addScreenViewModel.AddViewModel



class AddScreen : CommonFragment<FragmentAddBinding>() {

    private val viewModel: AddViewModel by viewModels()

    override fun getMyBinding(): FragmentAddBinding {
        return FragmentAddBinding.inflate(layoutInflater)
    }

    override fun setup() {
        // it is on created view
        //viewModel.sendPhoto()
    }
}
