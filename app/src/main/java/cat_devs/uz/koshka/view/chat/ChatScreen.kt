package cat_devs.uz.koshka.view.chat

import android.content.Intent
import androidx.navigation.fragment.findNavController
import cat_devs.uz.koshka.MainActivity
import cat_devs.uz.koshka.R
import cat_devs.uz.koshka.databinding.FragmentChatBinding
import cat_devs.uz.koshka.model.dto.UserModel
import cat_devs.uz.koshka.view.CommonFragment
import cat_devs.uz.koshka.viewModel.chatScreenViewModel.chatAdapter.ChatAdapter


class ChatScreen : CommonFragment<FragmentChatBinding>() {


    private var userModelDataList = listOf<UserModel>()

    private val chatAdapter by lazy {
        ChatAdapter() {
            println("::::      new object  ${it.userName}")
//            val intent = Intent(requireContext(), ChatsFragment::class.java)
//            intent.putExtra(MainActivity.KEY, it)
            findNavController().navigate(R.id.action_navigation_chat_to_chatsFragment)

        }
    }


    override fun getMyBinding(): FragmentChatBinding {
        return FragmentChatBinding.inflate(layoutInflater)
    }

    override fun setup() = with(binding) {
        userModelDataList = listOf(
            UserModel("Sukhrobjan Choriyorov", "sukhrobjan@mail.ru"),
            UserModel("Sukhrobjan ", "choriyorov@mail.ru"),
            UserModel(" Choriyorov", "sukhrob@mail.ru"),
            UserModel("Ganisher Choriyorov", "ganisher@mail.ru"),
            UserModel("Sanjarbek", "sanjarberk@mail.ru"),
            UserModel("solihjon Choriyorov", "solihjon@mail.ru"),
            UserModel("sohibjon Choriyorov", "sohinjon@mail.ru"),
            UserModel("salimjon Sohibov", "sukhrobjan@mail.ru"),
            UserModel("Sukhrobjan Solihov", "sukhrobjan@mail.ru"),
            UserModel("Sukhrobjan Choriyorov", "sukhrobjan@mail.ru"),
            UserModel("Sukhrobjan ", "choriyorov@mail.ru"),
            UserModel(" Choriyorov", "sukhrob@mail.ru"),
            UserModel("Ganisher Choriyorov", "ganisher@mail.ru"),
            UserModel("Sanjarbek", "sanjarberk@mail.ru"),
            UserModel("solihjon Choriyorov", "solihjon@mail.ru"),
            UserModel("sohibjon Choriyorov", "sohinjon@mail.ru"),
            UserModel("salimjon Sohibov", "sukhrobjan@mail.ru"),
            UserModel("Sukhrobjan Solihov", "sukhrobjan@mail.ru"),
            UserModel("Sukhrobjan Choriyorov", "sukhrobjan@mail.ru"),
            UserModel("Sukhrobjan ", "choriyorov@mail.ru"),
            UserModel(" Choriyorov", "sukhrob@mail.ru"),
            UserModel("Ganisher Choriyorov", "ganisher@mail.ru"),
            UserModel("Sanjarbek", "sanjarberk@mail.ru"),
            UserModel("solihjon Choriyorov", "solihjon@mail.ru"),
            UserModel("sohibjon Choriyorov", "sohinjon@mail.ru"),
            UserModel("salimjon Sohibov", "sukhrobjan@mail.ru"),
            UserModel("Sukhrobjan Solihov", "sukhrobjan@mail.ru"),
        )

        println("data list malumotlar ${userModelDataList}")

        rvChat.adapter = chatAdapter
        chatAdapter.submitList(userModelDataList)


        next.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_chat_to_chatsFragment)
        }


    }

}