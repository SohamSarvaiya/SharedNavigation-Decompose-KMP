package org.scode.shared_navigation_decompose_kmp

interface Platform {
    val name: String
}
expect fun getPlatform(): Platform