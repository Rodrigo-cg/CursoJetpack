package com.abi.cursijetpack.presentation.screens.main

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.abi.cursijetpack.presentation.screens.main.componentes.MainAppBar
import com.abi.cursijetpack.presentation.screens.main.componentes.MediaList

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun MainScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            MainAppBar()
        }

    ) { paddingValues ->
        MediaList(navController,modifier = Modifier.padding(paddingValues))
    }
}