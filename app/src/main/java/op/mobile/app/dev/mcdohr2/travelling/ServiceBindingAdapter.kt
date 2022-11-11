package op.mobile.app.dev.mcdohr2.travelling

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

/**
 * lists the data for all of the countries.
 */
@BindingAdapter("list_data")
    fun bindListData(recyclerView: RecyclerView, data: List<Country>?) {
        val adapter = recyclerView.adapter as ServiceAdapter
        adapter.submitList(data)
    }

/**
 * Turns an image url into an image to display on the app.
 */
@BindingAdapter("round_image")
fun setRoundImage(iv: ImageView, imageUrl: String) {
    Glide.with(iv.context)
        .load(imageUrl)
        .apply(RequestOptions().circleCrop())
        .into(iv)
}