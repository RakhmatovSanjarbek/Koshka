package cat_devs.uz.koshka.view.home

import cat_devs.uz.koshka.databinding.FragmentHomeBinding
import cat_devs.uz.koshka.view.CommonFragment

class HomeScreen :CommonFragment<FragmentHomeBinding>(){
    override fun getMyBinding(): FragmentHomeBinding {
        return FragmentHomeBinding.inflate(layoutInflater)
    }

    override fun setup() {
        // it is on created view
    }

}