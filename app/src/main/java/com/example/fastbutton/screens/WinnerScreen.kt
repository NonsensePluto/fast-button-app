package com.example.fastbutton.screens

import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun WinnerScreen(color: Color) {
    Box(
        modifier = Modifier.fillMaxSize()
            .background(color)
    )
}