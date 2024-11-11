package org.meebols.app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform