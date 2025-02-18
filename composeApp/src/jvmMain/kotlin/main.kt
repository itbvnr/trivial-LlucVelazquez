
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import java.awt.Dimension
import cat.itb.m78.exercices.App

fun main() = application {
    Window(
        title = "M78Exercices",
        state = rememberWindowState(width = 460.dp, height = 810.dp),
        onCloseRequest = ::exitApplication,
    ) {
        window.minimumSize = Dimension(460, 810)
        App()
    }
}

@Composable
fun AppPreview() { App() }