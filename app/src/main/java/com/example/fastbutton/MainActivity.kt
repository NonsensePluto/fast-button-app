package com.example.fastbutton

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.example.fastbutton.screens.ButtonsScreen
import com.example.fastbutton.ui.theme.FastButtonTheme
import androidx.compose.ui.graphics.Color
import com.example.fastbutton.screens.WinnerScreen


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FastButtonTheme {
                App()

            }
        }
    }
}

@Composable
fun App() {
    var winnerColor by remember { mutableStateOf<Color?>(null) }

    if(winnerColor == null) {
        ButtonsScreen(selectedColor = { color -> winnerColor = color })
    } else {
        BackHandler {
            winnerColor = null
        }
        WinnerScreen(winnerColor!!)
    }
}

