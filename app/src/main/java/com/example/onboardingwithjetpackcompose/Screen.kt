package com.example.onboardingwithjetpackcompose

sealed class Screen(val route: String) {
    object MainScreen : Screen("main_screen")
    object NextScreen : Screen("next_screen")
    object HomeScreen : Screen("home_screen")
    object DetailScreen : Screen("detail_screen")

    fun withArugs(vararg agrs: String): String {
        return buildString {
            append(route)
            agrs.forEach { agr ->
                append("/$agr")
            }
        }
    }
}