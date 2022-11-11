//[app](../../index.md)/[op.mobile.app.dev.mcdohr2.travelling](index.md)

# Package-level declarations

## Types

| Name | Summary |
|---|---|
| [Country](-country/index.md) | [androidJvm]<br>data class [Country](-country/index.md)(val id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val attractions: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Attraction](../op.mobile.app.dev.mcdohr2.travelling.model/-attraction/index.md)&gt;, val flagImg: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |
| [ICountry](-i-country/index.md) | [androidJvm]<br>interface [ICountry](-i-country/index.md) |
| [IOnClickListener](-i-on-click-listener/index.md) | [androidJvm]<br>interface [IOnClickListener](-i-on-click-listener/index.md) |
| [MainActivity](-main-activity/index.md) | [androidJvm]<br>class [MainActivity](-main-activity/index.md) : [AppCompatActivity](https://developer.android.com/reference/kotlin/androidx/appcompat/app/AppCompatActivity.html) |
| [ServiceAdapter](-service-adapter/index.md) | [androidJvm]<br>class [ServiceAdapter](-service-adapter/index.md)(listener: [IOnClickListener](-i-on-click-listener/index.md)) : [ListAdapter](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/ListAdapter.html)&lt;[Country](-country/index.md), [ServiceAdapter.ServiceViewHolder](-service-adapter/-service-view-holder/index.md)&gt; |
| [ServiceInstance](-service-instance/index.md) | [androidJvm]<br>object [ServiceInstance](-service-instance/index.md) |
| [ServiceStatus](-service-status/index.md) | [androidJvm]<br>enum [ServiceStatus](-service-status/index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[ServiceStatus](-service-status/index.md)&gt; |
| [ServiceViewHolder](-service-view-holder/index.md) | [androidJvm]<br>class [ServiceViewHolder](-service-view-holder/index.md)(binding: &lt;Error class: unknown class&gt;) : [RecyclerView.ViewHolder](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/RecyclerView.ViewHolder.html) |
| [UIMode](-u-i-mode/index.md) | [androidJvm]<br>enum [UIMode](-u-i-mode/index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[UIMode](-u-i-mode/index.md)&gt; |

## Functions

| Name | Summary |
|---|---|
| [bindListData](bind-list-data.md) | [androidJvm]<br>fun [bindListData](bind-list-data.md)(recyclerView: [RecyclerView](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/RecyclerView.html), data: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Country](-country/index.md)&gt;?)<br>lists the data for all of the countries. |
| [bindServiceStatus](bind-service-status.md) | [androidJvm]<br>fun [bindServiceStatus](bind-service-status.md)(tvStatus: [TextView](https://developer.android.com/reference/kotlin/android/widget/TextView.html), status: [ServiceStatus](-service-status/index.md)?)<br>Getting and setting the status of the api |
| [setRoundImage](set-round-image.md) | [androidJvm]<br>fun [setRoundImage](set-round-image.md)(iv: [ImageView](https://developer.android.com/reference/kotlin/android/widget/ImageView.html), imageUrl: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>Turns an image url into an image to display on the app. |
