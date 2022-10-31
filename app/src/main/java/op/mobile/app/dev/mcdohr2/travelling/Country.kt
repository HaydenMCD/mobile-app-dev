package op.mobile.app.dev.mcdohr2.travelling

import kotlinx.parcelize.RawValue
import op.mobile.app.dev.mcdohr2.travelling.model.Attraction

data class Country(
    val id: String,
    val name: String,
    val attractions: @RawValue List<Attraction>,
    val flagImg: String,
)