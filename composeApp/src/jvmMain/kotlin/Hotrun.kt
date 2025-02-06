
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import java.awt.Dimension
import cat.itb.m78.exercices.App
import org.jetbrains.compose.reload.DevelopmentEntryPoint

fun main() = application {
    Window(
        title = "M78Exercices",
        state = rememberWindowState(width = 600.dp, height = 400.dp),
        onCloseRequest = ::exitApplication,
    ) {
        window.minimumSize = Dimension(600, 400)
        DevelopmentEntryPoint {
            App()
        }
    }
}

