package cat_devs.uz.koshka.view.chat

import cat_devs.uz.koshka.databinding.FragmentChatBinding
import cat_devs.uz.koshka.view.CommonFragment


class ChatScreen :CommonFragment<FragmentChatBinding>(){
    override fun getMyBinding(): FragmentChatBinding {
        return FragmentChatBinding.inflate(layoutInflater)
    }

    override fun setup() {
        // it is on created view
    }

}