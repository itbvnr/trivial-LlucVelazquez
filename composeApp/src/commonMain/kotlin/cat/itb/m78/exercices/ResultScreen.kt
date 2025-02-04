package cat.itb.m78.exercices

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel

@Composable
fun Screen3(message: String){
    Text(message)
}
class ManualNavAppViewModel : ViewModel() {
    val currentScreen = mutableStateOf<Screen>(Screen.Screen1)
    fun navigateTo(screen: Screen) {
        currentScreen.value = screen
    }
}