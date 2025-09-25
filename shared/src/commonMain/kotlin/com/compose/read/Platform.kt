package com.compose.read

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform