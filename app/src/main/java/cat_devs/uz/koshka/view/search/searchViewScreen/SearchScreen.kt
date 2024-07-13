package cat_devs.uz.koshka.view.search.searchViewScreen


import android.view.View
import android.widget.EditText
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.navigation.fragment.findNavController
import cat_devs.uz.koshka.R
import cat_devs.uz.koshka.databinding.FragmentSearchBinding
import cat_devs.uz.koshka.model.repository.searchRepository.dto.SearchModel
import cat_devs.uz.koshka.view.CommonFragment
import cat_devs.uz.koshka.viewModel.searchScreenViewModel.searchAdapter.SearchAdapter

class SearchScreen : CommonFragment<FragmentSearchBinding>() {

    override fun getMyBinding(): FragmentSearchBinding {
        return FragmentSearchBinding.inflate(layoutInflater)
    }

    private lateinit var searchAdapter: SearchAdapter

    override fun setup() {

        val dataList = listOf(
            SearchModel(R.drawable.download, "Elyor Xalilov", "My photo"),
            SearchModel(R.drawable.download, "Elyor Xalilov", "My photo"),
            SearchModel(R.drawable.download, "Elyor Xalilov", "My photo"),
            SearchModel(R.drawable.download, "Elyor Xalilov", "My photo"),
            SearchModel(R.drawable.download, "Elyor Xalilov", "My photo"),
            SearchModel(R.drawable.download, "Elyor Xalilov", "My photo"),
            SearchModel(R.drawable.download, "Elyor Xalilov", "My photo"),
            SearchModel(R.drawable.download, "Elyor Xalilov", "My photo"),
            SearchModel(R.drawable.download, "Elyor Xalilov", "My photo"),
            SearchModel(R.drawable.download, "Elyor Xalilov", "My photo"),
            SearchModel(R.drawable.download, "Elyor Xalilov", "My photo"),
        )
        with(binding) {
            searchAdapter = SearchAdapter {
                findNavController().navigate(R.id.action_navigation_search_to_searchScrollScreen)
            }
            rvSearch.adapter = searchAdapter
            searchAdapter.loadData(dataList)
        }
        initSearchView()
    }


    private fun EditText.hideKeyboard() {
        WindowInsetsControllerCompat(
            requireActivity().window,
            this
        ).hide(WindowInsetsCompat.Type.ime())
    }

//    fun EditText.showKeyboard() {
//        WindowInsetsControllerCompat(requireActivity().window, this).show(WindowInsetsCompat.Type.ime())
//        requestFocus()
//    }

    private fun initSearchView() = with(binding) {
//        if (!etSearch.text.isNotEmpty()) {
//            ivClose.isVisible = true
//        } else {
//            ivClose.isVisible = false
//        }
        ivClose.setOnClickListener {
            etSearch.text.clear()
            etSearch.hideKeyboard()
        }
    }

    private fun View.visible() {
        visibility = View.VISIBLE
    }

    private fun View.gone() {
        visibility = View.GONE
    }

    private fun View.invisible() {
        visibility = View.INVISIBLE
    }
}