package cat.itb.m78.exercices

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel


@Composable
fun Screen2(navigateToScreen3: (String)-> Unit){
    var text by remember{ mutableStateOf("") }
    TextField(text, onValueChange = {text = it})
    Button(onClick = {navigateToScreen3(text)}){
        Text("Go to Screen 3")
    }
}