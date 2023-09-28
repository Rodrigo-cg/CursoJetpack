package com.abi.cursijetpack.presentation

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import com.abi.cursijetpack.presentation.ui.theme.CursiJetpackTheme

@Composable
public fun MyMoviesApp(content:@Composable () -> Unit) {

    CursiJetpackTheme {
        // A surface container using the 'background' color from the theme
        Surface(
//                    modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            content()
        }
        //var (text,onValueChange )= rememberSaveable{mutableStateOf("")}

    }      //stateSample(value = text, onValueChange = onValueChange)

}