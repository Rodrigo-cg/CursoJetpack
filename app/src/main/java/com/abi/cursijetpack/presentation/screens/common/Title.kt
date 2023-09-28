package com.abi.cursijetpack.presentation.screens.common

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box



import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import com.abi.cursijetpack.R
import com.abi.cursijetpack.model.MediaItem
@Composable
fun Title(mediaItem: MediaItem, modifier: Modifier = Modifier){
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.secondary)
            .padding(dimensionResource(R.dimen.padding_medium16))
    ){
        Text(text = mediaItem.title,
            style= MaterialTheme.typography.bodyLarge
        )

    }

}