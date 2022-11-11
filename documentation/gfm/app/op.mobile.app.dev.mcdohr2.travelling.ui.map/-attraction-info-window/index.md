//[app](../../../index.md)/[op.mobile.app.dev.mcdohr2.travelling.ui.map](../index.md)/[AttractionInfoWindow](index.md)

# AttractionInfoWindow

[androidJvm]\
class [AttractionInfoWindow](index.md)(context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html)) : GoogleMap.InfoWindowAdapter

Class implements GoogleMap.InfoWindowAdapter. This class needs a reference to a Context, i.e., MapFragment

## Constructors

| | |
|---|---|
| [AttractionInfoWindow](-attraction-info-window.md) | [androidJvm]<br>fun [AttractionInfoWindow](-attraction-info-window.md)(context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html)) |

## Functions

| Name | Summary |
|---|---|
| [getInfoContents](get-info-contents.md) | [androidJvm]<br>open override fun [getInfoContents](get-info-contents.md)(marker: Marker): [View](https://developer.android.com/reference/kotlin/android/view/View.html)?<br>Implementing member of GoogleMap.InfoWindowAdapter. We are not concerned with this. However, it provides custom content for the default info window frame of a marker |
| [getInfoWindow](get-info-window.md) | [androidJvm]<br>open override fun [getInfoWindow](get-info-window.md)(marker: Marker): [View](https://developer.android.com/reference/kotlin/android/view/View.html)<br>Implementing member of GoogleMap.InfoWindowAdapter. Provides a custom info window for a marker |
