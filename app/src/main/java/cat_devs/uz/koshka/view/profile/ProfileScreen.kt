package cat_devs.uz.koshka.view.profile

import cat_devs.uz.koshka.databinding.FragmentProfileBinding
import cat_devs.uz.koshka.view.CommonFragment

class ProfileScreen : CommonFragment<FragmentProfileBinding>() {
    override fun getMyBinding(): FragmentProfileBinding {
        return FragmentProfileBinding.inflate(layoutInflater)
    }

    override fun setup() {
        // it is on created view
    }
}