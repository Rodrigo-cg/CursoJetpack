package com.abi.cursijetpack.presentation.screens.detail

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.abi.cursijetpack.model.getMedia
import com.abi.cursijetpack.presentation.screens.common.Thumb

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(mediaId:Int){
    val mediaItem=remember{ getMedia().first{it.id==mediaId}}
    Scaffold (
        topBar={ TopAppBar(title = { Text(text = mediaItem.title)})}
    ){padding->
        Thumb(mediaItem = mediaItem, Modifier.padding(padding) )
    }
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Text(text = "Detail Screen $mediaId",
        style=MaterialTheme.typography.bodyMedium)
    }
}