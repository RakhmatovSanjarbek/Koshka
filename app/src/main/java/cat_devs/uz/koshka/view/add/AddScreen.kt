package cat_devs.uz.koshka.view.add

import cat_devs.uz.koshka.databinding.FragmentAddBinding
import cat_devs.uz.koshka.view.CommonFragment

class AddScreen : CommonFragment<FragmentAddBinding>() {
    override fun getMyBinding(): FragmentAddBinding {
        return FragmentAddBinding.inflate(layoutInflater)
    }

    override fun setup() {
        // it is on created view
    }
}
