package com.example.onboardingwithjetpackcompose

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun DetailScreen(navController: NavController) {
    Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()) {
        Text( modifier = Modifier.clickable {
            navController.navigate(route = Screen.HomeScreen.route){
                popUpTo(Screen.HomeScreen.route){
                    inclusive = true
                }
            }
        },
            text = "Detail Screen" ,
            fontWeight = FontWeight.Bold,
            fontSize = MaterialTheme.typography.h3.fontSize,
            color = MaterialTheme.colors.error)
    }

}

@Composable
@Preview(showBackground = true)
fun PreviewDetailScreen() {
   DetailScreen(navController = rememberNavController())
}