package cat_devs.uz.koshka.viewModel.profileScreenViewModel.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.graphics.luminance
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import cat_devs.uz.koshka.databinding.ItemProfileScreenPictureAndSaveBinding
import cat_devs.uz.koshka.model.dto.PictureAndSaveContentModel

class PictureAdapter :
    ListAdapter<PictureAndSaveContentModel, PictureAdapter.PictureViewHolder>(diffUtil) {

    inner class PictureViewHolder(
        private val binding: ItemProfileScreenPictureAndSaveBinding
    ) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(pictureAndSaveContentModel: PictureAndSaveContentModel) {
            with(binding) {
                if (pictureAndSaveContentModel.type == "music") {
                    pictureAndSaveContentModel.image?.let {
                        imageView.setImageResource(it)
                    }
                    musicTitle.text = pictureAndSaveContentModel.title
                    earphoneIcon.visibility= View.VISIBLE
                    musicTitle.visibility=View.VISIBLE
                }else{
                    pictureAndSaveContentModel.image?.let {
                        imageView.setImageResource(it)
                    }
                    earphoneIcon.visibility= View.GONE
                    musicTitle.visibility=View.GONE
                }
            }
        }

    }

    companion object {
        private val diffUtil = object : DiffUtil.ItemCallback<PictureAndSaveContentModel>() {
            override fun areItemsTheSame(
                oldItem: PictureAndSaveContentModel,
                newItem: PictureAndSaveContentModel
            ): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(
                oldItem: PictureAndSaveContentModel,
                newItem: PictureAndSaveContentModel
            ): Boolean {
                return oldItem == newItem
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PictureViewHolder {
        return PictureViewHolder(
            ItemProfileScreenPictureAndSaveBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: PictureViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}