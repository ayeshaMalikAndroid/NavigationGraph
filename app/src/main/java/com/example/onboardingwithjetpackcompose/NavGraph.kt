package com.example.onboardingwithjetpackcompose

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun SetUpNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screen.HomeScreen.route){
        //composable sets multiple parameters.
        composable(
            route = Screen.HomeScreen.route
        ){
            HomeScreen(navController)
        }
        composable(route= Screen.DetailScreen.route){
            DetailScreen(navController)
        }
    }
}