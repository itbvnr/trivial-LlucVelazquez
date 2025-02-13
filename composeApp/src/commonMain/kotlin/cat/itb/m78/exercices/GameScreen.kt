package cat.itb.m78.exercices

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.layout.*
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
    val preguntaAleatoria = obtenerPreguntaAleatoria()
    val preguntaMezclada = mezclarRespuestas(preguntaAleatoria)
    var num by remember { mutableStateOf(1) }
    var score by remember { mutableStateOf(0) }
    var progress by remember { mutableFloatStateOf(timer) }
    val animatedProgress by
    animateFloatAsState(
        targetValue = progress,
        animationSpec = ProgressIndicatorDefaults.ProgressAnimationSpec
    )
    LaunchedEffect(key1 = progress){
    }
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally){
        Text("Round: $num /$rounds")
        Text(preguntaMezclada.texto,fontSize = 20.sp, fontWeight = FontWeight.Bold)
        preguntaMezclada.respuestas.forEachIndexed { index, respuesta ->
            Row(verticalAlignment = Alignment.CenterVertically){
                Button(onClick = {
                    num++
                }){
                    Text("${index + 1}. ${respuesta.texto}")
                }/*
                Button(onClick = {
                    num++
                    score++
                }){
                    Text("${index + 1}. ${respuesta.texto}")
                }
            }
            Row(verticalAlignment = Alignment.CenterVertically){
                Button(onClick = {
                    num++
                }){
                    Text("${index + 1}. ${respuesta.texto}")
                }
                Button(onClick = {
                    num++
                }){
                    Text("${index + 1}. ${respuesta.texto}")
                }
            }*/
        }}

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            LinearProgressIndicator(
                progress = { animatedProgress },
            )
        }
    }
    if(num  > rounds){
        navigateToResultScreen(score)
    }
}