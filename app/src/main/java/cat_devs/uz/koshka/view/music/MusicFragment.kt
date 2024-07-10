package cat_devs.uz.koshka.view.music

import cat_devs.uz.koshka.databinding.FragmentMusicBinding
import cat_devs.uz.koshka.view.CommonFragment

class MusicFragment : CommonFragment<FragmentMusicBinding>() {
    override fun getMyBinding(): FragmentMusicBinding {
        return FragmentMusicBinding.inflate(layoutInflater)
    }

    override fun setup() {

    }
}