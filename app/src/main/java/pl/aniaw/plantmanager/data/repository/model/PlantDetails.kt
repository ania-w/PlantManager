import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.serialization.Serializable

@Entity(tableName = "plant_details")
@Serializable
data class PlantDetails(
        @PrimaryKey(autoGenerate = true) val id: Int = 0,
        @ColumnInfo(name = "api_id") val apiId: Int,
        @ColumnInfo(name = "common_name") val commonName: String,
        @ColumnInfo(name = "scientific_name") val scientificName: List<String>,
        @ColumnInfo(name = "other_name") val otherName: List<String>,
        @ColumnInfo(name = "origin") val origin: String?,
        val type: String,
        val dimensions: Dimensions,
        val cycle: String,
        val watering: String,
        @ColumnInfo(name = "watering_general_benchmark") val wateringGeneralBenchmark: WateringBenchmark,
        @ColumnInfo(name = "plant_anatomy") val plantAnatomy: List<PlantAnatomy>,
        val sunlight: List<String>,
        @ColumnInfo(name = "pruning_month") val pruningMonth: List<String>,
        @ColumnInfo(name = "pruning_count") val pruningCount: PruningCount,
        val seeds: Int,
        val attracts: List<String>,
        val propagation: List<String>,
        val soil: List<String>,
        @ColumnInfo(name = "pest_susceptibility") val pestSusceptibility: String?,
        @ColumnInfo(name = "growth_rate") val growthRate: String,
        val maintenance: String,
        val medicinal: Boolean,
        @ColumnInfo(name = "poisonous_to_humans") val poisonousToHumans: Boolean,
        @ColumnInfo(name = "poisonous_to_pets") val poisonousToPets: Boolean,
        @ColumnInfo(name = "drought_tolerant") val droughtTolerant: Boolean,
        @ColumnInfo(name = "salt_tolerant") val saltTolerant: Boolean,
        val rare: Boolean,
        val tropical: Boolean,
        val indoor: Boolean,
        @ColumnInfo(name = "care_level") val careLevel: String,
        val description: String,
        @ColumnInfo(name = "xWateringQuality") val xWateringQuality: List<String>,
        @ColumnInfo(name = "xWateringPeriod") val xWateringPeriod: List<String>,
        @ColumnInfo(name = "xWateringAvgVolumeRequirement") val xWateringAvgVolumeRequirement: List<String>,
        @ColumnInfo(name = "xWateringDepthRequirement") val xWateringDepthRequirement: List<String>,
        @ColumnInfo(name = "xSunlightDuration") val xSunlightDuration: SunlightDuration
)
