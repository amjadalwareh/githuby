package com.amjadalwareh.githuby

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform