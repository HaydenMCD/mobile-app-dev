package op.mobile.app.dev.mcdohr2.travelling.ui.yandex

import retrofit2.http.GET
import retrofit2.http.Query
interface IYandex {
    @GET("translate?")
    suspend fun getResponse(@Query("key")key: String, @Query("text")text: String, @Query("lang")lang: String):
            Yandex
}