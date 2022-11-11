//[app](../../../index.md)/[op.mobile.app.dev.mcdohr2.travelling.ui.home](../index.md)/[HomeViewModel](index.md)

# HomeViewModel

[androidJvm]\
class [HomeViewModel](index.md) : [ViewModel](https://developer.android.com/reference/kotlin/androidx/lifecycle/ViewModel.html)

This class handles the live data for the home fragment.

The live data shows the status of the API data.

## Constructors

| | |
|---|---|
| [HomeViewModel](-home-view-model.md) | [androidJvm]<br>fun [HomeViewModel](-home-view-model.md)() |

## Functions

| Name | Summary |
|---|---|
| [addCloseable](index.md#264516373%2FFunctions%2F-912451524) | [androidJvm]<br>open fun [addCloseable](index.md#264516373%2FFunctions%2F-912451524)(@[NonNull](https://developer.android.com/reference/kotlin/androidx/annotation/NonNull.html)p0: [Closeable](https://developer.android.com/reference/kotlin/java/io/Closeable.html)) |

## Properties

| Name | Summary |
|---|---|
| [response](response.md) | [androidJvm]<br>val [response](response.md): [LiveData](https://developer.android.com/reference/kotlin/androidx/lifecycle/LiveData.html)&lt;[List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Country](../../op.mobile.app.dev.mcdohr2.travelling/-country/index.md)&gt;&gt; |
| [status](status.md) | [androidJvm]<br>val [status](status.md): [LiveData](https://developer.android.com/reference/kotlin/androidx/lifecycle/LiveData.html)&lt;[ServiceStatus](../../op.mobile.app.dev.mcdohr2.travelling/-service-status/index.md)&gt; |
