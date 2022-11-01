package op.mobile.app.dev.mcdohr2.travelling

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions


@BindingAdapter("list_data")
    fun bindListData(recyclerView: RecyclerView, data: List<Country>?) {
        val adapter = recyclerView.adapter as ServiceAdapter
        adapter.submitList(data)
    }

@BindingAdapter("round_image")
fun setRoundImage(iv: ImageView, imageUrl: String) {
    Glide.with(iv.context)
        .load(imageUrl)
        .apply(RequestOptions().circleCrop())
        .into(iv)
}