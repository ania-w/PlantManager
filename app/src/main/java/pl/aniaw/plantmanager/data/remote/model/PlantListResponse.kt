package pl.aniaw.plantmanager.data.remote.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PlantListResponse(
    val data: List<Plant>,
    val to: Int,
    val per_page: Int,
    val current_page: Int,
    val from: Int,
    val last_page: Int,
    val total: Int
)

@Serializable
data class Plant(
    val id: Int,
    @SerialName("common_name") val commonName: String,
    @SerialName("scientific_name") val scientificName: List<String>,
    @SerialName("other_name") val otherName: List<String>?,
    val family: String?,
    val hybrid: String?,
    val authority: String?,
    val subspecies: String?,
    val cultivar: String?,
    val variety: String?,
    @SerialName("species_epithet") val speciesEpithet: String?,
    val genus: String,
    @SerialName("default_image") val defaultImage: PlantImage?
)

@Serializable
data class PlantImage(
    @SerialName("image_id") val imageId: Int,
    val license: Int,
    @SerialName("license_name") val licenseName: String,
    @SerialName("license_url") val licenseUrl: String,
    @SerialName("original_url") val originalUrl: String,
    @SerialName("regular_url") val regularUrl: String,
    @SerialName("medium_url") val mediumUrl: String,
    @SerialName("small_url") val smallUrl: String,
    val thumbnail: String
)