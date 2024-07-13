package cat_devs.uz.koshka.view.profile

import android.media.MediaPlayer
import android.view.View
import cat_devs.uz.koshka.databinding.FragmentProfileBinding
import cat_devs.uz.koshka.view.CommonFragment
import cat_devs.uz.koshka.viewModel.profileScreenViewModel.MyList
import cat_devs.uz.koshka.viewModel.profileScreenViewModel.adapter.MusicAdapter
import cat_devs.uz.koshka.viewModel.profileScreenViewModel.adapter.PictureAdapter

class ProfileScreen : CommonFragment<FragmentProfileBinding>() {

    private lateinit var mediaPlayer: MediaPlayer
    private val pictureAdapter by lazy { PictureAdapter() }
    private val pictureAdapter1 by lazy { PictureAdapter() }
    private val musicAdapter by lazy { MusicAdapter(::isPlay) }
    private fun isPlay(isPlaying: Boolean, musicResourceId: Int) {
        if (isPlaying) {
            playMusic(musicResourceId)
        } else {
            pauseMusic()
        }
    }

    override fun getMyBinding(): FragmentProfileBinding {
        return FragmentProfileBinding.inflate(layoutInflater)
    }

    override fun setup() = with(binding) {

        categoryPicture.adapter = pictureAdapter
        pictureAdapter.submitList(MyList.pictureList)

        categoryMusic.adapter = musicAdapter
        musicAdapter.submitList(MyList.musicList)

        categorySave.adapter = pictureAdapter1
        pictureAdapter1.submitList(MyList.saveList)

        btnPictureCategory.setOnClickListener {
            categoryPicture.visibility = View.VISIBLE
            categoryMusic.visibility = View.GONE
            categorySave.visibility = View.GONE
        }
        btnMusicCategory.setOnClickListener {
            categoryPicture.visibility = View.GONE
            categoryMusic.visibility = View.VISIBLE
            categorySave.visibility = View.GONE
        }
        btnSaveCategory.setOnClickListener {
            categoryPicture.visibility = View.GONE
            categoryMusic.visibility = View.GONE
            categorySave.visibility = View.VISIBLE
        }
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