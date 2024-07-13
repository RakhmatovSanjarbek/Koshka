package cat_devs.uz.koshka.view.profile.profile_pages

import cat_devs.uz.koshka.databinding.PageSavedMusicBinding
import cat_devs.uz.koshka.view.CommonFragment

class SavedMusicPage : CommonFragment<PageSavedMusicBinding>() {
    override fun getMyBinding(): PageSavedMusicBinding {
        return PageSavedMusicBinding.inflate(layoutInflater)
    }

    override fun setup() {
    }
}