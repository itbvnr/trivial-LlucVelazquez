package cat.itb.m78.exercices

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel


@Composable
fun GameScreen(navigateToResultScreen: (Int)-> Unit){
    var num by remember { mutableStateOf(1) }
    var score by remember { mutableStateOf(0) }
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally){
        Text("Round: $num /10")
        Text("Cosa",fontSize = 20.sp, fontWeight = FontWeight.Bold)
        Row(verticalAlignment = Alignment.CenterVertically){
            Button(onClick = {
                num++
            }){
                Text("Answer1")
            }
            Button(onClick = {
                num++
                score++
            }){
                Text("Answer2")
            }
        }
        Row(verticalAlignment = Alignment.CenterVertically){
            Button(onClick = {
                num++
            }){
                Text("Answer3")
            }
            Button(onClick = {
                num++
            }){
                Text("Answer4")
            }
        }
        Column(horizontalAlignment = Alignment.CenterHorizontally) { LinearProgressIndicator() }
    }
    if(num  > 10){
        navigateToResultScreen(score)
    }
}