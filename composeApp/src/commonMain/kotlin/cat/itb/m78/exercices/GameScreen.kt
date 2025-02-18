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
import kotlinx.coroutines.delay

@Composable
fun GameScreen(navigateToResultScreen: (Int)-> Unit){
    val preguntaAleatoria = obtenerPreguntaAleatoria()
    val preguntaMezclada = mezclarRespuestas(preguntaAleatoria)
    var num by remember { mutableStateOf(1) }
    var score by remember { mutableStateOf(0) }
    var progress by remember { mutableFloatStateOf(timer/100) }
    val animatedProgress by
    animateFloatAsState(
        targetValue = progress,
        animationSpec = ProgressIndicatorDefaults.ProgressAnimationSpec
    )
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally){
        Text("Round: $num /$rounds")
        Text(preguntaMezclada.texto,fontSize = 20.sp, fontWeight = FontWeight.Bold)
        preguntaMezclada.respuestas.forEachIndexed { index, respuesta ->
            Row(verticalAlignment = Alignment.CenterVertically){
                Button(onClick = {
                    num++
                    if(respuesta.esCorrecta){
                        score++
                    }
                }){
                    Text("${index + 1}. ${respuesta.texto}")
                }
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