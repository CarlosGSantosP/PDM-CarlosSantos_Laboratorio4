package com.laboratorio4_arquitecturamvvm.laboratorio4Arquitecturamvvm.Navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.laboratorio4_arquitecturamvvm.laboratorio4Arquitecturamvvm.View.Greeting
import com.laboratorio4_arquitecturamvvm.laboratorio4Arquitecturamvvm.ViewModel.GeneralViewModel
import kotlinx.serialization.Serializable

@Serializable
object RutaTarea

@Serializable
object RutaLista

@Composable
fun Nav() {
    val NavController = rememberNavController()
    val viewModel: GeneralViewModel = viewModel()

    NavHost(navController = NavController, startDestination = RutaTarea) {
        composable<RutaTarea> {
            Greeting(NavController, viewModel = viewModel)
        }
    }
}