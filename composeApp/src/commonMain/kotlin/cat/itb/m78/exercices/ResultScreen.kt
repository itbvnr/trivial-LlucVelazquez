package cat.itb.m78.exercices

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel

@Composable
fun ResultScreen(score: Int,
    navigateToMenuScreen: ()-> Unit) {
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Your Score: $score",fontSize = 30.sp, fontWeight = FontWeight.Bold)
        Button(onClick = navigateToMenuScreen) {
            Text("Return to menu")
        }
    }

}