package cat_devs.uz.koshka.viewModel.chatScreenViewModel.chatAdapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import cat_devs.uz.koshka.databinding.ItemChatBinding
import cat_devs.uz.koshka.model.dto.ChatModel

class UserChatAdapter : ListAdapter<ChatModel, UserChatAdapter.UserChatVH>(diffUtil) {


    inner class UserChatVH(private val bindingChat: ItemChatBinding) :
        RecyclerView.ViewHolder(bindingChat.root) {

        fun bind(chatModel: ChatModel) {
            bindingChat.tvChat.text = chatModel.messages.toString()
        }
    }

    companion object {
        private val diffUtil = object : DiffUtil.ItemCallback<ChatModel>() {
            override fun areItemsTheSame(oldItem: ChatModel, newItem: ChatModel): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: ChatModel, newItem: ChatModel): Boolean {
                return oldItem == newItem
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserChatVH {
        return UserChatVH(
            ItemChatBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: UserChatVH, position: Int) {
        holder.bind(getItem(position))
    }

}