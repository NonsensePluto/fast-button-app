package com.example.fastbutton.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.fastbutton.ui.theme.FastButtonTheme

@Composable
fun ButtonsScreen(
    modifier: Modifier = Modifier,
    selectedColor: (Color) -> Unit

) {

    var firstPlayerFaster = false
    var secondPlayerFaster = false


    Column {
        Surface(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth(),
            onClick = {
                firstPlayerFaster = true
                if(!secondPlayerFaster) {
                    selectedColor(Color.Red)
                }
                firstPlayerFaster = false
            },
            content = {},
            color = Color.Red
        )

        Surface(
            modifier = Modifier
                .weight(1f)
                .fillMaxSize(),
            onClick = {
                secondPlayerFaster = true
                if(!firstPlayerFaster) {
                    selectedColor(Color.Blue)
                }
                secondPlayerFaster = false
            },
            content = {},
            color = Color.Blue
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FastButtonTheme {
        ButtonsScreen(selectedColor = { Color.Red })
    }
}
