package com.example.readerapp.network

import com.example.readerapp.screens.SplashScreen

enum class Screens {
    Splash, Home, Details, Login, Search, Stats, Update;


    companion object {
        fun fromRoute(screenName: String): Screens {
            return enumValueOf<Screens>(screenName.substringAfter('/'))
        }
    }
}