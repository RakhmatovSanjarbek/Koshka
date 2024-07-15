package cat_devs.uz.koshka.viewModel.profileScreenViewModel.pager_adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import cat_devs.uz.koshka.view.profile.profile_pages.MusicPage
import cat_devs.uz.koshka.view.profile.profile_pages.PicturePage
import cat_devs.uz.koshka.view.profile.profile_pages.SavedMusicPage
import cat_devs.uz.koshka.view.profile.profile_pages.SavedSourcesPage

class ProfileScreenPagerAdapter(
    fragmentActivity: FragmentActivity
) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int = 4

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> PicturePage()
            1 -> MusicPage()
            2 -> SavedSourcesPage()
            3 -> SavedMusicPage()
            else -> throw IllegalStateException("Unknown position $position")
        }
    }
}