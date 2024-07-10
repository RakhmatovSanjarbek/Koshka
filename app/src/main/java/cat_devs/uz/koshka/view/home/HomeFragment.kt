package cat_devs.uz.koshka.view.home

import cat_devs.uz.koshka.databinding.FragmentHomeBinding
import cat_devs.uz.koshka.view.CommonFragment

class HomeFragment : CommonFragment<FragmentHomeBinding>() {
    override fun getMyBinding(): FragmentHomeBinding {
        return FragmentHomeBinding.inflate(layoutInflater)
    }

    override fun setup() {

    }
}