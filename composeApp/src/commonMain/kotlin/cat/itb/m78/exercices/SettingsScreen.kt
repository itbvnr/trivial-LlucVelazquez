package cat.itb.m78.exercices

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material3.*
import androidx.compose.ui.semantics.Role
import kotlin.math.roundToInt

@Composable
fun SettingsScreen(navigateToMenuScreen: ()-> Unit){
    var sliderPosition by remember { mutableStateOf(timer) }
    val radioOptions = listOf(5, 10, 15)
    var difficult = remember { mutableStateOf(dificultad) }
    val (selectedOption, onOptionSelected) = remember { mutableStateOf(radioOptions[0]) }
    var expanded by remember { mutableStateOf(false) }
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center){
        Row(){
            Text("Difficulty:  ")
            Button(onClick = { expanded = true }) {
                Text(difficult.value)
            }
            DropdownMenu(expanded = expanded, onDismissRequest = { expanded = false }) {
                DropdownMenuItem(
                    text = { Text("Easy") },
                    onClick = { difficult.value = "Easy"
                              expanded = false},
                    leadingIcon = { Icon(Smile, contentDescription = null) }
                )
                DropdownMenuItem(
                    text = { Text("Normal") },
                    onClick = { difficult.value = "Normal"
                              expanded = false},
                    leadingIcon = { Icon(Meh, contentDescription = null) }
                )
                DropdownMenuItem(
                    text = { Text("Hard") },
                    onClick = { difficult.value = "Hard"
                                expanded = false},
                    leadingIcon = { Icon(Frown, contentDescription = null) }
                )
                DropdownMenuItem(
                    text = { Text("Insane") },
                    onClick = { difficult.value = "Insane"
                        expanded = false},
                    leadingIcon = { Icon(Angry, contentDescription = null) }
                )
                DropdownMenuItem(
                    text = { Text("Extreme") },
                    onClick = { difficult.value = "Extreme"
                        expanded = false},
                    leadingIcon = { Icon(Skull, contentDescription = null) }
                )
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        Column(Modifier.selectableGroup()) {
            Text("Rounds: ")
            radioOptions.forEach { text ->
                Row(Modifier.selectable(
                            selected = (text == selectedOption),
                            onClick = { onOptionSelected(text) },
                            role = Role.RadioButton
                        )
                        .padding(horizontal = 16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    RadioButton(
                        selected = (text == selectedOption),
                        onClick = null
                    )
                    Text(
                        text = text.toString(),
                        modifier = Modifier.padding(start = 16.dp)
                    )
                }
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        Text("Time per round: ${sliderPosition.roundToInt()}")
        Column(modifier = Modifier.padding(horizontal = 16.dp)) {
            Slider(
                value = sliderPosition,
                onValueChange = { sliderPosition = it },
                valueRange = 1f..60f,
                onValueChangeFinished = {
                }
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = navigateToMenuScreen){
            Text("Return to menu")
            dificultad = difficult.value
            rounds = selectedOption
            timer = sliderPosition
        }
    }

}
