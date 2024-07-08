package cat_devs.uz.koshka.view.search


import cat_devs.uz.koshka.databinding.FragmentSearchBinding
import cat_devs.uz.koshka.view.CommonFragment

class SearchScreen : CommonFragment<FragmentSearchBinding>() {
    override fun getMyBinding(): FragmentSearchBinding {
        return FragmentSearchBinding.inflate(layoutInflater)
    }

    override fun setup() {
        // it is on created view

    }

}