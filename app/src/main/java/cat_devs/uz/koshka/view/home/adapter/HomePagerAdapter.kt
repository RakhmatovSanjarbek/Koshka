package cat_devs.uz.koshka.view.home.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import cat_devs.uz.koshka.view.home.HomeFragment
import cat_devs.uz.koshka.view.music.MusicFragment

class HomePagerAdapter(
    fragmentActivity: FragmentActivity
) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> HomeFragment()
            1 -> MusicFragment()
            else -> throw IllegalStateException("Unknown position $position")
        }
    }
}