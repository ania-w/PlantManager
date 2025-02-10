package pl.aniaw.plantmanager.model

import java.time.LocalDate

data class Plant (
    var species: String,
    var speciesId: String,
    var dateOfPurchase: LocalDate
)
