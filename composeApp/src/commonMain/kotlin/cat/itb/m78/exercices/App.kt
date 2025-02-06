package cat.itb.m78.exercices


import androidx.compose.runtime.*
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import cat.itb.m78.exercices.theme.AppTheme
import kotlinx.serialization.Serializable

@Composable
internal fun App() = AppTheme {
    LibNavScreenSample()
}


object Destination {
    @Serializable
    data object MenuScreen
    @Serializable
    data object GameScreen
    @Serializable
    data class ResultScreen(var score: Int)
    @Serializable
    data object SettingsScreen
}
@Composable
fun LibNavScreenSample() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Destination.MenuScreen) {
        composable<Destination.MenuScreen> {
            MenuScreen(
                navigateToGameScreen = { navController.navigate(Destination.GameScreen) },
                navigateToSettingsScreen = { navController.navigate(Destination.SettingsScreen) }
            )

        }
        composable<Destination.GameScreen> {
            GameScreen { navController.navigate(Destination.ResultScreen(it)) }
        }
        composable<Destination.ResultScreen> {
            backStack -> var score = backStack.toRoute<Destination.ResultScreen>().score
            ResultScreen(score) { navController.navigate(Destination.MenuScreen)
            }
        }
        composable<Destination.SettingsScreen> {
            SettingsScreen(
                navigateToMenuScreen = { navController.navigate(Destination.MenuScreen) }
            )
        }
    }
}