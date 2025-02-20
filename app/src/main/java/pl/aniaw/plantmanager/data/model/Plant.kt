package pl.aniaw.plantmanager.data.model

import java.time.LocalDate

data class Plant (
    var species: String,
    var speciesId: String,
    var dateOfPurchase: LocalDate
)
