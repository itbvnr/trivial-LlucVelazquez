package cat.itb.m78.exercices

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.key.Key.Companion.R
import androidx.compose.ui.unit.dp
import m78exercices.composeapp.generated.resources.Res
import m78exercices.composeapp.generated.resources.images
import org.jetbrains.compose.resources.painterResource

@Composable
fun MenuScreen(navigateToGameScreen: ()-> Unit,
            navigateToSettingsScreen: ()-> Unit){
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Image(
            painter = painterResource(Res.drawable.images),
            modifier = Modifier.size(200.dp),
            contentDescription = null,
        )
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = navigateToGameScreen){
            Text("New Game")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = navigateToSettingsScreen){
            Text("Go To Settings")
        }
    }
}
