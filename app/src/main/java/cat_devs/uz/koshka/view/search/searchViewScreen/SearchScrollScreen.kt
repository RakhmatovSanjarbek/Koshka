package cat_devs.uz.koshka.view.search.searchViewScreen

import cat_devs.uz.koshka.R
import cat_devs.uz.koshka.databinding.SearchScrollRolicBinding
import cat_devs.uz.koshka.model.repository.searchRepository.dto.SearchScrollModel
import cat_devs.uz.koshka.view.CommonFragment
import cat_devs.uz.koshka.viewModel.searchScreenViewModel.searchAdapter.SearchScrollAdapter

class SearchScrollScreen : CommonFragment<SearchScrollRolicBinding>() {
    override fun getMyBinding(): SearchScrollRolicBinding {
        return SearchScrollRolicBinding.inflate(layoutInflater)
    }

    private lateinit var searchScrollAdapter: SearchScrollAdapter

    override fun setup() {
        val dataList = listOf(
            SearchScrollModel("elyor_xalilov", R.drawable.download),
            SearchScrollModel("elyor_xalilov", R.drawable.download),
            SearchScrollModel("elyor_xalilov", R.drawable.download),
            SearchScrollModel("elyor_xalilov", R.drawable.download),
            SearchScrollModel("elyor_xalilov", R.drawable.download),
            SearchScrollModel("elyor_xalilov", R.drawable.download),
            SearchScrollModel("elyor_xalilov", R.drawable.download),
            SearchScrollModel("elyor_xalilov", R.drawable.download),
            SearchScrollModel("elyor_xalilov", R.drawable.download),
            SearchScrollModel("elyor_xalilov", R.drawable.download),
            SearchScrollModel("elyor_xalilov", R.drawable.download),
            SearchScrollModel("elyor_xalilov", R.drawable.download),
            SearchScrollModel("elyor_xalilov", R.drawable.download),
            SearchScrollModel("elyor_xalilov", R.drawable.download),
            SearchScrollModel("elyor_xalilov", R.drawable.download),
            SearchScrollModel("elyor_xalilov", R.drawable.download),
        )

        with(binding) {
            searchScrollAdapter = SearchScrollAdapter()
            rvSearchScroll.adapter = searchScrollAdapter
            searchScrollAdapter.loadData(dataList)
        }
    }
}