package app.suhasdissa.libremusic.backend.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PipedSearchResult(
    @SerialName("items") var items: ArrayList<Items> = arrayListOf()
)

@Serializable
data class Items(
    @SerialName("url") var url: String = "",
    @SerialName("title") var title: String = "",
    @SerialName("thumbnail") var thumbnail: String = "",
    @SerialName("uploaderName") var uploaderName: String = "",
    @SerialName("duration") var duration: Int = 0
)