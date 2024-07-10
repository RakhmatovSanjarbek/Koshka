package cat_devs.uz.koshka.model.dto

import java.io.Serializable

data class UserModel(
    val userName: String?=null,
    val email: String?=null,
    val token: String?=null
) : Serializable
