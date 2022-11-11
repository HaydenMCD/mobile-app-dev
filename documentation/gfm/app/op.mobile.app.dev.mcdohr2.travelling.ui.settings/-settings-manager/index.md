//[app](../../../index.md)/[op.mobile.app.dev.mcdohr2.travelling.ui.settings](../index.md)/[SettingsManager](index.md)

# SettingsManager

[androidJvm]\
class [SettingsManager](index.md)(context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html))

We need a reference to the context, i.e., SettingsFragment.

## Constructors

| | |
|---|---|
| [SettingsManager](-settings-manager.md) | [androidJvm]<br>fun [SettingsManager](-settings-manager.md)(context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html)) |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [androidJvm]<br>object [Companion](-companion/index.md)<br>The companion object is used to access members of a class without creating an instance of a class. The companion object is only tied to this class. Also, you can relate a companion object to a static method. However, internally, they are very different. |

## Functions

| Name | Summary |
|---|---|
| [setUIMode](set-u-i-mode.md) | [androidJvm]<br>suspend fun [setUIMode](set-u-i-mode.md)(uiMode: [UIMode](../../op.mobile.app.dev.mcdohr2.travelling/-u-i-mode/index.md))<br>While observing, set the UIMode that is checked, i.e., this value will be based on whether or not the Switch widget is checked |

## Properties

| Name | Summary |
|---|---|
| [uiModeFlow](ui-mode-flow.md) | [androidJvm]<br>val [uiModeFlow](ui-mode-flow.md): Flow&lt;[UIMode](../../op.mobile.app.dev.mcdohr2.travelling/-u-i-mode/index.md)&gt; |
