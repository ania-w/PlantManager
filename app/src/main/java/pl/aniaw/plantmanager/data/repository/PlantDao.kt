package pl.aniaw.plantmanager.data.repository

import PlantDetails
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface PlantDao {

    // Insert or update a plant
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(plant: PlantDetails)

    // Get all plants
    @Query("SELECT * FROM plant_details")
    suspend fun getAllPlants(): List<PlantDetails>

    // Get a plant by ID
    @Query("SELECT * FROM plant_details WHERE id = :plantId LIMIT 1")
    suspend fun getPlantById(plantId: Int): PlantDetails?

    // Delete a plant
    @Delete
    suspend fun delete(plant: PlantDetails)

    // Delete all plants
    @Query("DELETE FROM plant_details")
    suspend fun deleteAll()
}