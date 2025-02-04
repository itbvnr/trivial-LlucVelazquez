package cat.itb.m78.exercices

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Screen1(navigateToScreen2: ()-> Unit,
            navigateToScreen4: ()-> Unit){
    Column(modifier = Modifier.fillMaxSize()) {
        Button(onClick = navigateToScreen2){
            Text("New Game")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = navigateToScreen4){
            Text("Go To Settings")
        }
    }
}
