import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName

@Serializable
data class PlantDetailsResponse(
    val id: Int,
    @SerialName("common_name") val commonName: String,
    @SerialName("scientific_name") val scientificName: List<String>,
    @SerialName("other_name") val otherName: List<String>,
    val family: String?,
    val origin: String?,
    val type: String,
    val dimensions: Dimensions,
    val cycle: String,
    val watering: String,
    @SerialName("watering_general_benchmark") val wateringGeneralBenchmark: WateringBenchmark,
    @SerialName("plant_anatomy") val plantAnatomy: List<PlantAnatomy>,
    val sunlight: List<String>,
    @SerialName("pruning_month") val pruningMonth: List<String>,
    @SerialName("pruning_count") val pruningCount: PruningCount,
    val seeds: Int,
    val attracts: List<String>,
    val propagation: List<String>,
    val hardiness: Hardiness,
    @SerialName("hardiness_location") val hardinessLocation: HardinessLocation,
    val flowers: Boolean,
    @SerialName("flowering_season") val floweringSeason: String?,
    val soil: List<String>,
    @SerialName("pest_susceptibility") val pestSusceptibility: String?,
    val cones: Boolean,
    val fruits: Boolean,
    @SerialName("edible_fruit") val edibleFruit: Boolean,
    @SerialName("fruiting_season") val fruitingSeason: String?,
    @SerialName("harvest_season") val harvestSeason: String?,
    @SerialName("harvest_method") val harvestMethod: String,
    val leaf: Boolean,
    @SerialName("edible_leaf") val edibleLeaf: Boolean,
    @SerialName("growth_rate") val growthRate: String,
    val maintenance: String,
    val medicinal: Boolean,
    @SerialName("poisonous_to_humans") val poisonousToHumans: Boolean,
    @SerialName("poisonous_to_pets") val poisonousToPets: Boolean,
    @SerialName("drought_tolerant") val droughtTolerant: Boolean,
    @SerialName("salt_tolerant") val saltTolerant: Boolean,
    val thorny: Boolean,
    val invasive: Boolean,
    val rare: Boolean,
    val tropical: Boolean,
    val cuisine: Boolean,
    val indoor: Boolean,
    @SerialName("care_level") val careLevel: String,
    val description: String,
    @SerialName("default_image") val defaultImage: Image,
    @SerialName("other_images") val otherImages: List<Image>,
    @SerialName("xWateringQuality") val xWateringQuality: List<String>,
    @SerialName("xWateringPeriod") val xWateringPeriod: List<String>,
    @SerialName("xWateringAvgVolumeRequirement") val xWateringAvgVolumeRequirement: List<String>,
    @SerialName("xWateringDepthRequirement") val xWateringDepthRequirement: List<String>,
    @SerialName("xWateringBasedTemperature") val xWateringBasedTemperature: TemperatureRange,
    @SerialName("xWateringPhLevel") val xWateringPhLevel: PhLevel,
    @SerialName("xSunlightDuration") val xSunlightDuration: SunlightDuration
)

@Serializable
data class Dimensions(
    val type: String?,
    @SerialName("min_value") val minValue: Double,
    @SerialName("max_value") val maxValue: Double,
    val unit: String
)

@Serializable
data class WateringBenchmark(
    val value: String,
    val unit: String
)

@Serializable
data class PlantAnatomy(
    val part: String,
    val color: List<String>
)

@Serializable
data class PruningCount(
    val amount: Int,
    val interval: String
)

@Serializable
data class Hardiness(
    val min: String,
    val max: String
)

@Serializable
data class HardinessLocation(
    @SerialName("full_url") val fullUrl: String,
    @SerialName("full_iframe") val fullIframe: String
)

@Serializable
data class Image(
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

@Serializable
data class TemperatureRange(
    val unit: String,
    val min: Double,
    val max: Double
)

@Serializable
data class PhLevel(
    val min: Double,
    val max: Double
)

@Serializable
data class SunlightDuration(
    val min: String,
    val max: String?,
    val unit: String
)
