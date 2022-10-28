package op.mobile.app.dev.mcdohr2.travelling

import androidx.recyclerview.widget.RecyclerView
import op.mobile.app.dev.mcdohr2.travelling.databinding.RecyclerViewItemBinding

class ServiceViewHolder(private var binding: RecyclerViewItemBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(country: Country) {
        binding.country = country
        binding.executePendingBindings()
    }
}