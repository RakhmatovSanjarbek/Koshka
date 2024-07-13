package cat_devs.uz.koshka.model.repository.searchRepository.dto

data class SearchScrollModel(
    val accountName: String? = null,
    val onePhoto: Int? = null,
    val like: Boolean = false,
)
