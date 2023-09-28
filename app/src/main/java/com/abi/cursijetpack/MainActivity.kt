package com.abi.cursijetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.abi.cursijetpack.presentation.MyMoviesApp
import com.abi.cursijetpack.presentation.screens.detail.DetailScreen
import com.abi.cursijetpack.presentation.screens.main.MainScreen

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController=rememberNavController()
            NavHost(navController = navController, startDestination = "main" ){
                composable("main"){
                    MainScreen(navController)
                }
                composable(route = "detail/{mediaId}",
                            arguments= listOf(
                                navArgument(name = "mediaId"){type= NavType.IntType })

                ){backStackEntry->
                    val id=backStackEntry.arguments?.getInt("mediaId")

                    requireNotNull(id)
                    DetailScreen(id)
                }
            }
            /*NavHost(navController = navController, startDestination = "main" ){
                composable("main"){
                    MainScreen
                }
            }*/

        }

}
}

//@Preview(showBackground = true)

@OptIn(ExperimentalMaterial3Api::class)
//@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun stateSample(value:String,onValueChange:(String)->Unit){
    Column(
        modifier= Modifier
            .fillMaxSize()
            .padding(64.dp),
        verticalArrangement = Arrangement.Center
    ) {
        TextField(
            value = value,
            onValueChange = { onValueChange(it) },
            modifier=Modifier.fillMaxWidth()
        )
        Text(
            text = value,
            modifier= Modifier
                .fillMaxWidth()
                .background(Color.Yellow)
                .padding(8.dp)

        )
        Button(
            onClick = { onValueChange("") },
            modifier= Modifier.fillMaxWidth(),
            enabled=value.isNotEmpty()
        ) {
            Text(text = "Clear")

        }
    }
}


//@Preview(showBackground = true, widthDp = 200, heightDp = 100)
@Composable
fun ButtonText(){
    Box(modifier =Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center

    ){
        Text(
            text = stringResource(id = R.string.agregarPills),
            fontSize = 25.sp,
            fontStyle = FontStyle.Italic,
            fontFamily = FontFamily.Monospace
        )

    }

}




/*@Preview(showBackground = true,
        name="PreviewCurso",
    widthDp = 400,
    heightDp = 200
)
@Composable
fun GreetingPreview() {
    CursiJetpackTheme {
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically

        ){
            Greeting("Android",
                    modifier = Modifier.background(Color.Cyan)
                        //.weight(2f)
                )

            Greeting("Android",
                modifier = Modifier.background(Color.Yellow)
                    //.weight(1f)
            )
            Greeting("Android",
                modifier = Modifier.background(Color.Red)
                    //.weight(5f)
            )
        }

    }
}*/
