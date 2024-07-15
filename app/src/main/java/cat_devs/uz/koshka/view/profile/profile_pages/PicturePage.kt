package cat_devs.uz.koshka.view.profile.profile_pages

import cat_devs.uz.koshka.databinding.PagePictureBinding
import cat_devs.uz.koshka.view.CommonFragment
import cat_devs.uz.koshka.viewModel.profileScreenViewModel.MyList
import cat_devs.uz.koshka.viewModel.profileScreenViewModel.adapter.PictureAdapter

class PicturePage : CommonFragment<PagePictureBinding>() {

    private val pictureAdapter by lazy { PictureAdapter() }

    override fun getMyBinding(): PagePictureBinding {
        return PagePictureBinding.inflate(layoutInflater)
    }

    override fun setup() {
        binding.ppRecyclerView.adapter = pictureAdapter
        pictureAdapter.submitList(MyList.pictureList)
    }
}