package cat_devs.uz.koshka.viewModel.profileScreenViewModel.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import cat_devs.uz.koshka.R
import cat_devs.uz.koshka.databinding.ItemProfileScreenMusicBinding
import cat_devs.uz.koshka.model.dto.MusicContentModel

class MusicAdapter(
    private val isPlay: (Boolean,Int) -> Unit
) : ListAdapter<MusicContentModel, MusicAdapter.MusicViewHolder>(diffUtil) {

    inner class MusicViewHolder(
        private val binding: ItemProfileScreenMusicBinding
    ) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(musicContentModel: MusicContentModel) {
            with(binding) {
                musicContentModel.musicImage?.let {
                    musicImage.setImageResource(it)
                }
                musicTitle.text = musicContentModel.musicTitle
                musicDescription.text = musicContentModel.musicDescription

                btnPlayAndPause.setOnClickListener {
                    val isPlaying = lottie.isAnimating
                    if (isPlaying) {
                        lottie.pauseAnimation()
                        btnPlayAndPause.setImageResource(getPlayIcon())
                    } else {
                        lottie.playAnimation()
                        btnPlayAndPause.setImageResource(getPauseIcon())
                    }
                    isPlay(!isPlaying,getItem(adapterPosition).music!!)
                }
            }
        }

    }

    companion object {
        private val diffUtil = object : DiffUtil.ItemCallback<MusicContentModel>() {
            override fun areItemsTheSame(
                oldItem: MusicContentModel,
                newItem: MusicContentModel
            ): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(
                oldItem: MusicContentModel,
                newItem: MusicContentModel
            ): Boolean {
                return oldItem == newItem
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicViewHolder {
        return MusicViewHolder(
            ItemProfileScreenMusicBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    private fun getPlayIcon() = R.drawable.play_icon
    private fun getPauseIcon() = R.drawable.pause_icon
}