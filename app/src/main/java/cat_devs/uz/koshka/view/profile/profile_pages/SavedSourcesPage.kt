package cat_devs.uz.koshka.view.profile.profile_pages

import cat_devs.uz.koshka.databinding.PageSavedSourcesBinding
import cat_devs.uz.koshka.view.CommonFragment
import cat_devs.uz.koshka.viewModel.profileScreenViewModel.MyList
import cat_devs.uz.koshka.viewModel.profileScreenViewModel.adapter.PictureAdapter

class SavedSourcesPage : CommonFragment<PageSavedSourcesBinding>() {

    private val pictureAdapter by lazy { PictureAdapter() }

    override fun getMyBinding(): PageSavedSourcesBinding {
        return PageSavedSourcesBinding.inflate(layoutInflater)
    }

    override fun setup() = with(binding) {
        val rv = pSavedSourcesRv
        rv.adapter = pictureAdapter
        pictureAdapter.submitList(MyList.saveList)
    }
}