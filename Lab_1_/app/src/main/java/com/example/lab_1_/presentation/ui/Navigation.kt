package com.example.lab_1_.presentation.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(navController, startDestination = "product_list") {
        composable("product_list") { ProductListScreen() }
        composable("product_detail/{product}") { backStackEntry ->
            val product = backStackEntry.arguments?.getString("product")
            // Получите объект Product по имени или используйте ViewModel для передачи данных
            ProductListScreen(product)
        }
    }
}