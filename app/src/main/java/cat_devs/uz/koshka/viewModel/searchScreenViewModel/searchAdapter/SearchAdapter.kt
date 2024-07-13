package cat_devs.uz.koshka.viewModel.searchScreenViewModel.searchAdapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import cat_devs.uz.koshka.databinding.ItemPhotoSearchBinding
import cat_devs.uz.koshka.model.repository.searchRepository.dto.SearchModel

class SearchAdapter(
    private val onItemClicked: (SearchModel) -> Unit
) : RecyclerView.Adapter<SearchAdapter.SearchViewHolder>() {

    private val dataList = mutableListOf<SearchModel>()

    fun loadData(newData: List<SearchModel>) {
        dataList.clear()
        dataList.addAll(newData)
        notifyDataSetChanged()
    }

    inner class SearchViewHolder(
        private val binding: ItemPhotoSearchBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: SearchModel) = with(binding) {

            tvUserName.text = item.userName
            item.photo?.let { ivPhoto.setImageResource(it) }
            tvPhotoName.text = item.photoName

            root.setOnClickListener {
                onItemClicked(item)
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchViewHolder {
        return SearchViewHolder(
            ItemPhotoSearchBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: SearchViewHolder, position: Int) {
        holder.bind(dataList[position])
    }
}