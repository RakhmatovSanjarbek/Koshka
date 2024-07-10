package cat_devs.uz.koshka.viewModel.chatScreenViewModel.chatAdapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import cat_devs.uz.koshka.databinding.ItemChatUsersBinding
import cat_devs.uz.koshka.model.dto.UserModel

class ChatAdapter(
    private val onClickItem: (UserModel) -> Unit,
) : ListAdapter<UserModel, ChatAdapter.ChatVH>(diffUtil) {






    inner class ChatVH(private val bindingItem: ItemChatUsersBinding) :
        RecyclerView.ViewHolder(bindingItem.root) {

        fun bind(userModel: UserModel) {
            bindingItem.userName.text = userModel.userName.toString()
            bindingItem.userMessages.text = userModel.email.toString()

            bindingItem.llUserItem.setOnClickListener {
                onClickItem(userModel)
            }
        }


    }

    companion object {
        private val diffUtil = object : DiffUtil.ItemCallback<UserModel>() {
            override fun areItemsTheSame(oldItem: UserModel, newItem: UserModel): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: UserModel, newItem: UserModel): Boolean {
                return oldItem == newItem
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatVH {
        return ChatVH(
            ItemChatUsersBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: ChatVH, position: Int) {
        holder.bind(getItem(position))
    }


}