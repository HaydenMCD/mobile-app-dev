package op.mobile.app.dev.mcdohr2.travelling.ui.yandex

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private const val BASE_URL = "https://translate.yandex.net/api/v1.5/tr.json/"
object YandexInstance {
    val YandexRetrofitInstance: IYandex by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        retrofit.create(IYandex::class.java)
    }
}