package cat_devs.uz.koshka.view.profile.profile_pages

import android.media.MediaPlayer
import cat_devs.uz.koshka.databinding.PageMusicBinding
import cat_devs.uz.koshka.view.CommonFragment
import cat_devs.uz.koshka.viewModel.profileScreenViewModel.MyList
import cat_devs.uz.koshka.viewModel.profileScreenViewModel.adapter.MusicAdapter

class MusicPage : CommonFragment<PageMusicBinding>() {

    private lateinit var mediaPlayer: MediaPlayer
    private val musicAdapter: MusicAdapter by lazy { MusicAdapter(::isPlay) }

    private fun isPlay(isPlay: Boolean, musicResourceId: Int) {
        if (isPlay) {
            playMusic(musicResourceId)
        } else {
            pauseMusic()
        }
    }

    override fun getMyBinding(): PageMusicBinding {
        return PageMusicBinding.inflate(layoutInflater)
    }

    override fun setup() = with(binding) {
        val rv = pMusicRecyclerView
        rv.adapter = musicAdapter
        musicAdapter.submitList(MyList.musicList)
    }

    private fun playMusic(musicResourceId: Int) {
        if (::mediaPlayer.isInitialized) {
            mediaPlayer.release()
        }
        mediaPlayer = MediaPlayer.create(requireContext(), musicResourceId)
        mediaPlayer.start()
    }

    private fun pauseMusic() {
        if (::mediaPlayer.isInitialized && mediaPlayer.isPlaying) {
            mediaPlayer.pause()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        if (::mediaPlayer.isInitialized) {
            mediaPlayer.release()
        }
    }
}