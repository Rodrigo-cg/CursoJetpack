package com.abi.cursijetpack.presentation.screens.main.componentes

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Android
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.abi.cursijetpack.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainAppBar(){
    TopAppBar(title = {
        Row{

            Text(text = stringResource(id = R.string.app_name))
            Spacer(modifier = Modifier.width(24.dp))
            Icon(Icons.Default.Android,contentDescription = null)
        }


    }
        , navigationIcon = {
            AppBarAction(imageVector = Icons.Default.Menu, onclick = {/*TODO*/})
        },
        actions={
            AppBarAction(imageVector = Icons.Default.Search, onclick = {/*TODO*/})
            AppBarAction(imageVector = Icons.Default.Share, onclick = {/*TODO*/})


        },
        colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color.Red)
    )
}

@Composable
private fun AppBarAction(
    imageVector: ImageVector,
    onclick:()->Unit
) {
    IconButton(onClick = onclick) {
        Icon(
            imageVector = imageVector,
            contentDescription = null
        )
    }
}