package cat_devs.uz.koshka.view.profile

import cat_devs.uz.koshka.R
import cat_devs.uz.koshka.databinding.FragmentProfileBinding
import cat_devs.uz.koshka.view.CommonFragment
import cat_devs.uz.koshka.viewModel.profileScreenViewModel.pager_adapter.ProfileScreenPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator

class ProfileScreen : CommonFragment<FragmentProfileBinding>() {

    private lateinit var pagerAdapter: ProfileScreenPagerAdapter

    override fun getMyBinding(): FragmentProfileBinding {
        return FragmentProfileBinding.inflate(layoutInflater)
    }

    override fun setup(): Unit = with(binding) {
        setUpTabLayout()
    }

    private fun setUpTabLayout() = with(binding) {
        val tab = ppTabLayout
        val viewPager = ppViewPager
        pagerAdapter = ProfileScreenPagerAdapter(requireActivity())
        viewPager.adapter = pagerAdapter
        TabLayoutMediator(tab, viewPager) { tabLayout, position ->
            when (position) {
                0 -> {
                    tabLayout.setIcon(R.drawable.picture_icon)
                    tabLayout.setContentDescription("Pictures")
                }

                1 -> {
                    tabLayout.setIcon(R.drawable.music_icon)
                    tabLayout.setContentDescription("Musics")
                }

                2 -> {
                    tabLayout.setIcon(R.drawable.save_icon)
                    tabLayout.setContentDescription("Saved")
                }

                3 -> {
                    tabLayout.setIcon(R.drawable.ic_save_music)
                    tabLayout.setContentDescription("Saved Musics")
                }
            }
        }.attach()
    }
}