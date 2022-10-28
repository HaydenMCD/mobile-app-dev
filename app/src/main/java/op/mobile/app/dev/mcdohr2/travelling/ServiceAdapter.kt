package op.mobile.app.dev.mcdohr2.travelling

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import op.mobile.app.dev.mcdohr2.travelling.databinding.RecyclerViewItemBinding

@BindingAdapter("list_data")
fun bindListData(recyclerView: RecyclerView, data: List<Country>?) {
    val adapter = recyclerView.adapter as ServiceAdapter
    adapter.submitList(data)
}

class ServiceAdapter(private val listener: IOnClickListener) :
    ListAdapter<Country, ServiceAdapter.ServiceViewHolder>(DiffCallback) {
    companion object DiffCallback : DiffUtil.ItemCallback<Country>() {
        override fun areItemsTheSame(
            oldItem: Country,
            newItem: Country
        ): Boolean {
            return oldItem.id == newItem.id // There might be cases where you can not compare id, i.e., an object from your API data does not contain an id field
        }

        override fun areContentsTheSame(
            oldItem: Country,
            newItem: Country
        ): Boolean {
            return oldItem == newItem
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ServiceViewHolder {
        return ServiceViewHolder(
            RecyclerViewItemBinding.inflate(
                LayoutInflater.from(
                    parent.context
                )
            )
        )
    }

    override fun onBindViewHolder(
        holder: ServiceViewHolder,
        position: Int
    ) {
        val country = getItem(position)
        holder.bind(country)
    }

    inner class ServiceViewHolder(private var binding: RecyclerViewItemBinding) :
        RecyclerView.ViewHolder(binding.root), View.OnClickListener {
        init {
            binding.root.setOnClickListener(this)
        }

        fun bind(country: Country) {
            binding.country = country
            binding.executePendingBindings()
        }

        override fun onClick(view: View) {
            val position = adapterPosition
            if (position != RecyclerView.NO_POSITION)
                listener.onItemClick(position)
        }
    }
}