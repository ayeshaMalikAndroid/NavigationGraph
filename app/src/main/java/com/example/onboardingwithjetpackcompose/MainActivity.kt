package com.example.onboardingwithjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.onboardingwithjetpackcompose.ui.MyComposeAppTheme

class MainActivity : ComponentActivity() {
    lateinit var navController: NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyComposeAppTheme() {
               // Navigation()
                navController = rememberNavController()
                SetUpNavGraph(navController = navController)
            }
        }
    }
}