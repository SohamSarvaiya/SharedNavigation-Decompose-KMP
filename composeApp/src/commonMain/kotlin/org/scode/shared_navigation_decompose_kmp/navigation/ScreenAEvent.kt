package org.scode.shared_navigation_decompose_kmp.navigation

sealed interface ScreenAEvent {
    data object ClickButtonA: ScreenAEvent

    data class UpdateText(val text: String): ScreenAEvent
}