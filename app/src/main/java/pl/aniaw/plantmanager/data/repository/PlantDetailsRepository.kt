package pl.aniaw.plantmanager.data.repository

import PlantDetails

class PlantRepository(private val plantDao: PlantDao) {

    suspend fun insertPlant(plant: PlantDetails) {
        plantDao.insert(plant)
    }

    suspend fun getAllPlants(): List<PlantDetails> {
        return plantDao.getAllPlants()
    }

    suspend fun getPlantById(id: Int): PlantDetails? {
        return plantDao.getPlantById(id)
    }

    suspend fun deletePlant(plant: PlantDetails) {
        plantDao.delete(plant)
    }

    suspend fun deleteAllPlants() {
        plantDao.deleteAll()
    }
}
