package pl.aniaw.plantmanager.model;

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SpeciesDetails (
        val id: Int,
        @SerialName("common_name") val commonName: String,
        @SerialName("scientific_name") val scientificName: List<String>,
        @SerialName("other_name") val otherName: List<String>,
        val watering: String,
        @SerialName("watering_general_benchmark") val wateringGeneralBenchmark: WateringGeneralBenchmark,
        val sunlight: List<String>,
        val soil: List<String>,
        @SerialName("harvest_season") val harvestSeason: String,
        @SerialName("harvest_method") val harvestMethod: String,
        @SerialName("growth_rate") val growthRate: String,
        val maintenance: String,
        val medicinal: Boolean,
        @SerialName("poisonous_to_humans") val poisonousToHumans: Boolean,
        @SerialName("poisonous_to_pets") val poisonousToPets: Boolean,
        @SerialName("drought_tolerant") val droughtTolerant: Boolean,
        val invasive: Boolean,
        val rare: Boolean,
        val tropical: Boolean,
        val indoor: Boolean,
        @SerialName("care_level") val careLevel: String,
        val description: String,
        val image: Image
)

@Serializable
data class WateringGeneralBenchmark (
        val value: String,
        val unit: String
)

@Serializable
data class Image (
        @SerialName("default_name") val defaultName: ImageMeta)

@Serializable
data class ImageMeta (
        @SerialName("image_id") val imageId: String,
        @SerialName("license_name")  val licenseName: String,
        @SerialName("license_url") val licenseUrl: String,
        @SerialName("original_url") val originalUrl: String,
        @SerialName("regular_url") val regularUrl: String,
        @SerialName("medium_url") val mediumUrl: String,
        @SerialName("small_url") val smallUrl: String,
        @SerialName("thumbnail") val thumbnail: String,
        val license: String
)
