package op.mobile.app.dev.mcdohr2.travelling

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import op.mobile.app.dev.mcdohr2.travelling.databinding.RecyclerViewItemBinding
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

private const val BASE_URL = "https://gist.github.com/Hayden-McD/a1bfe0006d86446ef63775653e73f4bf/"

interface ICountry {
    @GET("raw")
    suspend fun getResponse(): List<Country>
}

object ServiceInstance {
    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val retrofitService: ICountry by lazy {
        retrofit.create(ICountry::class.java)
    }
}

enum class ServiceStatus {
    LOADING,
    ERROR,
    COMPLETE
}

@SuppressLint("SetTextI18n")
@BindingAdapter("service_status")
fun bindServiceStatus(tvStatus: TextView, status: ServiceStatus?) {
    when (status) {
        ServiceStatus.LOADING -> {
            tvStatus.visibility = View.VISIBLE
            tvStatus.text = "Loading..."
        }
        ServiceStatus.ERROR -> {
            tvStatus.visibility = View.VISIBLE
            tvStatus.text = "Connection Error"
        }
        ServiceStatus.COMPLETE -> tvStatus.visibility = View.GONE
    }
}