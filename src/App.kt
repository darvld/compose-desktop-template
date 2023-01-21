package io.github.darvld.template

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.application
import io.github.darvld.template.ui.theme.AppWindow

fun main() = application {
    AppWindow(onCloseRequest = ::exitApplication) {
        Box(Modifier.fillMaxSize()) {
            Text(text = "Hello World!", modifier = Modifier.align(Alignment.Center))
        }
    }
}