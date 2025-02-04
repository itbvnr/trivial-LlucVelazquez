package cat.itb.m78.exercices


import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import cat.itb.m78.exercices.theme.AppTheme
import org.jetbrains.compose.reload.DevelopmentEntryPoint
import kotlinx.serialization.Serializable

@Composable
internal fun App() = AppTheme {
    LibNavScreenSample()
}
/*@Composable
fun ManualNav() {
    val viewModel = viewModel { ManualNavAppViewModel() }
    val currentScreen = viewModel.currentScreen.value
    when (currentScreen) {
        Screen.Screen1 -> Screen1(
            navigateToScreen2 = { viewModel.navigateTo(Screen.Screen2)},
            navigateToScreen4 = { viewModel.navigateTo(Screen.Screen4) }
        )
        is Screen.Screen2 -> Screen2(
            navigateToScreen3 = { viewModel.navigateTo(Screen.Screen3(it)) }
        )
        is Screen.Screen3 -> Screen3(currentScreen.message)
        is Screen.Screen4 -> Screen4()
    }
}*/
sealed interface Screen {
    data object Screen1 : Screen
    data object Screen2 : Screen
    data object Screen4 : Screen
    data class Screen3(val message: String) : Screen
}
object Destination {
    @Serializable
    data object Screen1
    @Serializable
    data object Screen2
    @Serializable
    data object Screen4
    @Serializable
    data class Screen3(val message: String)
}
@Composable
fun LibNavScreenSample() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Destination.Screen1) {
        composable<Destination.Screen1> {
            Screen1(
                navigateToScreen2 = { navController.navigate(Destination.Screen2) },
                navigateToScreen4 = { navController.navigate(Destination.Screen4) }
            )

        }
        composable<Destination.Screen2> {
            Screen2 { navController.navigate(Destination.Screen3(it)) }
        }
        composable<Destination.Screen3> { backStack ->
            val message = backStack.toRoute<Destination.Screen3>().message
            Screen3(message)
        }
        composable<Destination.Screen4> { backStack ->}
    }
}