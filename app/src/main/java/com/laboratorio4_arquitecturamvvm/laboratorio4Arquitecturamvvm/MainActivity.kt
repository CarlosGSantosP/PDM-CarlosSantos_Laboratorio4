package com.laboratorio4_arquitecturamvvm.laboratorio4Arquitecturamvvm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.laboratorio4_arquitecturamvvm.laboratorio4Arquitecturamvvm.ui.theme.Laboratorio4ArquitecturaMVVMTheme
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.laboratorio4_arquitecturamvvm.laboratorio4Arquitecturamvvm.ViewModel.GeneralViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            val navController = rememberNavController()

            val viewModel: GeneralViewModel = viewModel()

            NavHost(navController = navController, startDestination = "todo_screen") {
                composable("todo_screen") {
                    TODOScreen(viewModel = viewModel)
                }
            }
        }
    }
}











