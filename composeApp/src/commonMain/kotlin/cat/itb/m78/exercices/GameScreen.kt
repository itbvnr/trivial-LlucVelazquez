package cat.itb.m78.exercices

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel


@Composable
fun GameScreen(navigateToResultScreen: (Int)-> Unit){
    var num by remember { mutableStateOf(1) }
    var score by remember { mutableStateOf(0) }
    var progress by remember { mutableStateOf(0.1f) }
    val animatedProgress by
    animateFloatAsState(
        targetValue = progress,
        animationSpec = ProgressIndicatorDefaults.ProgressAnimationSpec
    )
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally){
        Text("Round: $num /$rounds")
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


        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            LinearProgressIndicator(
                progress = { animatedProgress },
            )
            OutlinedButton(onClick = { if (progress < 1f) progress += 0.1f }) { Text("Increase") }
        }


    }
    if(num  > 10){
        navigateToResultScreen(score)
    }
}