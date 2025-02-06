package cat.itb.m78.exercices

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel

@Composable
fun SettingsScreen(navigateToMenuScreen: ()-> Unit){
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center){
        Text("Difficulty")
        Spacer(modifier = Modifier.height(20.dp))
        Text("Rounds")
        Spacer(modifier = Modifier.height(20.dp))
        Text("Time per round")
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = navigateToMenuScreen){
            Text("Return to menu")
        }
        /*<com.google.android.material.slider.Slider
        ...
        android:valueFrom="0.0"
        android:valueTo="100.0"  />*/
    }
}
