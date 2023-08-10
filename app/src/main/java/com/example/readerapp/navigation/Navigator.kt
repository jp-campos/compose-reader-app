package com.example.readerapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.readerapp.network.Screens
import com.example.readerapp.screens.SplashScreen
import com.example.readerapp.screens.details.BookDetailsScreen
import com.example.readerapp.screens.home.HomeScreen
import com.example.readerapp.screens.search.SearchScreen

@Composable
fun Navigator() {

    val controller = rememberNavController()

    NavHost(navController = controller, startDestination = Screens.Home.name) {
        composable(Screens.Splash.name) {
            SplashScreen()
        }
        composable(Screens.Home.name) {
            HomeScreen()
        }
        composable(Screens.Details.name) {
            BookDetailsScreen()
        }
        composable(Screens.Search.name) {
            SearchScreen()
        }
    }

}