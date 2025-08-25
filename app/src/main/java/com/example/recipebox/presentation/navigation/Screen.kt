package com.example.recipebox.presentation.navigation

sealed class Screen {
    object Splash : Screen()
    object OnBoarding : Screen()
    object Home : Screen()

}