package pl.aniaw.plantmanager.data.remote

import PlantDetailsResponse
import pl.aniaw.plantmanager.data.remote.model.PlantListResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PlantApiService {
    @GET("species-list/")
    suspend fun getPlantList(@Query("key") key: String,
                                @Query("page") page: Int? = 1,
                                @Query("q") keywords: String? = null,
                                @Query("order") order: String? = null,
                                @Query("edible") edible: Boolean? = null,
                                @Query("poisonous ") poisonous: Boolean? = null,
                                @Query("cycle") cycle: String? = null,
                                @Query("watering") watering: String? = null,
                                @Query("sunlight") sunlight: String? = null,
                                @Query("indoor") indoor: Int? = null,
                                @Query("hardiness") hardiness: Int? = null
                                ): PlantListResponse

    @GET("species/details/{id}")
    suspend fun getPlantDetails(@Path("id") id: Int,
                                 @Query("key") key: String
                                ): PlantDetailsResponse
}