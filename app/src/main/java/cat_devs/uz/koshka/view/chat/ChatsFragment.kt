package cat_devs.uz.koshka.view.chat

import androidx.navigation.fragment.findNavController
import cat_devs.uz.koshka.R
import cat_devs.uz.koshka.databinding.FragmentChatsBinding
import cat_devs.uz.koshka.model.dto.ChatModel
import cat_devs.uz.koshka.view.CommonFragment
import cat_devs.uz.koshka.viewModel.chatScreenViewModel.chatAdapter.UserChatAdapter


class ChatsFragment : CommonFragment<FragmentChatsBinding>() {

    // prosta
    private val list = mutableListOf<ChatModel>()

    private val userChatAdapter by lazy {
        UserChatAdapter()
    }

    override fun getMyBinding(): FragmentChatsBinding {
        return FragmentChatsBinding.inflate(layoutInflater)
    }


    override fun setup() = with(binding) {

        rvChatFragment.adapter = userChatAdapter

        chatToolbar.setNavigationOnClickListener {
            findNavController().navigate(R.id.action_chatsFragment_to_navigation_chat)
        }

        send.setOnClickListener {
            val message = " " + etChat.text.toString() + " "
            val chatModel = ChatModel(message)
            list.add(chatModel)
            userChatAdapter.submitList(list.toList())
            etChat.text.clear()
        }


    }

}