package cat_devs.uz.koshka.viewModel.searchScreenViewModel.searchAdapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import cat_devs.uz.koshka.databinding.ItemSearchAccountPhotoLikeBinding
import cat_devs.uz.koshka.model.repository.searchRepository.dto.SearchScrollModel

class SearchScrollAdapter : RecyclerView.Adapter<SearchScrollAdapter.SearchScrollViewHolder>() {

    private val dataList = mutableListOf<SearchScrollModel>()

    fun loadData(newData: List<SearchScrollModel>) {
        dataList.clear()
        dataList.addAll(newData)
        notifyDataSetChanged()
    }

    inner class SearchScrollViewHolder(
        private val bindingVH: ItemSearchAccountPhotoLikeBinding
    ) : RecyclerView.ViewHolder(bindingVH.root) {
        fun bind(item: SearchScrollModel) = with(bindingVH) {
            tvAccountName.text = item.accountName
            item.onePhoto?.let { ivOnePhoto.setImageResource(it) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchScrollViewHolder {
        return SearchScrollViewHolder(
            ItemSearchAccountPhotoLikeBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: SearchScrollViewHolder, position: Int) {
        holder.bind(dataList[position])
    }
}