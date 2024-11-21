package com.dbng.shopingapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform