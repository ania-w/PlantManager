package pl.aniaw.plantmanager.data.remote

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    private val retrofit by lazy {
            Retrofit.Builder()
                .baseUrl(" https://perenual.com/api/v2/")
                .addConverterFactory(GsonConverterFactory.create())
            .client(OkHttpClient.Builder().addInterceptor(HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY
    }).build()) // Logging
            .build()
        }

    val api: PlantApiService by lazy {
        retrofit.create(PlantApiService::class.java)
    }
}
