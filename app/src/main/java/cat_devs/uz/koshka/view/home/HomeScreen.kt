package cat_devs.uz.koshka.view.home

import cat_devs.uz.koshka.databinding.FragmentHomeScreenBinding
import cat_devs.uz.koshka.view.CommonFragment
import cat_devs.uz.koshka.view.home.adapter.HomePagerAdapter
import com.google.android.material.tabs.TabLayoutMediator

class HomeScreen : CommonFragment<FragmentHomeScreenBinding>() {

    private lateinit var pagerAdapter: HomePagerAdapter

    override fun getMyBinding(): FragmentHomeScreenBinding {
        return FragmentHomeScreenBinding.inflate(layoutInflater)
    }

    override fun setup() = with(binding) {
        pagerAdapter = HomePagerAdapter(requireActivity())
        viewPager.adapter = pagerAdapter
        TabLayoutMediator(tab, viewPager) { tab, position ->
            when (position) {
                0 -> tab.text = "Home"
                1 -> tab.text = "Music"
                else -> throw IllegalStateException("Unknown position $position")
            }
        }.attach()
    }
}