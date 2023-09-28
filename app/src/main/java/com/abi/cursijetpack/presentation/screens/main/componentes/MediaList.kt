package com.abi.cursijetpack.presentation.screens.main.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.abi.cursijetpack.R
import com.abi.cursijetpack.model.MediaItem
import com.abi.cursijetpack.model.getMedia
import com.abi.cursijetpack.presentation.screens.common.Thumb
import com.abi.cursijetpack.presentation.screens.common.Title

@Composable
fun MediaList(navController: NavHostController, modifier: Modifier = Modifier){
    /// LazyGr(
    LazyVerticalGrid(
        contentPadding = PaddingValues(dimensionResource(R.dimen.padding_xsmall)),
        columns = GridCells.Adaptive(dimensionResource(R.dimen.cell_min_width)),
        modifier = modifier
    ){
        items(getMedia()){
            MediaListItem(
                mediaItem = it,
                navController,
                Modifier.padding(4.dp)
            )
        }
    }
}
@Composable
fun MediaListItem(
    mediaItem: MediaItem,
    navController: NavHostController,
    modifier: Modifier
) {
    Column(
        modifier=modifier
            .clickable{navController.navigate("detail/${mediaItem.id}")}
    ) {
        Thumb(mediaItem = mediaItem)
        Title(mediaItem = mediaItem)
    }
}
@Preview
@Composable
fun MediaListPreview(){
    //MediaList(navController)
}