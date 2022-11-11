//[app](../../../index.md)/[op.mobile.app.dev.mcdohr2.travelling](../index.md)/[ServiceAdapter](index.md)

# ServiceAdapter

[androidJvm]\
class [ServiceAdapter](index.md)(listener: [IOnClickListener](../-i-on-click-listener/index.md)) : [ListAdapter](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/ListAdapter.html)&lt;[Country](../-country/index.md), [ServiceAdapter.ServiceViewHolder](-service-view-holder/index.md)&gt;

## Constructors

| | |
|---|---|
| [ServiceAdapter](-service-adapter.md) | [androidJvm]<br>fun [ServiceAdapter](-service-adapter.md)(listener: [IOnClickListener](../-i-on-click-listener/index.md)) |

## Types

| Name | Summary |
|---|---|
| [DiffCallback](-diff-callback/index.md) | [androidJvm]<br>object [DiffCallback](-diff-callback/index.md) : [DiffUtil.ItemCallback](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/DiffUtil.ItemCallback.html)&lt;[Country](../-country/index.md)&gt; |
| [ServiceViewHolder](-service-view-holder/index.md) | [androidJvm]<br>inner class [ServiceViewHolder](-service-view-holder/index.md)(binding: &lt;Error class: unknown class&gt;) : [RecyclerView.ViewHolder](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/RecyclerView.ViewHolder.html), [View.OnClickListener](https://developer.android.com/reference/kotlin/android/view/View.OnClickListener.html) |

## Functions

| Name | Summary |
|---|---|
| [bindViewHolder](index.md#160826026%2FFunctions%2F-912451524) | [androidJvm]<br>fun [bindViewHolder](index.md#160826026%2FFunctions%2F-912451524)(@[NonNull](https://developer.android.com/reference/kotlin/androidx/annotation/NonNull.html)p0: [ServiceAdapter.ServiceViewHolder](-service-view-holder/index.md), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |
| [createViewHolder](index.md#1423244545%2FFunctions%2F-912451524) | [androidJvm]<br>@[NonNull](https://developer.android.com/reference/kotlin/androidx/annotation/NonNull.html)<br>fun [createViewHolder](index.md#1423244545%2FFunctions%2F-912451524)(@[NonNull](https://developer.android.com/reference/kotlin/androidx/annotation/NonNull.html)p0: [ViewGroup](https://developer.android.com/reference/kotlin/android/view/ViewGroup.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [ServiceAdapter.ServiceViewHolder](-service-view-holder/index.md) |
| [getCurrentList](index.md#-1892367752%2FFunctions%2F-912451524) | [androidJvm]<br>@[NonNull](https://developer.android.com/reference/kotlin/androidx/annotation/NonNull.html)<br>open fun [getCurrentList](index.md#-1892367752%2FFunctions%2F-912451524)(): [MutableList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)&lt;[Country](../-country/index.md)&gt; |
| [getItemCount](index.md#-543128941%2FFunctions%2F-912451524) | [androidJvm]<br>open override fun [getItemCount](index.md#-543128941%2FFunctions%2F-912451524)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [getItemId](index.md#725914875%2FFunctions%2F-912451524) | [androidJvm]<br>open fun [getItemId](index.md#725914875%2FFunctions%2F-912451524)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| [getItemViewType](index.md#714126295%2FFunctions%2F-912451524) | [androidJvm]<br>open fun [getItemViewType](index.md#714126295%2FFunctions%2F-912451524)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [hasObservers](index.md#1092162006%2FFunctions%2F-912451524) | [androidJvm]<br>fun [hasObservers](index.md#1092162006%2FFunctions%2F-912451524)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [hasStableIds](index.md#16685238%2FFunctions%2F-912451524) | [androidJvm]<br>fun [hasStableIds](index.md#16685238%2FFunctions%2F-912451524)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [notifyDataSetChanged](index.md#-1095556076%2FFunctions%2F-912451524) | [androidJvm]<br>fun [notifyDataSetChanged](index.md#-1095556076%2FFunctions%2F-912451524)() |
| [notifyItemChanged](index.md#-1721030169%2FFunctions%2F-912451524) | [androidJvm]<br>fun [notifyItemChanged](index.md#-1721030169%2FFunctions%2F-912451524)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))<br>fun [notifyItemChanged](index.md#748267402%2FFunctions%2F-912451524)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), @[Nullable](https://developer.android.com/reference/kotlin/androidx/annotation/Nullable.html)p1: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?) |
| [notifyItemInserted](index.md#2137269507%2FFunctions%2F-912451524) | [androidJvm]<br>fun [notifyItemInserted](index.md#2137269507%2FFunctions%2F-912451524)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |
| [notifyItemMoved](index.md#-1694317867%2FFunctions%2F-912451524) | [androidJvm]<br>fun [notifyItemMoved](index.md#-1694317867%2FFunctions%2F-912451524)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |
| [notifyItemRangeChanged](index.md#1769183193%2FFunctions%2F-912451524) | [androidJvm]<br>fun [notifyItemRangeChanged](index.md#1769183193%2FFunctions%2F-912451524)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))<br>fun [notifyItemRangeChanged](index.md#1916975740%2FFunctions%2F-912451524)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), @[Nullable](https://developer.android.com/reference/kotlin/androidx/annotation/Nullable.html)p2: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?) |
| [notifyItemRangeInserted](index.md#-2104748521%2FFunctions%2F-912451524) | [androidJvm]<br>fun [notifyItemRangeInserted](index.md#-2104748521%2FFunctions%2F-912451524)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |
| [notifyItemRangeRemoved](index.md#999899269%2FFunctions%2F-912451524) | [androidJvm]<br>fun [notifyItemRangeRemoved](index.md#999899269%2FFunctions%2F-912451524)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |
| [notifyItemRemoved](index.md#-189254469%2FFunctions%2F-912451524) | [androidJvm]<br>fun [notifyItemRemoved](index.md#-189254469%2FFunctions%2F-912451524)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |
| [onAttachedToRecyclerView](index.md#-1243461790%2FFunctions%2F-912451524) | [androidJvm]<br>open fun [onAttachedToRecyclerView](index.md#-1243461790%2FFunctions%2F-912451524)(@[NonNull](https://developer.android.com/reference/kotlin/androidx/annotation/NonNull.html)p0: [RecyclerView](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/RecyclerView.html)) |
| [onBindViewHolder](on-bind-view-holder.md) | [androidJvm]<br>open override fun [onBindViewHolder](on-bind-view-holder.md)(holder: [ServiceAdapter.ServiceViewHolder](-service-view-holder/index.md), position: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))<br>open fun [onBindViewHolder](index.md#-848292973%2FFunctions%2F-912451524)(@[NonNull](https://developer.android.com/reference/kotlin/androidx/annotation/NonNull.html)p0: [ServiceAdapter.ServiceViewHolder](-service-view-holder/index.md), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), @[NonNull](https://developer.android.com/reference/kotlin/androidx/annotation/NonNull.html)p2: [MutableList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)&lt;[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt;) |
| [onCreateViewHolder](on-create-view-holder.md) | [androidJvm]<br>open override fun [onCreateViewHolder](on-create-view-holder.md)(parent: [ViewGroup](https://developer.android.com/reference/kotlin/android/view/ViewGroup.html), viewType: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [ServiceAdapter.ServiceViewHolder](-service-view-holder/index.md) |
| [onCurrentListChanged](index.md#1050703874%2FFunctions%2F-912451524) | [androidJvm]<br>open fun [onCurrentListChanged](index.md#1050703874%2FFunctions%2F-912451524)(@[NonNull](https://developer.android.com/reference/kotlin/androidx/annotation/NonNull.html)p0: [MutableList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)&lt;[Country](../-country/index.md)&gt;, @[NonNull](https://developer.android.com/reference/kotlin/androidx/annotation/NonNull.html)p1: [MutableList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)&lt;[Country](../-country/index.md)&gt;) |
| [onDetachedFromRecyclerView](index.md#-1201433889%2FFunctions%2F-912451524) | [androidJvm]<br>open fun [onDetachedFromRecyclerView](index.md#-1201433889%2FFunctions%2F-912451524)(@[NonNull](https://developer.android.com/reference/kotlin/androidx/annotation/NonNull.html)p0: [RecyclerView](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/RecyclerView.html)) |
| [onFailedToRecycleView](index.md#-1548725442%2FFunctions%2F-912451524) | [androidJvm]<br>open fun [onFailedToRecycleView](index.md#-1548725442%2FFunctions%2F-912451524)(@[NonNull](https://developer.android.com/reference/kotlin/androidx/annotation/NonNull.html)p0: [ServiceAdapter.ServiceViewHolder](-service-view-holder/index.md)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [onViewAttachedToWindow](index.md#-1070733672%2FFunctions%2F-912451524) | [androidJvm]<br>open fun [onViewAttachedToWindow](index.md#-1070733672%2FFunctions%2F-912451524)(@[NonNull](https://developer.android.com/reference/kotlin/androidx/annotation/NonNull.html)p0: [ServiceAdapter.ServiceViewHolder](-service-view-holder/index.md)) |
| [onViewDetachedFromWindow](index.md#-511723243%2FFunctions%2F-912451524) | [androidJvm]<br>open fun [onViewDetachedFromWindow](index.md#-511723243%2FFunctions%2F-912451524)(@[NonNull](https://developer.android.com/reference/kotlin/androidx/annotation/NonNull.html)p0: [ServiceAdapter.ServiceViewHolder](-service-view-holder/index.md)) |
| [onViewRecycled](index.md#-270652614%2FFunctions%2F-912451524) | [androidJvm]<br>open fun [onViewRecycled](index.md#-270652614%2FFunctions%2F-912451524)(@[NonNull](https://developer.android.com/reference/kotlin/androidx/annotation/NonNull.html)p0: [ServiceAdapter.ServiceViewHolder](-service-view-holder/index.md)) |
| [registerAdapterDataObserver](index.md#-149943229%2FFunctions%2F-912451524) | [androidJvm]<br>open fun [registerAdapterDataObserver](index.md#-149943229%2FFunctions%2F-912451524)(@[NonNull](https://developer.android.com/reference/kotlin/androidx/annotation/NonNull.html)p0: [RecyclerView.AdapterDataObserver](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/RecyclerView.AdapterDataObserver.html)) |
| [setHasStableIds](index.md#1991189249%2FFunctions%2F-912451524) | [androidJvm]<br>open fun [setHasStableIds](index.md#1991189249%2FFunctions%2F-912451524)(p0: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) |
| [submitList](index.md#1676938684%2FFunctions%2F-912451524) | [androidJvm]<br>open fun [submitList](index.md#1676938684%2FFunctions%2F-912451524)(@[Nullable](https://developer.android.com/reference/kotlin/androidx/annotation/Nullable.html)p0: [MutableList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)&lt;[Country](../-country/index.md)&gt;?)<br>open fun [submitList](index.md#1853503729%2FFunctions%2F-912451524)(@[Nullable](https://developer.android.com/reference/kotlin/androidx/annotation/Nullable.html)p0: [MutableList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)&lt;[Country](../-country/index.md)&gt;?, @[Nullable](https://developer.android.com/reference/kotlin/androidx/annotation/Nullable.html)p1: [Runnable](https://developer.android.com/reference/kotlin/java/lang/Runnable.html)?) |
| [unregisterAdapterDataObserver](index.md#607934410%2FFunctions%2F-912451524) | [androidJvm]<br>open fun [unregisterAdapterDataObserver](index.md#607934410%2FFunctions%2F-912451524)(@[NonNull](https://developer.android.com/reference/kotlin/androidx/annotation/NonNull.html)p0: [RecyclerView.AdapterDataObserver](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/RecyclerView.AdapterDataObserver.html)) |